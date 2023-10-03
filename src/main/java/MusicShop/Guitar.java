package MusicShop;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {
    private String model;
    private int numberOfStrings;
    private int costPrice;
    private int retailPrice;

    public Guitar(String colour, String model, int numberOfStrings, int costPrice, int retailPrice) {
        super(colour, "String");
        this.model = model;
        this.numberOfStrings = numberOfStrings;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    @Override
    public String play() {
        return "Kerrang!!!";
    }

    public int caluculateMarkup() {
        return retailPrice - costPrice;
    }
}
