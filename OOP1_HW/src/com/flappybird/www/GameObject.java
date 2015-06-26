package com.flappybird.www;
import java.util.Scanner;



public class GameObject {
	
	Scanner sc = new Scanner(System.in);
	private String playerName;
	private int playerAge;
	private boolean isWinterField;
	private int points = 0;
	
	
	public GameObject(String name, int age, boolean field){
		this.setPlayerName(name);
		this.playerAge = age;
		this.isWinterField = field;
	}
	public boolean isSummerField(){
		if (this.isWinterField == true){
			return false;
		} 
		return true;
	}
	public void startGame(){
		
		System.out.printf("Hello %s! Please insert \"S\" if you want to start the game!", playerName);
		String input = sc.nextLine();
		
		switch (input.toLowerCase()){
		case "s": System.out.println("You started the game!"); break;
		default: System.out.println("Your game is not started!"); break;
		}
	}
	
	public void point(){
		setPoints(getPoints() + 1);
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	

}
