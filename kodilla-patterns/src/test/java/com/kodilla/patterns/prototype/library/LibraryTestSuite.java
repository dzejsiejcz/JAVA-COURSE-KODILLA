package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {


    @Test
    void testGetBooks(){

        //Given
        //creating library
        Library library = new Library("empik");

        IntStream.iterate(1, n-> n+1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("title " + n, "author " +n , LocalDate.now())));

        //making a shallow copy

        Library shallowClonedLibrary = null;

        try {
            shallowClonedLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy

        Library deepClonedLibrary = null;

        try {
            deepClonedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When

        library.getBooks().remove(new Book("title 1", "author 1", LocalDate.now()));

        //Then
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);

        assertEquals(4, library.getBooks().size());
        assertEquals(4, shallowClonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());

        assertEquals(library, shallowClonedLibrary);

        assertEquals(shallowClonedLibrary.getBooks(), library.getBooks());







    }

}
