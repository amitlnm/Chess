package com.app.chess;

import java.util.List;

public interface ChessPiece {
	
	enum PieceType{
		King,
		Queen,
		Bishop,
		Rook,
		Horse,
		Pawn
	}
	
	static boolean contains(String pieceType)
	{
		for(PieceType type:PieceType.values())
		{
			if(type.toString().equals(pieceType))
				return true;
		}
		return false;
	}
	
	
	List<Position> getPossibleMoves(int row,int column);
	
	default boolean isValidPosition(int row,int column)
	{
		if(0 <= row && row < 8 && 0 <= column && column < 8 )
			return true;
		else 
			return false;
	}
	
	default void printMoves(List<Position> moves)
	{
		for(Position pos: moves)
		{
			System.out.print(pos+",");
		}
			
	}
}
