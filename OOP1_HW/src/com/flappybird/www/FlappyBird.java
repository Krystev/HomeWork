package com.flappybird.www;
import java.awt.Color;


public class FlappyBird extends MovingObject{
	
	private Color color;
	private boolean isClicked;

	public FlappyBird(String name, int age, boolean isWinterField,
			boolean isMovin, Color newColor, boolean isFlapped) {
		super(name, age, isWinterField, isMovin);
		this.color = newColor;
		this.setClicked(isFlapped);
	}
	
	private void isScoring(){
		point();
	}
	
	public String click(){
		 String clicked = "No Flap";
		if (this.isClicked == true){
			clicked = "Flap";
		} 
		return clicked;
	}

	public void setClicked(boolean isClicked) {
		this.isClicked = isClicked;
	}
	

}
