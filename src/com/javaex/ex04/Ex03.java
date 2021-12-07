package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {

		Set<Integer> lottoNo = new HashSet<Integer>();
	
		while(true) {
			//6개면 탈출
			
			if(lottoNo.size()>=6) {
				break;
			}
			int num =(int)(Math.random()*45)+1 ;
			lottoNo.add(num);
		}
		
		for(int no : lottoNo ) {
			System.out.println(no);
		}
		
		
		
	
		int[] ball = new int[6]; 
		/*
		for(int i = 0 ; i<6; i++) {
		ball[i]	 = (int)(Math.random()*45)+1 ;
		lottoNo.add(ball[i]);
		}
		
		
		System.out.println(lottoNo.toString());
		*/
	}

}
