package com.kodilla.patterns2.aop.calculator;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static com.kodilla.patterns2.aop.calculator.Watcher.LOGGER;

@Component
@EnableAspectJAutoProxy
public class Calculator {
    public double add(double x, double y) {
        return x + y;
    }
    public double sub(double x, double y) {
        return x - y;
    }
    public double mul(double x, double y) {
        return x * y;
    }
    public double div(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Divide by zero!");
        }
        return x / y;
    }
    public BigDecimal factorial(BigDecimal n) {
        if (n.compareTo(BigDecimal.ONE) > 0) {
            return n.multiply(factorial(n.subtract(BigDecimal.ONE)));
        } else if (n.equals(BigDecimal.ONE) || n.equals(BigDecimal.ZERO)) {
            return BigDecimal.ONE;
        } else {
            throw new ArithmeticException("Factorial argument is negative!");
        }
    }
    @Around("execution(* com.kodilla.patterns2.aop.calculator.Calculator.factorial(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();                  // [1]
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();                    // [2]
            LOGGER.info("Time consumed " + (end - begin) + "[ms]");   // [3]
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());               // [4]
            throw throwable;
        }
        return result;
    }
}
