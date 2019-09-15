package com.vengets.chess.model;

import com.vengets.chess.model.piece.Piece;

public class Square {
  private Piece piece;

  Position position;

  Square(Position position) {
      this.position = position;
      piece = null;
  }

  public Piece assign(Piece piece) {
      Piece oldPiece = this.piece;
      this.piece = piece;
      return oldPiece;
  }

  public Piece retrieve() {
      return piece;
  }

}

