package MusicShop;

public abstract class Instrument {

    private String colour;

    private String type;

    public Instrument(String colour, String type) {
        this.colour = colour;
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }
}
