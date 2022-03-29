package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        // Given
        Set<Book> booksA = new HashSet<>();
        booksA.add(new Book("autor1", "tytul1", 1999, "AAB"));
        booksA.add(new Book("autor2", "tytul3", 2000, "AAB"));
        booksA.add(new Book("autor1", "tytul4", 2001, "AAB"));
        booksA.add(new Book("autor1", "tytul2", 2000, "AAB"));
        booksA.add(new Book("autor1", "tytul9", 2020, "AAB"));
        booksA.add(new Book("autor1", "tytul9", 1980, "AAB"));
        booksA.add(new Book("autor1", "tytul9", 2020, "AAB"));
        booksA.add(new Book("autor1", "tytul9", 2020, "AAB"));

        MedianAdapter medianAdapter = new MedianAdapter();

        // When
        int medianBook = medianAdapter.publicationYearMedian(booksA);

        // Then
        System.out.println(medianBook);
        assertEquals(medianBook, 2001);
    }
}
