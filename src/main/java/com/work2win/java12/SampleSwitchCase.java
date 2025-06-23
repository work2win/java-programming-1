package com.work2win.java12;

import java.util.Scanner;

import com.work2win.util.Months;

public class SampleSwitchCase {	
	
	public static void main(String args[]) {
		
		Months m;
		System.out.println("Please enter the month");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		m = switch(num) {
		
		case 1 -> Months.JANUARY;
		case 2 -> Months.FEBRUARY;
		default -> Months.NOMONTHS;
		
		};
		
	}

}
