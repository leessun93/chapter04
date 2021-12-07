package com.javaex.sunheam;

import java.util.Arrays;

public class RactangleList {
	private Ractangle[] rArray;
	private int crtPos;
	
	public RactangleList () {
		this.rArray = new Ractangle[3];
		this.crtPos = 0;	
	}
	
	public void add(Ractangle l) {
		rArray[crtPos] = l;
		crtPos++;
	}
	
	public Ractangle get(int index) {
		Ractangle result = rArray[index];
		return result;
	}
	
	public int size() {
	 return crtPos; 
	 }

	@Override
	public String toString() {
		return "RactangleList [rArray=" + Arrays.toString(rArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	

}
