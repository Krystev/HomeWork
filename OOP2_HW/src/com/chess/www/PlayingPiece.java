package com.chess.www;
public class PlayingPiece {
	
	public static final int COLOR_WHITE = 1;
	public static final int COLOR_BLACK = 2;
	public static final char BLACK_PAWN = '\u265F';
	public static final char BLACK_ROOK = '\u265C';
	public static final char BLACK_KNIGHT = '\u265E';
	public static final char BLACK_BISHOP = '\u265D';
	public static final char BLACK_QUEEN = '\u265B';
	public static final char BLACK_KING = '\u265A';
	public static final char WHITE_PAWN = '\u2659';
	public static final char WHITE_ROOK = '\u2656';
	public static final char WHITE_KNIGHT = '\u2658';
	public static final char WHITE_BISHOP = '\u2657';
	public static final char WHITE_QUEEN = '\u2655';
	public static final char WHITE_KING = '\u2654';
	public static final char NO_PIECE = ' ';
	
	private int x, y;
	private boolean isAlive;
	private int color;
	private char symbol;
	
	
	protected PlayingPiece (int newX, int newY, int newColor) {
		this.setX(newX);
		this.setY(newY);
		this.color = newColor;
		this.isAlive = true;
		
	}
	
	protected PlayingPiece(int newX, int newY) {
		this.setX(newX);
		this.setY(newY);
	}
	
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	protected boolean moveIsLegal (int newX, int newY) {
		boolean isLegal = false;
		
		if ((0 <= newX && newX <= 7) && (0 <= newY && newY <= 7)){
			
			isLegal = true;
		}
		return isLegal;
	}
	
	public boolean move (int newX, int newY) {
		if (moveIsLegal(newX, newY)) {
			setX(newX);
			setY(newY);
			return true;
		}
		return false;
	}

	
	public int getColor() {
		return color;
	}
	
	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	

}
