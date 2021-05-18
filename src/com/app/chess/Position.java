package com.app.chess;

public class Position {
	private int row;
	private int column;
	public Position(int row,int column)
	{
		this.row = row;
		this.column = column;
	}
	public int getRow() {
		return row;
	}
	public int getColumn() {
		return column;
	}
	
	@Override
	public boolean equals(Object other)
	{
		Position ot = (Position)other;
		if(this.row == ot.getRow() && this.column == ot.getColumn())
			return true;
		else
			return false;
	}
	
	@Override
	public String toString()
	{
		char row = (char)(this.getRow() + 'A');
		int column = this.getColumn()+ 1;
		return ""+row+column;
	}
	
}
