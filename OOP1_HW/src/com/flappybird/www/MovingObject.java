package com.flappybird.www;
import java.awt.Color;


public class MovingObject extends GameObject{
	
	private boolean isMoving;
	private String speed = "normal";
	

	public MovingObject(String name, int age, boolean isWinterField, boolean isMovin) {
		super(name, age, isWinterField);
		this.isMoving = isMovin;
	}
	
	public boolean isFlying(){
		return this.isMoving;
	}
	
	public void speed(){
		System.out.println(this.speed);
	}

}
