package MusicShop;

import Behaviours.ISell;

public class MusicStand implements ISell {
    private String colour;
    private int buyPrice;
    private int sellPrice;

    public MusicStand(String colour, int buyPrice, int sellPrice) {
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getColour() {
        return colour;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
