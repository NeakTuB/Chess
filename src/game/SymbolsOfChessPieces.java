package game;

public enum SymbolsOfChessPieces {
    WhitePawn("\u2659"), WhiteRook("\u2656"), WhiteKnight("\u2658"), WhiteBishop("\u2657"), WhiteQueen("\u2655"), WhiteKing("\u2654"),
    BlackPawn("\u265F"), BlackRook("\u265C"), BlackKnight("\u265E"), BlackBishop("\u265D"), BlackQueen("\u265B"), BlackKing("\u265A");
    private String symbol;
    SymbolsOfChessPieces(String symbol){
        this.symbol = symbol;
    }
    public String getSymbol(){ return symbol;}
}
