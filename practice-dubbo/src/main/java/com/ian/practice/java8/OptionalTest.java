package com.ian.practice.java8;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTest {

    public static void main(String[] args) {

        Integer value1 = null;
        Integer value2 = 12;

        Optional<Integer> a = Optional.ofNullable(value1);

        Optional<Integer> b = Optional.of(value2);

        System.out.println(a.isPresent());
        System.out.println(b.isPresent());

        Integer param1 = a.orElse(0);
        Integer param2 = b.get();

        System.out.println(param1);
        System.out.println(param2);

        Stream<String> names = Stream.of("ian", "echo");

        Optional<String> myName = names.filter(name -> name.startsWith("e")).findFirst();

        System.out.println(myName.get());

        myName.ifPresent(name -> {
            String s = name.toUpperCase();
            System.out.println(s);
        });


        System.out.println(myName.map(String::toUpperCase).get());

        System.out.println(myName.map(name -> {
            return name.toUpperCase();
        }).get());
    }
}
