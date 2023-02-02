package com.pooh.home;

public class Gun {
//230202 1교시 개념복습 - 군인은 총과 총알을 가지고있다.를 java로 표현해보기
	
	private String company;
	private String name;
	
	//총 또한 총을 가지고 있어야한다.(has)
	//의존성(총은 총알에 대해 의존적이다)
	private Bullet bullet;
	
	//주입
	public void setBullet(Bullet bullet) {
		//어디선가 만들어진 총알을 내 총알로 받아온다
		this.bullet = bullet;
	}
	
	
	
	public void trigger() {
		//방아쇠를 당기면 총쏘는 소리가 난다
		this.bullet.sound();
	}
}
