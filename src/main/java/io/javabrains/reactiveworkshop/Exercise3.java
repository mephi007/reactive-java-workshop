package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        System.out.println("Get all numbers in the ReactiveSources.intNumbersFlux stream");
        // into a List and print the list and its size
        // TODO: Write code here
        //blocking till all the elements are arrived and collect in stream
        List<Integer> lt = ReactiveSources.intNumbersFlux().log().toStream().toList();
        System.out.println("list is : " + lt);
        System.out.println("size : " + lt.size());

        System.out.println("Press a key to end");
        System.in.read();
    }

}
