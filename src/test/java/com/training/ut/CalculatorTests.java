package com.training.ut;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;


/**
 * Unit test for simple Calculator.
 */
public class CalculatorTests
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrueTest()
    {
        assertTrue( true );
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void sumOfIntegersReturnsProperValue(){
        //Arrange
        int x = 2;
        int y = 3;
        int expectedResult = 5;
        Calculator calculator = new Calculator();

        //Act
        int result = calculator.add(x, y);
        System.out.println("Dzielenie");
        System.out.println(calculator.divide(10,2));
        calculator.divide(10,0);


        //Assert
        Assert.assertEquals(expectedResult, result);
    }
}
