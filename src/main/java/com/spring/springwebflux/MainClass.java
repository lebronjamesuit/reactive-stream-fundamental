package com.spring.springwebflux;


import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class MainClass {

    public static void main(String[] args) throws InterruptedException {

        SubmissionPublisher<Integer> feed = new SubmissionPublisher<>();
        feed.subscribe(new Flow.Subscriber<Integer>() {

            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                this.subscription = subscription;
                this.subscription.request(2);
            }

            @Override
            public void onNext(Integer item) {
                System.out.println("Group 1 Item: " + item);

            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Group 1 ERROR" + throwable.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Group 1  Completed");
            }
        });

        for (int i = 0; i < 20; i++) {
            feed.submit(i);
        }
        System.out.println("  feed.submit(i);");

        Thread.sleep(5000);

    }


}
