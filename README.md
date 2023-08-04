# Reactive stream fundamentals.

Reactive Streams is a standard for asynchronous stream processing.

This specification is defined in the Reactive Manifesto.


# Simplify Java 9 Flow API


 
My imagination would be:

<img width="803" alt="Screenshot 2023-08-04 at 16 13 53" src="https://github.com/lebronjamesuit/reactive-stream-fundamental/assets/11584601/fd63a979-5d4f-4302-8ba3-7d8fc826781f">






![publish-subscribescheme](https://github.com/lebronjamesuit/reactive-stream-fundamental/assets/11584601/cbe9bc58-4681-46bb-9c5d-8628f7c5632a)

-Publisher : data source of potentially unbounded stream of data
 
 -Subscriber  :receiver of data from a publisher
 
 -Subscription  :think of this as session between a publisher and a subscriber
 
 -Processor: processing stage - acts as both publisher and subscriber


There are three key factors that make a stream reactive:
1. the data is processed asynchronously,

2. the backpressure mechanism is non-blocking,

3. the fact that the downstream can be slower than the upstream is somehow represented in the domain model.

  
![reactivestreams1-9](https://github.com/lebronjamesuit/reactive-stream-fundamental/assets/11584601/5f51a5f7-da24-4696-b4e5-f3527283372f)

 
