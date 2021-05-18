package com.app.chess.test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.app.chess.ChessPiece;
import com.app.chess.Position;
import com.app.chess.piece.impl.Horse;

public class HorseTest {

	private ChessPiece piece;
	@BeforeEach
	public void setUp()
	{
		piece = new Horse();
	}
	
	@Test
	@DisplayName("Horse movement from Center")
	public void testHorse()
	{
		String input = "E3";
		int row = input.charAt(0)-'A';
		int column = Integer.parseInt(input.substring(1))-1;
		List<Position> actual = piece.getPossibleMoves(row, column);
		List<Position> expected = Arrays.asList(new Position(6,3),
												new Position(5,4),
												new Position(3,4),
												new Position(2,3),
												new Position(2,1),
												new Position(3,0),
												new Position(5,0),
												new Position(6,1));
		assertTrue(actual.size() == expected.size() && 
			    actual.containsAll(expected) && expected.containsAll(actual));
	}
	
	@Test
	@DisplayName("Horse movement when on Corner")
	public void testHorseOnCorner()
	{
		String input = "A8";
		int row = input.charAt(0)-'A';
		int column = Integer.parseInt(input.substring(1))-1;
		List<Position> actual = piece.getPossibleMoves(row, column);
		List<Position> expected = Arrays.asList(new Position(1,5),
												new Position(2,6));
		assertTrue(actual.size() == expected.size() && 
			    actual.containsAll(expected) && expected.containsAll(actual));
	}
	
}
