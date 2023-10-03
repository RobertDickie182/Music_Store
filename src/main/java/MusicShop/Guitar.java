package MusicShop;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitar extends Instrument {
    private String model;
    private int numberOfStrings;


    public Guitar(String colour, String model, int numberOfStrings, int buyPrice, int sellPrice) {
        super(colour, InstrumentType.STRING, buyPrice, sellPrice);
        this.model = model;
        this.numberOfStrings = numberOfStrings;

    }

    public String getModel() {
        return model;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public int getCostPrice() {
        return buyPrice;
    }

    public int getRetailPrice() {
        return sellPrice;
    }

    @Override
    public String play() {
        return "Kerrang!!!";
    }

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
