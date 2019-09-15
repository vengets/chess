package com.vengets.chess.model;

public class Position {
    private int row;
    private int column;

    Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int[] getPosition() {
        return new int[]{row, column};
    }
}
