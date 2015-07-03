package com.chess.www;

public class King extends PlayingPiece {

	public King(int newX, int newY, int color) {
		super(newX, newY, color);

		if (color == COLOR_BLACK) {
			this.setSymbol(BLACK_KING);
		} else {
			this.setSymbol(WHITE_KING);
		}

	}

	@Override
	protected boolean moveIsLegal(int newX, int newY) {

		int newPositionX = newX - getX();
		int newPositionY = newY - getY();

		if (super.moveIsLegal(newX, newY)
				&& (((Math.abs(newPositionX) == 1) && (newY == getY())) || ((newX == getX()) && (Math
						.abs(newPositionY) == 1)))) {
			return true;

		} else if (super.moveIsLegal(newX, newY)
				&& (Math.abs(newPositionY) == 1) == (Math.abs(newPositionX) == 1)) {

			return true;
		}
		return false;
	}
}
