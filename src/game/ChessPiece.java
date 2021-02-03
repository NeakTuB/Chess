package game;

public abstract class ChessPiece{
    private String color;
    private String charValue;

    public ChessPiece(String color, String charValue) {
        this.color = color;
        this.charValue = charValue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCharValue() {
        return charValue;
    }

    public void setCharValue(String charValue) {
        this.charValue = charValue;
    }
}
