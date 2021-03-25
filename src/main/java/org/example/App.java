package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CardMarket cardMarket = new CardMarket();
        Player player1= new Player(cardMarket);
        LeaderCard carta = new Card2();
        player1.wantsToBuy();
        carta.doAction(player1);
        player1.wantsToBuy();
    }
}
