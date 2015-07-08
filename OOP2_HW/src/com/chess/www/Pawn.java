package com.chess.www;

public class Pawn extends PlayingPiece {

	private boolean hasBeenMoved;

	protected Pawn(int newX, int newY, int color) {
		super(newX, newY, color);
		this.hasBeenMoved = false;

		if (color == COLOR_BLACK) {
			this.setSymbol(BLACK_PAWN);
		} else {
			this.setSymbol(WHITE_PAWN);
		}

	}

	@Override
	public boolean move(int newX, int newY) {
		if (super.move(newX, newY)) {
			this.hasBeenMoved = true;
			return true;
		}
		return false;
	}

	@Override
	protected boolean moveIsLegal(int newX, int newY) {

		boolean isLegal = false;

		int newPositionX = newX - this.getX();

		if (super.moveIsLegal(newX, newY)) {
			if ((!hasBeenMoved)
					&& (((Math.abs(newPositionX) <= 2) && getY() == newY))
					&& isValidTrace(newX, newY)) {
				isLegal = true;
			} else if ((hasBeenMoved)
					&& (((Math.abs(newPositionX) <= 1) && getY() == newY))
					&& isValidTrace(newX, newY)) {

				isLegal = true;
			}
		}
		return isLegal;
	}

	public boolean isValidTrace(int newX, int newY) {

		if (Board.board[newX][newY] == null) {
			return true;
		}
		return false;

	}

}
