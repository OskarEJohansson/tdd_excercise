package se.reky.hakan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTest {

    @Test
    void testActorTakesDamage(){
        Goblin goblin = new Goblin("Goblin",10,1);
        Guard guard = new Guard("Guard", 10, 2);
        Player player = new Player("Player", 10, 10);
        goblin.attack(player);
        Assertions.assertEquals(9, player.getHp());
        guard.attack(player);
        Assertions.assertEquals(7, player.getHp());
    }

}
