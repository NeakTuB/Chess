package game;

public class Cell {
    private ChessPiece chessPiece;
    private final char x;
    private final int y;

    public void setChessPiece(ChessPiece chessPiece) {
        this.chessPiece = chessPiece;
    }

    public ChessPiece getChessPiece() {
        return chessPiece;
    }

    public Cell(char x, int y) {
        this.x = x;
        this.y = y;
    }

    public char getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getValue(){
        if(chessPiece == null) return "\u2003|";
        return chessPiece.getCharValue() + "|";
    }
}
