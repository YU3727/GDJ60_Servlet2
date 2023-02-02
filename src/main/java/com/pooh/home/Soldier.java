package com.pooh.home;

public class Soldier {
//230202 1교시 개념복습 - 군인은 총과 총알을 가지고있다.를 java로 표현해보기
	
	//클래스는 변수와 메서드로 정의 되어있음
	//변수는 
	//메서드는 행동?
	private String name;
	private Long num;
	
	//군인은 총을 가지고있으니 상속받거나 또는 멤버변수로 가지고 있어야한다
	//-> is(상속)/has(멤버변수)어 관계를 생각해본다
	//-> 군인은 총이다(x), 군인은 총을 가지고있다(o) : 멤버변수로 선언하는게 맞다.
	
	//의존성(군인은 총에 대해 의존적이다)
	private Gun gun;
	
	//주입
	public Soldier() {
		this.gun = new Gun();
	}
	
	//생성자인데 매개변수를 사용하는것
	public Soldier(Gun gun) {
		//this.gun = gun;
	}
	
	//setter
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	
	public void useGun() {
		//군인이 이 총을 사용하는데, 총의 방아쇠를 당기세요
		this.gun.trigger();
	}
	
}
