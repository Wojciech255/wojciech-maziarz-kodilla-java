package com.kodilla.exception.test;


import java.io.IOException;

public class ExceptionHandling extends Exception {
    public static void main(String[] args) throws IOException {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2, 2);
        } catch (Exception e) {
            throw new IOException();
        } finally {
            System.out.println("!!!!!!!!!");
        }
    }
}
