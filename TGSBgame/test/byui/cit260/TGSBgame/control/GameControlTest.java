/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.model.Actor;
import byui.cit260.TGSBgame.model.Game;
import byui.cit260.TGSBgame.model.Player;
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
public class GameControlTest {
    
    public GameControlTest() {
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
     * Test of saveGame method, of class GameControl.
     */
    @Test
    public void testSaveGame() throws Exception {
        System.out.println("saveGame");
        Game currentGame = null;
        String filePath = "";
        GameControl.saveGame(currentGame, filePath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartExistingGame method, of class GameControl.
     */
    @Test
    public void testGetStartExistingGame() throws Exception {
        System.out.println("getStartExistingGame");
        String filePath = "";
        GameControl.getStartExistingGame(filePath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewGame method, of class GameControl.
     */
    @Test
    public void testCreateNewGame() {
        System.out.println("createNewGame");
        Player player = null;
        GameControl.createNewGame(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateTotalScore method, of class GameControl.
     */
    @Test
    public void testCalculateTotalScore() {
        System.out.println("calculateTotalScore");
        Player player = null;
        int fruitsToAdd = 0;
        int expResult = 0;
        int result = GameControl.calculateTotalScore(player, fruitsToAdd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of helpFruits method, of class GameControl.
     */
    @Test
    public void testHelpFruits() {
        System.out.println("helpFruits");
        Player player = null;
        int expResult = 0;
        int result = GameControl.helpFruits(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeActorList method, of class GameControl.
     */
    @Test
    public void testWriteActorList() throws Exception {
        System.out.println("writeActorList");
        Actor actorList = null;
        String filePath = "";
        GameControl.writeActorList(actorList, filePath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endOfGame method, of class GameControl.
     */
    @Test
    public void testEndOfGame() {
        System.out.println("endOfGame");
        Player player = null;
        int location = 0;
        boolean expResult = false;
        boolean result = GameControl.endOfGame(player, location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
