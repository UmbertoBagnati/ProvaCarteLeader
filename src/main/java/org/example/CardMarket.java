package org.example;

import java.util.ArrayList;
import java.util.List;

public class CardMarket {
    private List<DevCard> deck;

    public CardMarket() {
        this.deck = new ArrayList<>();
        deck.add(new DevCard(2, Resource.COIN));
        deck.add(new DevCard(3, Resource.SHIELD));
        deck.add(new DevCard(4, Resource.STONE));
    }

    public DevCard getCard(int pos){
        return deck.get(pos);
    }
}
