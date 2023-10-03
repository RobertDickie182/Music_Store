package MusicShop;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {
    private String model;

    private int numberOfStrings;
    private int costPrice;

}
