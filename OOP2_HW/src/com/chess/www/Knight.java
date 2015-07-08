package com.chess.www;

public class Knight extends PlayingPiece {

	public Knight(int newX, int newY, int color) {
		super(newX, newY, color);

		if (color == COLOR_BLACK) {
			this.setSymbol(BLACK_KNIGHT);
		} else {
			this.setSymbol(WHITE_KNIGHT);
		}

	}

	@Override
	protected boolean moveIsLegal(int newX, int newY) {

		int newPositionX = newX - getX();
		int newPositionY = newY - getY();

		if (super.moveIsLegal(newX, newY)) {
			if (((Math.abs(newPositionX) == 2) && (Math.abs(newPositionY) == 1))
					|| ((Math.abs(newPositionY) == 2) && (Math
							.abs(newPositionX) == 1))
					&& isValidTrace(newX, newY)) {

				return true;
			}
		}
		return false;
	}

	public boolean isValidTrace(int newX, int newY) {

		if ((Board.board[newX][newY]) != null) {
			if (Board.board[newX][newY].getColor() == this.getColor()) {
				return false;
			}
		}
		return true;

	}
}
