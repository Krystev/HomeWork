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

		if (super.moveIsLegal(newX, newY)
				&& (((newX != getX()) && (newY == getY())) || ((newX == getX()) && (newY != getY())))) {

			return true;

		}
		return false;
	}
}
