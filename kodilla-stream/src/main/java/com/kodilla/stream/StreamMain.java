package com.kodilla.stream;

import com.kodilla.stream.person.People;

public class StreamMain {
    public static void main(String[] args) {
        People.getList().stream()
                .forEach(System.out::println);
    }
}
