package com.chess.www;

public class Board {

	public static final int COLOR_WHITE = 1;
	public static final int COLOR_BLACK = 2;

	public static PlayingPiece[][] board;
	private boolean isFirstMove;
	private int color;

	public Board() {
		this.setBoard(new PlayingPiece[8][8]);
		this.isFirstMove = true;
		this.initializePieces();

	}

	// Initialize the chess pieces
	public void initializePieces() {

		for (int i = 0; i < 8; i++) {
			board[1][i] = new Pawn(1, i, COLOR_WHITE);
		}

		for (int i = 0; i < 8; i++) {
			board[6][i] = new Pawn(6, i, COLOR_BLACK);
		}

		board[0][0] = new Rook(0, 0, COLOR_WHITE);
		board[0][7] = new Rook(0, 7, COLOR_WHITE);
		board[7][0] = new Rook(7, 0, COLOR_BLACK);
		board[7][7] = new Rook(7, 7, COLOR_BLACK);

		board[0][1] = new Knight(0, 1, COLOR_WHITE);
		board[0][6] = new Knight(0, 6, COLOR_WHITE);
		board[7][1] = new Knight(7, 1, COLOR_BLACK);
		board[7][6] = new Knight(7, 6, COLOR_BLACK);

		board[0][2] = new Officer(0, 2, COLOR_WHITE);
		board[0][5] = new Officer(0, 5, COLOR_WHITE);
		board[7][2] = new Officer(7, 2, COLOR_BLACK);
		board[7][5] = new Officer(7, 5, COLOR_BLACK);

		board[0][3] = new Queen(3, 0, COLOR_WHITE);
		board[0][4] = new King(4, 0, COLOR_WHITE);
		board[7][3] = new Queen(7, 3, COLOR_BLACK);
		board[7][4] = new King(7, 4, COLOR_BLACK);

		this.printBoard();

	}

	public boolean play(int color, int fromX, int fromY, int toX, int toY) {
		
		
		boolean isTrue = false;
		// Check if this is the first turn and only white can move
		if (isFirstMove && color == COLOR_WHITE) {
			isTrue = true;

		} else if (isFirstMove && color == COLOR_BLACK) {
			return false;
		}
		// check if player plays 2 times in a raw and if you move the piece from
		// current possition
		if (color == this.color || (toX == fromX && toY == fromY)) {
			return false;
		}

		isTrue = true;

		if (isTrue == true) {

			this.isFirstMove = false;
			// Check if player plays with his own color
			if (((board[fromX][fromY]).getColor() != color)) {
				return false;
			}
			
			
			// Check the isLegal movement of every chess piece
			if ((board[fromX][fromY]).move(toX, toY)) {
				board[toX][toY] = board[fromX][fromY];
				board[fromX][fromY] = null;
			}

			this.printBoard();

		}
		return isTrue;
	}

	public PlayingPiece[][] getBoard() {
		return board;
	}

	public void setBoard(PlayingPiece[][] board) {
		Board.board = board;
	}

	public void printBoard() {

		for (int i = 0; i < 8; i++) {

			System.out.print("  Y ");
		}

		System.out.println();

		for (int i = 0; i < 8; i++) {

			System.out.print("  " + i + " ");
		}

		System.out.println();

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {

				if (board[i][j] != null) {
					System.out.print(" | " + board[i][j].getSymbol());
				} else {

					System.out.print(" |  ");
				}

			}
			System.out.println("|" + i + " X");

		}

		System.out.println();
	}

}
