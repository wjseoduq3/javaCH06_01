package com.jdy.ch6_03Constructor;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car("검정", 1500);
		System.out.println(myCar.color);
		System.out.println(myCar.cc);
		
		Car myCar1 = new Car();
	}

}
