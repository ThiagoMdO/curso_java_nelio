package secao16_jogoXadrez.chess;

import secao16_jogoXadrez.boardgame.Board;
import secao16_jogoXadrez.boardgame.Position;
import secao16_jogoXadrez.chess.pieces.King;
import secao16_jogoXadrez.chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        this.board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i < board.getRows(); i++){
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }

    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
        board.placePiece(new King(board, Color.BLACK), new Position(2,1));
        board.placePiece(new King(board, Color.WHITE), new Position(7,3));
    }

}
