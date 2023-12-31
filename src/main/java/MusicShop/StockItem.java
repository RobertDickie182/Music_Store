package MusicShop;

import Behaviours.ISell;

public abstract class StockItem implements ISell {
    protected int buyPrice;
    protected int sellPrice;

    public StockItem(int buyPrice, int sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }
}
