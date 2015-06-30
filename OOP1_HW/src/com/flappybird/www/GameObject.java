package com.flappybird.www;
import java.awt.Color;



public class GameObject {
	
	private String objectName;
	private String objectType;
	private Color objectColor;
	private String backGround;
	
	
	public GameObject(String name, String object, Color color, String backGr){
		this.setObjectName(name);
		this.setObjectType(object);
		this.setObjectColor(color);
		this.setBackGround(backGr);
	}
	
	public GameObject(){
		this.setObjectName("GreenTube");
		this.setObjectType("Îbstacle");
		this.setObjectColor(Color.GREEN);
		this.setBackGround("Mountains");
	}
	
	
	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public Color getObjectColor() {
		return objectColor;
	}

	public void setObjectColor(Color objectColor) {
		this.objectColor = objectColor;
	}

	public String getBackGround() {
		return backGround;
	}

	public void setBackGround(String backGround) {
		this.backGround = backGround;
	}

	
	

}
