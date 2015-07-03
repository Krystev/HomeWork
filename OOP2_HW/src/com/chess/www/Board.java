package com.chess.www;

public class Board {

	public static final int COLOR_WHITE = 1;
	public static final int COLOR_BLACK = 2;

	PlayingPiece[][] board;
	private boolean isFirstMove;
	private int color;
	
	public Board() {
		this.setBoard(new PlayingPiece[8][8]);
		this.isFirstMove = true;
		this.initializePieces();
		
		
	}
	
	public void initializePieces () {
		
		for (int i = 0; i < 8; i++) {
			board[i][1] = new Pawn(i, 1, COLOR_WHITE);
		}
		
		for (int i = 0; i < 8; i++) {
			board[i][6] = new Pawn(i, 6, COLOR_BLACK);
		}
		
			board[0][0] = new Rook(0, 0, COLOR_WHITE);
			board[7][0] = new Rook(7, 0, COLOR_WHITE);
			board[0][7] = new Rook(0, 7, COLOR_BLACK);
			board[7][7] = new Rook(7, 7, COLOR_BLACK);
			
			board[1][0] = new Knight(1, 0, COLOR_WHITE);
			board[6][0] = new Knight(6, 0, COLOR_WHITE);
			board[1][7] = new Knight(1, 7, COLOR_BLACK);
			board[6][7] = new Knight(6, 7, COLOR_BLACK);
			
			board[2][0] = new Officer(2, 0, COLOR_WHITE);
			board[5][0] = new Officer(5, 0, COLOR_WHITE);
			board[2][7] = new Officer(2, 7, COLOR_BLACK);
			board[5][7] = new Officer(5, 7, COLOR_BLACK);
			
			board[3][0] = new Queen(3, 0, COLOR_WHITE);
			board[4][0] = new King(4, 0, COLOR_WHITE);
			board[3][7] = new Queen(3, 7, COLOR_BLACK);
			board[4][7] = new King(4, 7, COLOR_BLACK);
			
			for (int i = 2; i < 6; i++) {
				for (int j = 2; j < 6; j++) {
					board[i][j] = new NoPiece(i, j);
				}
			}
			
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					System.out.println("|" + board[i][j].getSymbol() + "|");
				}
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
		
		board[toX][toY] = board[fromX][fromY];
		board[fromX][fromY] = null;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.println("|" + board[i][j].getSymbol() + "|");
			}
		}
		
		return true;
	}
	
	
	public PlayingPiece[][] getBoard() {
		return board;
	}

	public void setBoard(PlayingPiece[][] board) {
		this.board = board;
	}
	

}
