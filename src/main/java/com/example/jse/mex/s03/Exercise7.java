package com.example.jse.mex.s03;

public class Exercise7 {
    /**
     * return the input value as String
     * 
     * <p>
     * special cases:
     * 
     * <li>3, 6, ... : "Fizz"
     * <li>5, 10, ... : "Buzz"
     * <li>15, 30, ... : "FizzBuzz"
     * 
     * @param value an integer
     * @return Fizz, Buzz, or the integer as String
     */
    public static String fizzBuzz(int value) {
      StringBuilder result = new StringBuilder();
      if (value % 3 == 0) {                            //se il numero è divisibile per tre il risultato è 0
    	  result.append("Fizz");
      }
      if (value % 5 == 0) {
    	  result.append("Buzz");
      }
      if (value % 3 != 0 && value % 5 != 0) {
    	  result.append(value);
      }
      return result.toString();
    }
}
