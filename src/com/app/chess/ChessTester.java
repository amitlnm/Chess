package com.app.chess;

import java.util.List;

import com.app.chess.ChessPiece.PieceType;
import com.app.chess.piece.impl.Bishop;
import com.app.chess.piece.impl.Horse;
import com.app.chess.piece.impl.King;
import com.app.chess.piece.impl.Pawn;
import com.app.chess.piece.impl.Queen;
import com.app.chess.piece.impl.Rook;

public class ChessTester {
	public static void main(String args[])
	{
		ChessPiece piece;
		String chessPiece = args[0];
		String position = args[1];
		
		if(!ChessPiece.contains(chessPiece))
		{
			System.out.println("Enter valid piece");
			return;
		}
		PieceType enumPiece = PieceType.valueOf(chessPiece);
		switch(enumPiece)
		{
			case King:
				piece = new King();
				break;
			case Queen:
				piece = new Queen();
				break;
			case Rook:
				piece = new Rook();
				break;
			case Bishop:
				piece = new Bishop();
				break;
			case Horse:
				piece = new Horse();
				break;
			default:
				piece = new Pawn();
				break;
				
		}
		int row = position.charAt(0)-'A';
		int column = Integer.parseInt(position.substring(1))-1;
		List<Position> moves = piece.getPossibleMoves(row, column);
		piece.printMoves(moves);
	}
}
