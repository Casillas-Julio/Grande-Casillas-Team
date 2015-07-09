/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adriana
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMap method, of class Game.
     */
    @Test
    public void testGetMap() {
        this.console.println("getMap");
        Game instance = new Game();
        Map expResult = null;
        Map result = instance.getMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMap method, of class Game.
     */
    @Test
    public void testSetMap() {
        this.console.println("setMap");
        Map map = null;
        Game instance = new Game();
        instance.setMap(map);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer method, of class Game.
     */
    @Test
    public void testGetPlayer() {
        this.console.println("getPlayer");
        Game instance = new Game();
        String expResult = "";
        String result = instance.getPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer method, of class Game.
     */
    @Test
    public void testSetPlayer() {
        this.console.println("setPlayer");
        String player = "";
        Game instance = new Game();
        instance.setPlayer(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActors method, of class Game.
     */
    @Test
    public void testGetActors() {
        this.console.println("getActors");
        Game instance = new Game();
        double expResult = 0.0;
        double result = instance.getActors();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActors method, of class Game.
     */
    @Test
    public void testSetActors() {
        this.console.println("setActors");
        double actors = 0.0;
        Game instance = new Game();
        instance.setActors(actors);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Game.
     */
    @Test
    public void testToString() {
        this.console.println("toString");
        Game instance = new Game();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Game.
     */
    @Test
    public void testHashCode() {
        this.console.println("hashCode");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Game.
     */
    @Test
    public void testEquals() {
        this.console.println("equals");
        Object obj = null;
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
