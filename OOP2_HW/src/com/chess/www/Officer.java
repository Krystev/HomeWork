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

		if (super.moveIsLegal(newX, newY)
				&& (Math.abs(newPositionX) == Math.abs(newPositionY))) {

			return true;
		}
		return false;
	}

}
