package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MoviesMain {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        System.out.println(movieStore.getMovies().values().stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.joining(" ! ")));
    }
}
