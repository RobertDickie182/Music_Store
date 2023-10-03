package MusicShop;

import Behaviours.ISell;

public class MusicStand extends StockItem {
    private String colour;

    public MusicStand(String colour, int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
        this.colour = colour;

    }

    public String getColour() {
        return colour;
    }

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
