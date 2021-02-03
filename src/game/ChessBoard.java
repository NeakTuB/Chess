package game;

import game.pieces.*;

import java.util.HashMap;
import java.util.Map;

public class ChessBoard {
    private final Map<Integer, Character> boardMap;
    private final Cell[][] board;

    public ChessBoard() {
        boardMap = new HashMap<>();
        boardMap.put(1, 'A');
        boardMap.put(2, 'B');
        boardMap.put(3, 'C');
        boardMap.put(4, 'D');
        boardMap.put(5, 'E');
        boardMap.put(6, 'F');
        boardMap.put(7, 'G');
        boardMap.put(8, 'H');

        board = new Cell[8][8];
        initBoard();
        fillBoard();
    }

    public Cell[][] getBoard() {
        return board;
    }

    public Map<Integer, Character> getBoardMap(){
        return boardMap;
    }

    private void initBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Cell(boardMap.get(i + 1), j + 1);
            }
        }
    }

    private void fillBoard() {
        for(int i = 0; i < 8; i++){
            board[1][i].setChessPiece(new Pawn("Black", SymbolsOfChessPieces.BlackPawn.getSymbol()));
            board[6][i].setChessPiece(new Pawn("White", SymbolsOfChessPieces.WhitePawn.getSymbol()));
        }

        board[0][0].setChessPiece(new Rook("Black", SymbolsOfChessPieces.BlackRook.getSymbol()));
        board[0][7].setChessPiece(new Rook("Black", SymbolsOfChessPieces.BlackRook.getSymbol()));
        board[7][0].setChessPiece(new Rook("White", SymbolsOfChessPieces.WhiteRook.getSymbol()));
        board[7][7].setChessPiece(new Rook("White", SymbolsOfChessPieces.WhiteRook.getSymbol()));

        board[0][1].setChessPiece(new Knight("Black", SymbolsOfChessPieces.BlackKnight.getSymbol()));
        board[0][6].setChessPiece(new Knight("Black", SymbolsOfChessPieces.BlackKnight.getSymbol()));
        board[7][1].setChessPiece(new Knight("White", SymbolsOfChessPieces.WhiteKnight.getSymbol()));
        board[7][6].setChessPiece(new Knight("White", SymbolsOfChessPieces.WhiteKnight.getSymbol()));

        board[0][2].setChessPiece(new Bishop("Black", SymbolsOfChessPieces.BlackBishop.getSymbol()));
        board[0][5].setChessPiece(new Bishop("Black", SymbolsOfChessPieces.BlackBishop.getSymbol()));
        board[7][2].setChessPiece(new Bishop("White", SymbolsOfChessPieces.WhiteBishop.getSymbol()));
        board[7][5].setChessPiece(new Bishop("White", SymbolsOfChessPieces.WhiteBishop.getSymbol()));

        board[0][3].setChessPiece(new Queen("Black", SymbolsOfChessPieces.BlackQueen.getSymbol()));
        board[7][3].setChessPiece(new Queen("White", SymbolsOfChessPieces.WhiteQueen.getSymbol()));

        board[0][4].setChessPiece(new King("Black", SymbolsOfChessPieces.BlackKing.getSymbol()));
        board[7][4].setChessPiece(new King("White", SymbolsOfChessPieces.WhiteKing.getSymbol()));
    }

    public static void printBoard(ChessBoard board) {
        clearConsole();
        System.out.println("gjcjcb");
        clearConsole();
        Cell[][] b = board.getBoard();

        System.out.println();
        System.out.println("   |A\u2009\u2009|B\u2009\u2009|C\u2009\u2009" +
                "|D\u2009\u2009|E\u2009\u2009|F\u2009\u2009" +
                "|G\u2009\u2009|H\u2009\u2009|");
        for (int i = 0; i < 8; i++) {
            System.out.print("[" + (8 - i) + "] ");

            for (int j = 0; j < 8; j++) {
                System.out.print(b[i][j].getValue());
            }

            System.out.println(" [" + (8 - i) + "]");
        }

        System.out.println("   |A\u2009\u2009|B\u2009\u2009|C\u2009\u2009" +
                "|D\u2009\u2009|E\u2009\u2009|F\u2009\u2009" +
                "|G\u2009\u2009|H\u2009\u2009| \n");
    }

    private static void clearConsole() {
       //...
    }
}

