package secao16_jogoXadrez.chess;

import secao16_jogoXadrez.boardgame.BoardException;

public class ChessException extends BoardException {
    private static final long serialVersionUID = 1L;

    public ChessException(String msg){
        super(msg);
    }
}
