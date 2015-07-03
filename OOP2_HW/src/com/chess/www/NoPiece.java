package com.chess.www;

public class NoPiece extends PlayingPiece{
	
	private char symbol;
	
	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public NoPiece (int newX, int newY) {
		super(newX, newY);
		
		this.setSymbol(NO_PIECE);;
	}
}
