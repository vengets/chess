package com.vengets.chess.model.kingdom;

import com.vengets.chess.model.Board;
import com.vengets.chess.model.piece.*;

public abstract class Kingdom {

    Piece[] bishops;
    Piece king;
    Piece[] knight;
    Piece[] pawn;
    Piece queen;
    Piece[] rook;

    Kingdom() {
        PieceColor kingdomColor = getKingdomColor();
        bishops = new Bishop[2];
        bishops[0] = new Bishop(kingdomColor);
        bishops[1] = new Bishop(kingdomColor);

        king = new King(kingdomColor);

        knight = new Knight[2];
        knight[0] = new Knight(kingdomColor);
        knight[1] = new Knight(kingdomColor);

        pawn = new Pawn[8];
        for(Piece p: pawn){
            p = new Pawn(kingdomColor);
        }

        queen = new Queen(kingdomColor);

        rook = new Rook[2];
        rook[0] = new Rook(kingdomColor);
        rook[1] = new Rook(kingdomColor);
    }

    public abstract void arrangePieces(Board board);

    abstract PieceColor getKingdomColor();
}
