package com.work2win.java14;
public class SampleSwitchExpression {
	
	enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day today = Day.WEDNESDAY;
		
		//switch statement to be used as an expression, returning a value and simplifying the syntax, particularly for multiple case labels
		
		int numLetters = switch (today) {
		  case MONDAY, FRIDAY, SUNDAY -> { // Arrow case label
              System.out.println("It's a long day");
              yield 6; // Yield the value
          }
		  case TUESDAY -> {
		    System.out.println("It's a short day");
            yield 7;
		  }
          case THURSDAY, SATURDAY -> {
            System.out.println("It's a medium day");
            yield 8;
          }
          case WEDNESDAY -> {
            System.out.println("It's Wednesday");
            yield 9;
          }
		  default -> { // Default case is required for exhaustiveness
            throw new IllegalStateException("Invalid day: " + today);
          }
		};
		System.out.println("Number of letters in the day: " + numLetters);
	}

}


