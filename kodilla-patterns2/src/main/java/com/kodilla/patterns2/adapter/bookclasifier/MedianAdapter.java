package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements BookStatistics {


    @Override
    public int averagePublicationYear(Map<BookSignature,com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books) {
        Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet = new HashSet<>();
        for (Map.Entry<BookSignature,com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> entry: books.entrySet()){
            bookSet.add(new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book(
                    entry.getValue().getAuthor(),
                    entry.getValue().getTitle(),
                    entry.getValue().getYearOfPublication(),
                    entry.getKey().getSignature()));
        }
        return publicationYearAverage(bookSet);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature,com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books) {
        Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet = new HashSet<>();
        for (Map.Entry<BookSignature,com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> entry: books.entrySet()){
            bookSet.add(new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book(
                    entry.getValue().getAuthor(),
                    entry.getValue().getTitle(),
                    entry.getValue().getYearOfPublication(),
                    entry.getKey().getSignature()));
        }
        return publicationYearMedian(bookSet);
    }
}
