package com.vengets.chess.model.piece;

public class Bishop extends Piece {

    public Bishop(PieceColor pieceColor) {
        super(pieceColor);
    }

    String movementFormula() {
        return "+1";
    }
}
