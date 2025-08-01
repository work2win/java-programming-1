package com.work2win.samples;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getRemovableIndices' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING str1
     *  2. STRING str2
     */

    public static List<Integer> getRemovableIndices(String str1, String str2) {
    // Write your code here
    
    	 List<Integer> result = new ArrayList<>();
    	    
    	    if(str1 == null || str2 == null || str1.length() != str2.length()+1){
    	        return Collections.singletonList(-1);
    	    }
    	    
    	    int m = str1.length();
    	    int n = str2.length();
    	    
    	    boolean[] prefix = new boolean[m];
    	    boolean[] suffix = new boolean[m];
    	    prefix[0] = true;
    	    
    	    for(int i =1;i <m ; i++){
    	        prefix[i] = prefix[i-1] && (str1.charAt(i-1) == str2.charAt(i-1));
    	    }
    	    
    	    suffix[m-1] = true;
    	    
    	    for(int i = m-2;i>=0;i--){
    	        suffix[i] = suffix[i+1] && (str1.charAt(i+1) ==str2.charAt(i));
    	    }
    	    
    	    for(int i =0;i <m ; i++){
    	        if(prefix[i] && suffix[i]){
    	            result.add(i);
    	        }
    	    }
    	    if(result.isEmpty())
    	        result.add(-1);
    	    return result;
    	 
    	    }

    	}