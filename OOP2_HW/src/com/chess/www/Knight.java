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

		if (super.moveIsLegal(newX, newY)
				&& (((Math.abs(newPositionX) == 2) && (Math.abs(newPositionY) == 1)) || ((Math
						.abs(newPositionY) == 2) && (Math.abs(newPositionX) == 1)))) {

			return true;
		}
		return false;
	}
}
