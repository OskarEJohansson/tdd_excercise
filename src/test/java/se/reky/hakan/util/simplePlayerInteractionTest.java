package se.reky.hakan.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.reky.hakan.IOHandler;
import se.reky.hakan.PlayerInteraction;
import se.reky.hakan.SimplePlayerInteraction;
import se.reky.hakan.model.Player;

import java.util.Scanner;

public class simplePlayerInteractionTest {

    private Player player;
    private PlayerInteraction simplePlayerInteraction;


    private PlayerInteraction setUp(String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);
        IOHandler ioHandler = new IOHandler(scanner);
        player = new Player();
        return new SimplePlayerInteraction(ioHandler);
    }

    @Test
    void testSetUpPlayer(){
        String name = "PLAYERNAME";
        simplePlayerInteraction = setUp(name);
        simplePlayerInteraction.setupPlayer(player);
        Assertions.assertEquals(name, player.getName());
    }

    @Test
    void testPlayerHealth(){
        simplePlayerInteraction = setUp("PLAYERNAME");
        simplePlayerInteraction.updatePlayerHealth(player, 20);
        Assertions.assertEquals(player.getHp(), 20);
    }


}
