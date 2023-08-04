# reactive-stream-fundamental

Reactive Streams is a standard for asynchronous stream processing with non-blocking back pressure. 

This specification is defined in the Reactive Manifesto, and there are various implementations of it,

for example, RxJava or Akka-Streams.
Java 9 has adopt the reactive stream in Flow class.



![publish-subscribescheme](https://github.com/lebronjamesuit/reactive-stream-fundamental/assets/11584601/cbe9bc58-4681-46bb-9c5d-8628f7c5632a)

There are three key factors that make a stream reactive:
- the data is processed asynchronously,

- the backpressure mechanism is non-blocking,

- the fact that the downstream can be slower than the upstream is somehow represented in the domain model.

  
![reactivestreams1-9](https://github.com/lebronjamesuit/reactive-stream-fundamental/assets/11584601/5f51a5f7-da24-4696-b4e5-f3527283372f)


# Simplify Java 9 Flow API

 -Publisher : data source of potentially unbounded stream of data
 
 -Subscriber  :receiver of data from a publisher
 
 -Subscription  :think of this as session between a publisher and a subscriber
 
 -Processor: processing stage - acts as both publisher and subscriber
 
