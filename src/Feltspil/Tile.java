package Feltspil;

public class Tile {

    private String title;
    private String flavourText;
    private int value;

    public Tile(String title, String flavorText, int value) {
        this.title = title;
        this.flavourText = flavorText;
        this.value = value;

    }
    public String getTitle() {
        return title;
    }

    public String getFlavourText() {
        return flavourText;
    }

    public int getValue() {
        return value;
    }


}
    

