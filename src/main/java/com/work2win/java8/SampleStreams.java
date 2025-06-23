package com.work2win.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleStreams {
	
	public static void main(String args[]) {
		SampleStreams obj = new SampleStreams();
		
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
		System.out.println(list);
	}

}
