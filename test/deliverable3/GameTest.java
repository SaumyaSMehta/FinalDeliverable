/*
 * Karanbir Singh
 * Student ID - 991550003
 * SYSt10199 - Web Programming
 */
package deliverable3;

import Deliverable3.Card;
import Deliverable3.Game;
import Deliverable3.Player;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MadDeath
 */
public class GameTest {
    
    @Test
    public void testDistribute() {
        System.out.println("distribute");
        Game instance = new Game();
        instance.distribute();
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetGameName() {
        System.out.println("getGameName");
        Game instance = new Game();
        String expResult = "";
        String result = instance.getGameName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetGameName() {
        System.out.println("setGameName");
        String gameName = "";
        Game instance = new Game();
        instance.setGameName(gameName);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        Game instance = new Game();
        ArrayList<Player> expResult = null;
        ArrayList<Player> result = instance.getPlayers();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPlayers() {
        System.out.println("setPlayers");
        Player player = null;
        Game instance = new Game();
        instance.setPlayers(player);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCardsInPile() {
        System.out.println("setCardsInPile");
        Card c = null;
        Game instance = new Game();
        instance.setCardsInPile(c);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPlay() {
        System.out.println("play");
        Game instance = new Game();
        instance.play();
        fail("The test case is a prototype.");
    }

    @Test
    public void testInput() {
        System.out.println("input");
        Game instance = new Game();
        instance.input();
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrint() {
        System.out.println("print");
        Game instance = new Game();
        instance.print();
        fail("The test case is a prototype.");
    }

    @Test
    public void testRoundOutput() {
        System.out.println("RoundOutput");
        Game instance = new Game();
        instance.RoundOutput();
        fail("The test case is a prototype.");
    }

    @Test
    public void testWinnerOutput() {
        System.out.println("winnerOutput");
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.winnerOutput();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
