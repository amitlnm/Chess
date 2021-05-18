package com.app.chess.test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.app.chess.ChessPiece;
import com.app.chess.Position;
import com.app.chess.piece.impl.King;

public class KingTest {

	private ChessPiece piece;
	@BeforeEach
	public void setUp()
	{
		piece = new King();
	}
	
	@Test
	@DisplayName("King movement from Center")
	public void testKing()
	{
		String input = "D5";
		int row = input.charAt(0)-'A';
		int column = Integer.parseInt(input.substring(1))-1;
		List<Position> actual = piece.getPossibleMoves(row, column);
		List<Position> expected = Arrays.asList(new Position(4,5),
												new Position(3,5),
												new Position(2,5),
												new Position(2,4),
												new Position(2,3),
												new Position(3,3),
												new Position(4,3),
												new Position(4,4));
		assertTrue(actual.size() == expected.size() && 
			    actual.containsAll(expected) && expected.containsAll(actual));
	}
	
	@Test
	@DisplayName("King movement when on Corner")
	public void testKingOnCorner()
	{
		String input = "A1";
		int row = input.charAt(0)-'A';
		int column = Integer.parseInt(input.substring(1))-1;
		List<Position> actual = piece.getPossibleMoves(row, column);
		List<Position> expected = Arrays.asList(new Position(1,0),
												new Position(1,1),
												new Position(0,1));
		assertTrue(actual.size() == expected.size() && 
			    actual.containsAll(expected) && expected.containsAll(actual));
	}
	
}
