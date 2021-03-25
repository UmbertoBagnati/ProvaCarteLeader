package org.example;

public class Card2 implements LeaderCard{


    @Override
    public void doAction(Player player) {
        player.switchState(Resource.STONE);

    }
}
