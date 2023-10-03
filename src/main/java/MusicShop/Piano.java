package MusicShop;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Piano extends Instrument implements ISell, IPlay {

    private String manufacturer;
    private int buyPrice;
    private int sellPrice;

    public Piano(String colour, String type, String manufacturer, int buyPrice, int sellPrice) {
        super(colour, "Keyboard");
        this.manufacturer = manufacturer;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    @Override
    public String play() {
        return "Plink Plonk";
    }
}
