package com.javaex.sunheam;

public class RactangleApp {

	public static void main(String[] args) {
		
		Ractangle r01 = new Ractangle(5, 10);
		
		RactangleList rList = new RactangleList();
		
		rList.add(r01);
		
		System.out.println(r01.toString());
		
		MyList<Ractangle> mList = new MyList<Ractangle>();
		
		mList.add(r01);
		
		System.out.println(mList.toString());
		
		System.out.println(mList.get(0).getWidth());
	
		
	}

}
