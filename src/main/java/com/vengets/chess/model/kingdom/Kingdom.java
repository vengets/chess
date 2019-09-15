package com.vengets.chess.model.kingdom;

import com.vengets.chess.model.Player;
import com.vengets.chess.model.piece.*;

public abstract class Kingdom {

    Player player;

    Piece[] bishop;
    Piece[] king;
    Piece[] knight;
    Piece[] pawn;
    Piece[] queen;
    Piece[] rook;

    Kingdom() {
        bishop = new Bishop[2];
        bishop[0] = new Bishop();
        bishop[1] = new Bishop();

        king = new King[2];
        king[0] = new King();
        king[1] = new King();

        knight = new Knight[2];
        knight[0] = new Knight();
        knight[1] = new Knight();

        pawn = new Pawn[8];
        for(Piece p: pawn){
            p = new Pawn();
        }

        queen = new Queen[2];
        queen[0] = new Queen();
        queen[1] = new Queen();

        rook = new Rook[2];
        rook[0] = new Rook();
        rook[1] = new Rook();

        player = new Player(getPlayerName());
    }

    abstract String getPlayerName();
}
