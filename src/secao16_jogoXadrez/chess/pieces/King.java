package secao16_jogoXadrez.chess.pieces;

import secao16_jogoXadrez.boardgame.Board;
import secao16_jogoXadrez.chess.ChessPiece;
import secao16_jogoXadrez.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves(){
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
    @Override
    public String toString(){
        return "K";
    }
}
