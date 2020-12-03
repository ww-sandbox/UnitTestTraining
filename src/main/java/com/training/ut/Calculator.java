package com.training.ut;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class Calculator
{
    public int add(int num1, int num2){
        return num1+num2;
    }

    public double divide(int dividend, int divisor){
        if(divisor==0){
            throw new IllegalArgumentException("Nie można dzielić przez 0");
        } else{
            return dividend/divisor;
        }
    }
}
