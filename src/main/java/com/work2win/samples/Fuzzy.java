package com.work2win.samples;

import java.util.ArrayList;

public class Fuzzy {
	
	public static void main(String args[]) {
		
		int n = 15;	
		
		ArrayList<String> res = new ArrayList<>();

		for (int i = 1; i <= n; ++i) {
      
        // Check if i is divisible by both 3 and 5
        if (i % 3 == 0 && i % 5 == 0) {
          
            // Add "FizzBuzz" to the result list
            res.add("FizzBuzz");
            System.out.println("FizzBuzz");
        }
      
        // Check if i is divisible by 3
        else if (i % 3 == 0) {
          
            // Add "Fizz" to the result list
            res.add("Fizz");
            System.out.println("Fizz");
        }
      
        // Check if i is divisible by 5
        else if (i % 5 == 0) {
          
            // Add "Buzz" to the result list
            res.add("Buzz");
            System.out.println("Buzz");
        }
        else {
          
            // Add the current number as a string to the
            // result list
            res.add(Integer.toString(i));
            System.out.println(i);
        }
	}
		
		for(String result: res) {
			//System.out.println(result);
		}

}
	
}
