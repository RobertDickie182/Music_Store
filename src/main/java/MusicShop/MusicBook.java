package MusicShop;

import Behaviours.ISell;

public class MusicBook extends StockItem {
    private String title;

    public MusicBook(String title, int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
        this.title = title;

    }

    public String getTitle() {
        return title;
    }


    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
