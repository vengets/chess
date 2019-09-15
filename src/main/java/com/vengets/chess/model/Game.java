package com.vengets.chess.model;

import com.vengets.chess.model.kingdom.BlackKingdom;
import com.vengets.chess.model.kingdom.WhiteKingdom;

public class Game {
    Board chessBoard;
    Player whitePlayer;
    Player blackPlayer;

    Player currentTurn;

    Game() {
        chessBoard = new Board();

        whitePlayer = new Player(new WhiteKingdom(), "Mr.White");
        blackPlayer = new Player(new BlackKingdom(), "Blacky");

        whitePlayer.getKingdom().arrangePieces(chessBoard);
        blackPlayer.getKingdom().arrangePieces(chessBoard);

        currentTurn = blackPlayer;
    }

    void play() {
// Algorithm for playing chess
    }

}
