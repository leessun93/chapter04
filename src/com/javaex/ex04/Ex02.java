package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {


		
		//정수형 관리
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(24);
		Integer i03 = new Integer(7);		
		int i04 = 100; // 값만 넣는 언박싱형태
		Integer i05 = new Integer(13);
		Integer i06 = new Integer(17);
		
         		
		Set<Integer> iSet = new HashSet<Integer>(); //중복저장 안됨 위에 데이타 3과 7이 중복이라 갯수는 4개만 나옴
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04); //자동박싱이 된다 수시로 언박싱과 박싱이 됨
		iSet.add(i05);
		iSet.add(i06);
		
		iSet.remove(i05);
		//iSet.remove(13); 인티저의경우 이렇게 내용물로도 지우기 가능
		
		
		
		System.out.println("갯수 :" + iSet.size());
		
		for(Integer no  : iSet) {
			System.out.println(no.toString());
		}
		
		
		System.out.println(iSet.toString());
		
		System.out.println(iSet.size());
		
		//Point 관리
		Point p01 = new Point(3, 13);
		Point p02 = new Point(4, 14);
		Point p03 = new Point(5, 15);
		Point p04 = new Point(3, 13);
		
		
		Set<Point> pSet = new HashSet<Point>();
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		
		pSet.remove(p04);
		//pSet.remove(3,1); 숫자외에는 이런식으로 지우기 불가능
		
		System.out.println("갯수 :"+ pSet.size());
		
		for(Point i : pSet) {
			System.out.println(i.getX());
		}
		
		System.out.println(pSet.toString());
		
	}

}
