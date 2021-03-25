package org.example;

public class BonusBuy implements  BuyState{
    private final Resource resourceDiscount;

    public BonusBuy(Resource resourceDiscount) {
        this.resourceDiscount = resourceDiscount;
    }

    @Override
    public int BuyCard(int pos, CardMarket cardMarket) {
        if(cardMarket.getCard(pos).getResource() == resourceDiscount){
            return cardMarket.getCard(pos).getPrezzo()-1;
        }
        else
            return cardMarket.getCard(pos).getPrezzo();
    }
}
