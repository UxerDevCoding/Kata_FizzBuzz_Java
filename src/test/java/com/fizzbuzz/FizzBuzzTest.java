package com.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
    
    @Test
    public void test_fizzbuzz_example() {
        assertEquals(2, 2);
    }
  
    @Test
    public void returnNumberDivisibleByThree() {
        assertEquals("Fizz", FizzBuzz.getNumber(3));
    }
  
    @Test
    public void returnNumberDivisibleByFive() {
        assertEquals("Buzz", FizzBuzz.getNumber(5));
    }
   
    @Test
    public void returnNumberDivisibleByThreeAndFive() {
        assertEquals("FizzBuzz", FizzBuzz.getNumber(15));
    }
    
    @Test
    public void returnNumberNoDivisible() {
        assertEquals("8", FizzBuzz.getNumber(8));
    }

}
