package com.chess.www;

public class Rook extends PlayingPiece {

	public Rook(int newX, int newY, int color) {
		super(newX, newY, color);

		if (color == COLOR_BLACK) {
			this.setSymbol(BLACK_ROOK);
		} else {
			this.setSymbol(WHITE_ROOK);
		}

	}

	@Override
	protected boolean moveIsLegal(int newX, int newY) {

		int checkX = this.getX();
		int checkY = this.getY();

		if (super.moveIsLegal(newX, newY)) {

			if (newX != getX() && newY == getY()) {

				while (checkX != newX) {

					if (this.isValidTraceX(checkX, newY, newX)) {
						return true;
					}

					if (checkX > newX) {
						checkX--;
					} else if (this.getX() < newX) {
						checkX++;
					}

				}

			} else if (newX == getX() && newY != getY()) {

				while (checkY != newY) {

					if (this.isValidTraceY(newX, checkY, newY)) {
						return true;
					}

					if (checkY > newY) {
						checkY--;
					} else if (this.getY() < newY) {
						checkY++;
					}

				}

			}

		}

		return false;

	}

	public boolean isValidTraceX(int newX, int newY, int lastX) {

		boolean isValid = true;
		if ((Board.board[newX][newY]) != null) {
			isValid = false;
		}
		if (((Board.board[lastX][newY]) != null)) {
			if (Board.board[lastX][newY].getColor() == this.getColor()) {
				isValid = false;
			} else {
				isValid = true;
			}
		}

		return isValid;

	}

	public boolean isValidTraceY(int newX, int newY, int lastY) {

		boolean isValid = true;
		if ((Board.board[newX][newY]) != null) {
			isValid = false;
		}
		if (((Board.board[newX][lastY]) != null)) {
			if (Board.board[newX][lastY].getColor() == this.getColor()) {
				isValid = false;
			} else {
				isValid = true;
			}
		}

		return isValid;

	}
}