package MusicShop;

import Behaviours.IPlay;

public abstract class Instrument extends StockItem implements IPlay {

    private String colour;

    private InstrumentType type;

    public Instrument(String colour, InstrumentType type, int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
        this.colour = colour;
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }
}
