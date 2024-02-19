package secao16_jogoXadrez.chess.pieces;

import secao16_jogoXadrez.boardgame.Board;
import secao16_jogoXadrez.chess.ChessPiece;
import secao16_jogoXadrez.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color){
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }

}
