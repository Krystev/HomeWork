package com.flappybird.www;



public class FlappyBird extends MovingObject{
	
	private boolean isClicked;
	private boolean isAlive;

	public FlappyBird(boolean isMovin, boolean isAlive) {
		super(isMovin);
		this.setAlive(isAlive);
		
	}
	
	public boolean isClicked() {
		return isClicked;
	}

	public String click(){
		 String clicked = "No Flap";
		if (this.isClicked == true){
			clicked = "Flap";
		} 
		return clicked;
	}
	
	public void isDead () {
		if (this.isMoving() == false) {
			this.isAlive = false;
			System.out.println("You are dead!");
		}
	}

	public void setClicked(boolean isClicked) {
		this.isClicked = isClicked;
	}


	public boolean isAlive() {
		return isAlive;
	}


	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	

}
