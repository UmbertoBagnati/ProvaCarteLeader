package org.example;

public class BuyContext {
    private BuyState buyState;

    public BuyContext() {
        buyState = new DefaultBuy();
    }

    public void setBuyState(BuyState buyState) {
        this.buyState = buyState;
    }

    public int buyCard(int pos, CardMarket cardMarket){
        return buyState.BuyCard(pos, cardMarket);
    }
}
