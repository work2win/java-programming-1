package com.work2win.java13;

public class SampleSwitchYield {

	enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day today = Day.WEDNESDAY;
		
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
