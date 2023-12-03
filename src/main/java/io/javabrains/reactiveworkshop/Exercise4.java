package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        System.out.println("Print the value from intNumberMono when it emits");
        // TODO: Write code here
        ReactiveSources.intNumberMono().subscribe(
            num -> System.out.println(num),
            err -> System.out.println(err.getMessage()),
            () -> System.out.println("complete")
        );
        
        System.out.println("Get the value from the Mono into an integer variable");
        // TODO: Write code here
        //blocking
        // Optional<Integer> number = ReactiveSources.intNumberMono().blockOptional();
        // System.out.println(number.get());

        System.out.println("Press a key to end");
        System.in.read();
    }

}
