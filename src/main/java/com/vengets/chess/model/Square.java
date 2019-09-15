package com.vengets.chess.model;

import com.vengets.chess.model.piece.Piece;

public class Square {
  private Piece piece;

  Square() {
      piece = null;
  }

  public void assign(Piece piece) {
    this.piece = piece;
  }

  public Piece retrieve() {
      return piece;
  }

}

