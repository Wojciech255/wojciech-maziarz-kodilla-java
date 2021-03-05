package com.kodilla.exception.test;


import java.io.IOException;

public class ExceptionHandling extends Exception {
    public static void main(String[] args) throws Exception {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2, 2);
        } catch (IOException e) {
            throw new Exception();
        } finally {
            System.out.println("!!!!!!!!!");
        }
    }
}
