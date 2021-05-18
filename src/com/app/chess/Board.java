package com.app.chess;

public class Board {
   Position [][] chessBoard;
   public Board(int numOfRows,int numOfColumns)
   {
	   chessBoard = new Position[numOfRows][numOfColumns];
   }
}
