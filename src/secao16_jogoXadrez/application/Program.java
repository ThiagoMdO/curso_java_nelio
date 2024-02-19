package secao16_jogoXadrez.application;

import secao16_jogoXadrez.chess.ChessMatch;
import secao16_jogoXadrez.chess.ChessPiece;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());

    }
}
