package com.javaex.ex02;

public class CircleApp {

	public static void main(String[] args) {

		Circle c01 = new Circle(30);
		Circle c02 = new Circle(150);
		
		CircleList cList = new CircleList();
		
		cList.add(c01);
		cList.add(c02);
		
		System.out.println(cList.get(0).getRadius());
		System.out.println(cList.get(1).getRadius());
		System.out.println(cList.size());
		
		Circle c03 = new Circle(270);
		cList.add(c03);
		System.out.println(cList.size());
		
	
	}

}
