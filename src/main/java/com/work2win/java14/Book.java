package com.work2win.java14;

public record Book(String title, String author) {
	
	public static void main(String[] args) {
		Book book = new Book("3 idiots", "chetan bhagath");
		System.out.println(book);
	}

}
