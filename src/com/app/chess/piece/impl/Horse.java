package com.app.chess.piece.impl;

import java.util.ArrayList;
import java.util.List;

import com.app.chess.ChessPiece;
import com.app.chess.Position;

public class Horse implements ChessPiece {
    int [][] dirs = new int[][] {
    	{2,1},
    	{1,2},
    	{-1,2},
    	{-2,1},
    	{-2,-1},
    	{-1,-2},
    	{1,-2},
    	{2,-1}
    };
	@Override
	public List<Position> getPossibleMoves(int row, int column) {
		List<Position> nextMoves = new ArrayList<>();
		if(!isValidPosition(row,column))
		{
			System.out.println("Enter valid position on board");
			return nextMoves;
		}
		for(int []dir:dirs)
		{
			int i = row + dir[0];
			int j = column + dir[1];
			if(isValidPosition(i, j))
				nextMoves.add(new Position(i,j));
			
		}
		return nextMoves;
	}

}
