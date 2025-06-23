package com.work2win.java13;

public class SampleTripleDoubleQuotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// no need to use new line escape sequence \n
		String samplejson = """
					{ name = "test",
					  age = 12;
					}
				
				""";
		System.out.println(samplejson);

	}

}
