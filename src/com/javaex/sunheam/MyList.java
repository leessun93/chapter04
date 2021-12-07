package com.javaex.sunheam;

import java.util.Arrays;

public class MyList<T> {
	
	private T[] rArray;
	private int crtPos;
	
	public MyList () {
		this.rArray = (T[])new Object[3];
		this.crtPos = 0;	
	}
	
	public void add(T l) {
		rArray[crtPos] = l;
		crtPos++;
	}
	
	public T get(int index) {
		T result = rArray[index];
		return result;
	}
	
	public int size() {
	 return crtPos; 
	 }

	@Override
	public String toString() {
		return "MyList [rArray=" + Arrays.toString(rArray) + ", crtPos=" + crtPos + "]";
	}

	
}
