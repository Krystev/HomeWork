package com.flappybird.www;


public class MovingObject extends GameObject{
	
	private boolean isMoving;
	private String speed = "normal";
	private int points;
	

	public MovingObject(boolean isMovin) {
		super();
		this.isMoving = isMovin;
		
	}

	public boolean isMoving() {
		return isMoving;
	}

	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public boolean isFlying(){
		return this.isMoving;
	}
	
	public void makeAPoint(){
		setPoints(getPoints() + 1);
	}
	
	public void speed(){
		System.out.println(this.speed);
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
