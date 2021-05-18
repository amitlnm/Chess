package com.app.chess.test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.app.chess.ChessPiece;
import com.app.chess.Position;
import com.app.chess.piece.impl.Bishop;

public class BishopTest {

	private ChessPiece piece;
	@BeforeEach
	public void setUp()
	{
		piece = new Bishop();
	}
	
	@Test
	@DisplayName("Bishop movement from Center")
	public void testBishop()
	{
		String input = "D5";
		int row = input.charAt(0)-'A';
		int column = Integer.parseInt(input.substring(1))-1;
		List<Position> actual = piece.getPossibleMoves(row, column);
		List<Position> expected = Arrays.asList(new Position(7,0),
												new Position(6,1),
												new Position(5,2),
												new Position(4,3),
												new Position(2,5),
												new Position(1,6),
												new Position(0,7),
												new Position(0,1),
												new Position(1,2),
												new Position(2,3),
												new Position(4,5),
												new Position(5,6),
												new Position(6,7));
		assertTrue(actual.size() == expected.size() && 
			    actual.containsAll(expected) && expected.containsAll(actual));
	}
	
	@Test
	@DisplayName("Bishop movement from Center")
	public void testBishopOnCorner()
	{
		String input = "H8";
		int row = input.charAt(0)-'A';
		int column = Integer.parseInt(input.substring(1))-1;
		List<Position> actual = piece.getPossibleMoves(row, column);
		List<Position> expected = Arrays.asList(new Position(0,0),
												new Position(1,1),
												new Position(2,2),
												new Position(3,3),
												new Position(4,4),
												new Position(5,5),
												new Position(6,6));
		assertTrue(actual.size() == expected.size() && 
			    actual.containsAll(expected) && expected.containsAll(actual));
	}
	
}
