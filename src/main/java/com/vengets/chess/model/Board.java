package com.vengets.chess.model;

public class Board {

    Square[][] squares;

    public Board() {
        squares = new Square[8][8];
        for(Square[] squareRow: squares) {
            for(Square square: squareRow) {
                square = new Square();
            }
        }
    }




}
