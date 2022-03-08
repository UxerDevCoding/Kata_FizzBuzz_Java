package com.fizzbuzz;

public class FizzBuzz {
    
    public static String getNumber(int number) {
        if((number % 5 == 0) & (number % 3 == 0)) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        if (number % 5== 0) return "Buzz";

        return Integer.toString(number);
    }

    public static String searchNumberThree(String str, int number)
    {
        for (int i = 0; i < number; i++) {
  
            if ((number % 3 == 0) && (str.charAt(i) == '3')) return "Fizz";
        }
        return "Buzz";
    }

    public static String searchNumberFive(String str, int number)
    {
        for (int i = 0; i < number; i++) {
  
            if ((number % 5 == 0) && (str.charAt(i) == '5')) return "Buzz";
            
        }
        return "Fizz";
    }
  
    public static void main(String args[])
    {
        String strOne = "534";
        String strTwo = "25";

        int lenOne = strOne.length();
        int lenTwo = strOne.length();

        System.out.println(searchNumberThree(strOne, lenOne));
        System.out.println(searchNumberFive(strTwo, lenTwo));
    }
}
