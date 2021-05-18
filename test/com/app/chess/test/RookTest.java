package com.app.chess.test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.app.chess.ChessPiece;
import com.app.chess.Position;
import com.app.chess.piece.impl.Rook;

public class RookTest {

	private ChessPiece piece;
	@BeforeEach
	public void setUp()
	{
		piece = new Rook();
	}
	
	@Test
	@DisplayName("Rook movement")
	public void testRook()
	{
		String input = "D5";
		int row = input.charAt(0)-'A';
		int column = Integer.parseInt(input.substring(1))-1;
		List<Position> actual = piece.getPossibleMoves(row, column);
		List<Position> expected = Arrays.asList(new Position(3,0),
												new Position(3,1),
												new Position(3,2),
												new Position(3,3),
												new Position(3,5),
												new Position(3,6),
												new Position(3,7),
												new Position(0,4),
												new Position(1,4),
												new Position(2,4),
												new Position(4,4),
												new Position(5,4),
												new Position(6,4),
												new Position(7,4));
		assertTrue(actual.size() == expected.size() && 
			    actual.containsAll(expected) && expected.containsAll(actual));
	}
	
	@Test
	@DisplayName("Rook movement when on Corner")
	public void testRookOnCorner()
	{
		String input = "H8";
		int row = input.charAt(0)-'A';
		int column = Integer.parseInt(input.substring(1))-1;
		List<Position> actual = piece.getPossibleMoves(row, column);
		List<Position> expected = Arrays.asList(new Position(0,7),
												new Position(1,7),
												new Position(2,7),
												new Position(3,7),
												new Position(4,7),
												new Position(5,7),
												new Position(6,7),
												new Position(7,0),
												new Position(7,1),
												new Position(7,2),
												new Position(7,3),
												new Position(7,4),
												new Position(7,5),
												new Position(7,6));
		assertTrue(actual.size() == expected.size() && 
			    actual.containsAll(expected) && expected.containsAll(actual));
	}
	
}
