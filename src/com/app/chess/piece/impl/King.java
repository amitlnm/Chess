package com.app.chess.piece.impl;

import java.util.ArrayList;
import java.util.List;

import com.app.chess.ChessPiece;
import com.app.chess.Position;

public class King implements ChessPiece {
	
	int [][] dirs = new int[][]{{1,0},{1,1},{0,1},{-1,1},{-1,0},{-1,-1},{0,-1},{1,-1}};
	@Override
	public List<Position> getPossibleMoves(int row, int column) {
		List<Position> nextMoves = new ArrayList<>();
		if(!isValidPosition(row,column))
		{
			System.out.println("Enter valid position on board");
			return nextMoves;
		}
		for(int [] dir: dirs)
		{
			int newRow = row + dir[0];
			int newColumn = column + dir[1];
			if(isValidPosition(newRow, newColumn))
				nextMoves.add(new Position(newRow,newColumn));
		}
		return nextMoves;
	}

}
