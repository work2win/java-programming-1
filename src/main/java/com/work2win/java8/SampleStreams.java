package com.work2win.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleStreams {
	
	public static void main(String args[]) {
		SampleStreams obj = new SampleStreams();
		List<Stream<Integer>> streams = Arrays.asList(Stream.of(11,2,3,41,5,6,7,28,9), Stream.of(5,6,7,28,9));
		Stream<Integer> stream = Stream.of(11,2,3,41,5,6,7,28,9);
		ArrayList<Integer> al = new ArrayList<Integer>();
		Stream<Integer> randomNumbers = Stream
			      .generate(() -> (new Random()).nextInt(100));
		
		obj.method(stream);
		obj.method(randomNumbers);		
		
		al.add(2);
        al.add(6);
        al.add(9);
        al.add(4);
        al.add(20);
        obj.filtermethod(al);
        
        List<String> words = Arrays.asList("hello", "world");
        List<Integer> lengths  = words.stream().map(String::length).collect(Collectors.toList());
        System.out.println(lengths);
        
        
        
        List<List<String>> nestedLists = Arrays.asList(
        	    Arrays.asList("apple", "banana"),
        	    Arrays.asList("orange", "grape")
        	);
        
        
        List<String> flattenedList = nestedLists.stream()
                .flatMap(Collection::stream) // Flattens the stream of lists into a stream of strings
                .collect(Collectors.toList());
        System.out.println(flattenedList);
        
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);              	
        int sum = numbers.parallelStream().mapToInt(Integer::intValue).sum();        
        System.out.println(sum);
        
      
        
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        
        listOfNumbers.stream().forEach(number ->
        System.out.println(number + " " + Thread.currentThread().getName())
    );
        listOfNumbers.parallelStream().forEach(number ->
            System.out.println(number + " " + Thread.currentThread().getName())
        );
	}
	
	public void method(Stream<Integer> stream) {		
		
		//stream is designed to be a one-time use sequence of elements. Once a terminal operation (like collect(), forEach(), reduce(), etc.) is performed on a stream, the stream is considered consumed and closed.
		//enable this to get the IllegalStateException
		//stream.forEachOrdered(p -> System.out.println(p));
		stream.limit(10).forEach(System.out::println);
	}
	
	public void filtermethod(ArrayList<Integer> al) {		
		//filter the even number and put in a list
		List<Integer> list = al.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.print(list);
	}

}
