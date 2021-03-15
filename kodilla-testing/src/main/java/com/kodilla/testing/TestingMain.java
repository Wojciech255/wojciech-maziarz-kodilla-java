package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main() {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error !!!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator simpleCalculator = new Calculator();
        int result1 = simpleCalculator.add(5, 5);
        int result2 = simpleCalculator.subtract(5, 5);
        System.out.println(result1);
        System.out.println(result2);


        if (result1 != 10) {
            System.out.println("Error ! ! ! !");
        } else {
            System.out.println("Test add OK");
        }
        if (result2 != 0) {
            System.out.println("Error ! ! ! ! ! ! !");
        } else {
            System.out.println("Test subtract OK");
        }
    }
}
