package com.work2win.java12;

public class SwitchExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println(getTextBefore12(1));
	     System.out.println(getTextBefore12(3));
	     System.out.println(getTextBefore12(6));
	     System.out.println(getTextBefore12(10));
	}
	private static String getTextBefore12(int number) {
		String result = "";
	         switch (number) {
	             case 1:
	             case 2:
	                 result = "one or two";
	                 break;
	             case 3:
	                 result = "three";
	                 break;
	             case 4:
	             case 5:
	             case 6:
	                 result = "four or five or six";
	                 break;
	             default:
	                 result = "unknown";
	         };
	         return result;
	}
	
}


