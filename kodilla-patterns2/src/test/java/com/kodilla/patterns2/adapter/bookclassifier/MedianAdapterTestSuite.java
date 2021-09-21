package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        // Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("a","b",1,"c"));
        bookSet.add(new Book("aa","bb",11,"cc"));
        MedianAdapter medianAdapter = new MedianAdapter();
        // When
        int publicationYearMedian = medianAdapter.publicationYearMedian(bookSet);

        // Then
        System.out.println(publicationYearMedian);
        assertEquals(0, 0);


    }
}