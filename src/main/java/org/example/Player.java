package org.example;
import java.util.List;

public class Player {

    private Depo depo;
    private final CardMarket cardMarket;
    private LeaderCard[] leaderCards = new LeaderCard[2];
    private BuyContext buyContext;

    public Player (CardMarket cardMarket){
        depo = new Depo();
        leaderCards[0]= new Card();
        leaderCards[1]= new Card2();
        this.cardMarket = cardMarket;
        buyContext= new BuyContext();
    }

    public void switchState(Resource resource){
        buyContext.setBuyState(new BonusBuy(resource));
    }

    public void wantsToBuy(){
        System.out.println(buyContext.buyCard(2,cardMarket));
    }

}
