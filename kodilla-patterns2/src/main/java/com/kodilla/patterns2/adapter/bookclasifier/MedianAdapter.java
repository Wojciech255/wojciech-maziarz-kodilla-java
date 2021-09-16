package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        List<Book> bookList = new ArrayList<>();
        for (int n = 0; n < bookSet.size(); n++) {
            bookList.add(new Book("a","a",1222,"12e"));
            bookList.add(new Book("b","b",123,"123a"));
        }
       // return publicationYearMedian(bookList) ;
        //
        return 1;
    }
}
