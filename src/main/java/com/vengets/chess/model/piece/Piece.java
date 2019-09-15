package com.vengets.chess.model.piece;

public abstract class Piece {
    boolean isAlive;

    Piece() {
        isAlive = true;
    }

    public void killed() {
        isAlive = false;
    }

    abstract String locomotionFormula();
}
