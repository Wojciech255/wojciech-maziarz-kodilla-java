package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        // 7.1
        Processor processor = new Processor();
        // 1 krok :ExecuteSaySomething executeSaySomething = new  ExecuteSaySomething();
        // 2 krok : Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(() -> System.out.println("This is an example text."));
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(() -> System.out.println("This is an example text"));
        poemBeautifier.beautify(() -> System.out.println("abc".toUpperCase()));
        poemBeautifier.beautify(() -> System.out.println("XYZ".toLowerCase()));
        poemBeautifier.beautify(() -> System.out.println("Is no Empty ! ! ! ".isEmpty()));
        poemBeautifier.beautify(() -> System.out.println("".isBlank()));


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        //  Operacje filtrujące na Stream
        System.out.println();
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);
        // 7.3
        /* System.out.println();
        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);
        */

        //Kolektor Collectors.toList() i Kolektor Collectors.toMap()
        /*
        BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

         */
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);

        // zad 7.3
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfBooks = theForum.getTheUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.now().minusYears(20L)))
                .filter(forumUser -> forumUser.getNumberOfPost() > 1)
                .collect(Collectors.toMap(ForumUser::getiD, forumUser -> forumUser));

        theResultMapOfBooks.entrySet().stream()
                .forEach(System.out::println);

        // 7.4
        // World world = new World();
        // world.getContinentList().stream()
        //        .flatMap(continent -> continent.getCountryList().stream())
        //        .forEach(System.out::println);
        /////
    }
}
