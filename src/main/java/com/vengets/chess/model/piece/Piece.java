package com.vengets.chess.model.piece;

public abstract class Piece {
    boolean isAlive;
    PieceColor pieceColor;

    Piece(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
        isAlive = true;
    }

    public void killed() {
        isAlive = false;
    }

    abstract String movementFormula();

}
