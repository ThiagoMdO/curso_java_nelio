package secao16_jogoXadrez.chess;

import secao16_jogoXadrez.boardgame.Board;
import secao16_jogoXadrez.boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color){
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
