package com.vengets.chess.model;

public class Board {

    Square[][] squares;

    public Board() {
        squares = new Square[8][];

        for(int row=0; row<8; row++) {
            squares[row] = new Square[8];

            for(int col=0; col<8; col++) {
                squares[row][col] = new Square(new Position(row, col));
            }
        }
    }

    public Square[] getPossibleMoves(Square square) {
        return null;
    }

}
