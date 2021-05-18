package com.app.chess.piece.impl;

import java.util.ArrayList;
import java.util.List;

import com.app.chess.ChessPiece;
import com.app.chess.Constants;
import com.app.chess.Position;

public class Queen implements ChessPiece {

	@Override
	public List<Position> getPossibleMoves(int row, int column) {
		List<Position> nextMoves = new ArrayList<>();
		if(!isValidPosition(row,column))
		{
			System.out.println("Enter valid position on board");
			return nextMoves;
		}
		// Upper left side
		for(int i = row+1,j=column-1; i < Constants.BOARD_SIZE && j >= 0; i++,j--)
		{
				nextMoves.add(new Position(i,j));
		}
		// Lower right side
		for(int i = row-1,j=column+1; j < Constants.BOARD_SIZE && i >= 0; i--,j++)
		{
				nextMoves.add(new Position(i,j));
		}
		// Upper right side
		for(int i = row+1,j=column+1; j < Constants.BOARD_SIZE && i < Constants.BOARD_SIZE; i++,j++)
		{
				nextMoves.add(new Position(i,j));
		}
		// Lower left side
		for(int i = row-1,j=column-1; i >= 0 && j >= 0; i--,j--)
		{
				nextMoves.add(new Position(i,j));
		}
		
		for(int i = 0; i < Constants.BOARD_SIZE; i++)
		{
			if(row == i)
				continue;
			nextMoves.add(new Position(i,column));
		}
		
		for(int j = 0; j < Constants.BOARD_SIZE; j++)
		{
			if(column == j)
				continue;
			nextMoves.add(new Position(row,j));
		}
		
		return nextMoves;
	}

}
