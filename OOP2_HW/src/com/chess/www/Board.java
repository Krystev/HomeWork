package com.chess.www;

public class Board {

	public static final int COLOR_WHITE = 1;
	public static final int COLOR_BLACK = 2;

	private PlayingPiece[][] board = new PlayingPiece[8][8];
	private boolean isFirstMove;
	private int color;
	

	public Board() {

		this.isFirstMove = true;
		
		
	}
	
	public PlayingPiece[][] getBoard() {
		return board;
	}

	public void setBoard(PlayingPiece[][] board) {
		this.board = board;
	}

	public void initializePieces () {
		
		for (int i = 0; i < 8; i++) {
			board[i][1] = new Pawn(i, 1, COLOR_WHITE);
		}
		
		for (int i = 0; i < 8; i++) {
			board[i][6] = new Pawn(i, 6, COLOR_BLACK);
		}
		
	}

	public boolean play(int color, int fromX, int fromY, int toX, int toY) {

		if (isFirstMove && color == COLOR_WHITE) {
			return true;

		} else if (isFirstMove && color == COLOR_BLACK) {
			return false;
		}

		if (color == this.color || (toX == fromX && toY == fromY)) {
			return false;
		}
		
		if (board[toX][toY] != null) {
			this.board[toX][toY].setAlive(false);
		}

		this.isFirstMove = false;
		
		return true;
	}
	
	

}
