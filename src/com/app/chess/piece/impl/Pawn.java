package com.app.chess.piece.impl;

import java.util.ArrayList;
import java.util.List;

import com.app.chess.ChessPiece;
import com.app.chess.Position;

public class Pawn implements ChessPiece {

	@Override
	public List<Position> getPossibleMoves(int row, int column) {
		List<Position> nextMoves = new ArrayList<>();
		if(!isValidPosition(row,column))
		{
			System.out.println("Enter valid position on board");
			return nextMoves;
		}
		if(isValidPosition(row+1, column))
			nextMoves.add(new Position(row+1,column));
		return nextMoves;
	}

}
