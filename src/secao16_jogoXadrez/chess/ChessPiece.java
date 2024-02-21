package secao16_jogoXadrez.chess;

import secao16_jogoXadrez.boardgame.Board;
import secao16_jogoXadrez.boardgame.Piece;
import secao16_jogoXadrez.boardgame.Position;

public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color){
        super(board);
        this.color = color;
    }

    public ChessPosition getChessPosition(){
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

    public Color getColor() {
        return color;
    }
}
