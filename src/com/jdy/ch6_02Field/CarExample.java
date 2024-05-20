package com.jdy.ch6_02Field;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);  // 초기값 0이 default로 설정
		
		myCar.speed = 60;
		System.out.println(myCar.speed);
	}

}
