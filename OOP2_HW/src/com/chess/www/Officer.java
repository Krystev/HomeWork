package com.chess.www;

public class Officer extends PlayingPiece {

	public Officer(int newX, int newY, int color) {
		super(newX, newY, color);

		if (color == COLOR_BLACK) {
			this.setSymbol(BLACK_BISHOP);
		} else {
			this.setSymbol(WHITE_BISHOP);
		}

	}

	@Override
	protected boolean moveIsLegal(int newX, int newY) {

		int newPositionX = newX - getX();
		int newPositionY = newY - getY();

		int checkX = this.getX();
		int checkY = this.getY();

		if (super.moveIsLegal(newX, newY)
				&& (Math.abs(newPositionX) == Math.abs(newPositionY))) {

			while (checkX != newX && checkY != newY) {

				if (this.isValidTrace(checkX, checkY, newX, newY)) {
					return true;
				}

				if (checkX > newX) {
					checkX--;
				} else if (this.getX() < newX) {
					checkX++;
				}

				if (checkY > newY) {
					checkY--;
				} else if (this.getY() < newY) {
					checkY++;
				}

			}
		}

		return false;
	}

	public boolean isValidTrace(int newX, int newY, int lastX, int lastY) {

		boolean isValid = true;
		if ((Board.board[newX][newY]) != null) {
			isValid = false;
		}
		if (((Board.board[lastX][lastY]) != null)) {
			if (Board.board[lastX][lastY].getColor() == this.getColor()) {
				isValid = false;
			} else {
				isValid = true;
			}
		}

		return isValid;

	}

}
