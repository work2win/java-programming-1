package com.work2win.java11;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class LambdaVariables{
	
	//mostly used on functionalInterface & stream processing
	
	public static void main(String[] args) {
		
		int a = 5;
		
		int temp = 1;
        IntStream.rangeClosed(1, 5).forEach(i -> {
            System.out.println("value of temp is = " + temp);
        });
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach( (n) -> { System.out.println(n); } );
	    
	    Calculate c = (int x) -> x * x;
	    int ans = c.square(a);
	    System.out.println(ans);
	    
	    
	}

}
