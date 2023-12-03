package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.concurrent.Flow.Subscription;

import reactor.core.publisher.BaseSubscriber;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberFlux() and ReactiveSources.userMono()

        System.out.println("Subscribe to a flux using the error and completion hooks");
        // TODO: Write code here
        // ReactiveSources.intNumbersFlux().subscribe(
        //     num -> System.out.println(num), 
        //     err -> System.out.println(err.getMessage()),
        //     () -> System.out.println("complete")
        // );

        System.out.println("Subscribe to a flux using an implementation of BaseSubscriber");
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<>());
    

        System.out.println("Press a key to end");
        System.in.read();
        
    }

}

class MySubscriber<T> extends BaseSubscriber<T>{
    
    protected void hookOnSubscribe(Subscription subscription){
        System.out.println("Subscribe happened");
        // request(2);
    }

    public void hookOnNext(T value){
        System.out.println(value.toString() + " received");
    }
}