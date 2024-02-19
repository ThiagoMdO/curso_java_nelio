package secao16_jogoXadrez.application;

import secao16_jogoXadrez.boardgame.Piece;
import secao16_jogoXadrez.chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] pieces) {
        System.out.println("  a b c d e f g h");
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pieces.length; j++) {
                printPiece(pieces[i][j]);
            }
            System.out.print(8 - i);
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    public static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("-");
        } else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
