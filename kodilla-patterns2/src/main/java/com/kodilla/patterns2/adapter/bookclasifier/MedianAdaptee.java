package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;

import java.util.Set;

public class MedianAdaptee implements Classifier {


    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        return 0;
    }

    @Override
    public int publicationYearAverage(Set<Book> bookSet) {
        return 0;
    }
}
