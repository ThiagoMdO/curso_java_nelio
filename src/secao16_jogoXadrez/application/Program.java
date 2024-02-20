package secao16_jogoXadrez.application;

import secao16_jogoXadrez.chess.ChessException;
import secao16_jogoXadrez.chess.ChessMatch;
import secao16_jogoXadrez.chess.ChessPiece;
import secao16_jogoXadrez.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();

        while(true){
            try{
                UI.clearScreen();
                UI.printMatch(chessMatch);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(scanner);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(scanner);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

//                scanner.close();

            }catch (ChessException e){
                System.out.println(e.getMessage());
                scanner.nextLine();
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }

    }
}
