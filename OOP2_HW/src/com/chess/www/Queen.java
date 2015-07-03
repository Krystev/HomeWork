package com.chess.www;

public class Queen extends PlayingPiece {

	public Queen(int newX, int newY, int color) {
		super(newX, newY, color);

		if (color == COLOR_BLACK) {
			this.setSymbol(BLACK_QUEEN);
		} else {
			this.setSymbol(WHITE_QUEEN);
		}

	}

	@Override
	protected boolean moveIsLegal(int newX, int newY) {

		int newPositionX = newX - getX();
		int newPositionY = newY - getY();

		if (super.moveIsLegal(newX, newY)
				&& (((newX != getX()) && (newY == getY())) || ((newX == getX()) && (newY != getY())))) {
			return true;

		} else if (super.moveIsLegal(newX, newY)
				&& (Math.abs(newPositionX) == Math.abs(newPositionY))) {

			return true;
		}
		return false;
	}
}
