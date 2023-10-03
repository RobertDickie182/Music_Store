package MusicShop;


public class Piano extends Instrument {

    private String manufacturer;

    public Piano(String colour, String manufacturer, int buyPrice, int sellPrice) {
        super(colour, InstrumentType.KEYBOARD, buyPrice, sellPrice);
        this.manufacturer = manufacturer;
    }


    public String getManufacturer() {
        return manufacturer;
    }


    @Override
    public String play() {
        return "Plink Plonk";
    }

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
