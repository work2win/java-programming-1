package com.work2win.java11;

import java.util.stream.Stream;

public class SampleStringMeths {

	public static void main(String[] args) {
	
		
		 	String textWithWhitespace = "  \t Hello, Java 11! \n  First line\nSecond line\r\nThird line";
		 	
	        String strippedText = textWithWhitespace.strip();
	       
	        System.out.println("Original String: '" + textWithWhitespace + "'");	        
	        System.out.println("Stripped String: '" + strippedText + "'");
	        
	        //lines() in string 
	        Stream<String> lineStream = textWithWhitespace.lines();
	        lineStream.forEach(System.out::println);
	}

}
