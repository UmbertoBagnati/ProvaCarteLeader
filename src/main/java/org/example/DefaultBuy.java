package org.example;

public class DefaultBuy implements BuyState{
    @Override
    public int BuyCard(int pos, CardMarket cardMarket) {
        return cardMarket.getCard(pos).getPrezzo();

    }
}
