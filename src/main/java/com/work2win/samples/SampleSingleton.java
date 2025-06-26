package com.work2win.samples;

public final class SampleSingleton {
	
	private static volatile SampleSingleton instance = new SampleSingleton();
	
	public static SampleSingleton getInstance() {
		
		if(instance == null) {
			synchronized(SampleSingleton.class) {
				if(instance == null) {
					instance = new SampleSingleton();
				}
			}
		}
		
		return instance;
	}

}
