package com.app.chess.test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.app.chess.ChessPiece;
import com.app.chess.Position;
import com.app.chess.piece.impl.Pawn;

public class PawnTest {

	private ChessPiece piece;
	@BeforeEach
	public void setUp()
	{
		piece = new Pawn();
	}
	
	@Test
	@DisplayName("Pawn movement from Center")
	public void testPawn()
	{
		String input = "D5";
		int row = input.charAt(0)-'A';
		int column = Integer.parseInt(input.substring(1))-1;
		List<Position> actual = piece.getPossibleMoves(row, column);
		List<Position> expected = Arrays.asList(new Position(4,4));
		assertTrue(actual.size() == expected.size() && 
			    actual.containsAll(expected) && expected.containsAll(actual));
	}
	
	@Test
	@DisplayName("Pawn movement when on Corner")
	public void testPawnOnCorner()
	{
		String input = "H1";
		int row = input.charAt(0)-'A';
		int column = Integer.parseInt(input.substring(1))-1;
		List<Position> actual = piece.getPossibleMoves(row, column);
		List<Position> expected = new ArrayList<>();
		assertTrue(actual.size() == expected.size() && 
			    actual.containsAll(expected) && expected.containsAll(actual));
	}
	
}
