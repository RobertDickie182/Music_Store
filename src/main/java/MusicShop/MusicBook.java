package MusicShop;

import Behaviours.ISell;

public class MusicBook implements ISell {
    private String title;
    private int buyPrice;
    private int sellPrice;

    public MusicBook(String title, int buyPrice, int sellPrice) {
        this.title = title;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getTitle() {
        return title;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }
}
