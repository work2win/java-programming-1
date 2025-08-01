package com.work2win.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SampleFileMismatch {

	public static void main(String args[]) throws IOException {
	
		Path file1 = Files.createTempFile("file1", ".txt");				
        Path file2 = Files.createTempFile("file2", ".txt");
        
     
        Files.writeString(file1, "Java 12 Features");
        Files.writeString(file2, "Java 12 Feature");
        
       long mismatch = Files.mismatch(file1, file2);
       if(mismatch == -1)
    	   System.out.println("they match");
       else
    	   System.out.println("they  dont match");
	}
}
