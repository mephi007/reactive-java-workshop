package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.Optional;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        System.out.println("Print the value from intNumberMono when it emits");
        // TODO: Write code here
        ReactiveSources.intNumberMono().subscribe(e -> System.out.println(e));
        //blocking
        Optional<Integer> number = ReactiveSources.intNumberMono().blockOptional();
        System.out.println(number.get());
        // Get the value from the Mono into an integer variable
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
