/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.model.Game;
import byui.cit260.TGSBgame.model.Map;
import byui.cit260.TGSBgame.model.Player;
import byui.cit260.TGSBgame.model.Scene;
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
     * Test of assignScenesToLocations method, of class GameControl.
     */
    @Test
    public void testAssignScenesToLocations() {
        //this.console.println("assignScenesToLocations");
        Map map = null;
        Scene[] scenes = null;
        GameControl.assignScenesToLocations(map, scenes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewGame method, of class GameControl.
     */
    @Test
    public void testCreateNewGame() {
        //this.console.println("createNewGame");
        Player player = null;
        GameControl.createNewGame(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initializeMap method, of class GameControl.
     */
    @Test
    public void testInitializeMap() {
        //this.console.println("initializeMap");
        Map map = null;
        GameControl.initializeMap(map);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateScore method, of class GameControl.
     */
    @Test
    public void testCalculateScore() {
        //this.console.println("calculateScore");
        Player player = null;
        int fruitsToAdd = 0;
        int expResult = 0;
        int result = GameControl.calculateScore(player, fruitsToAdd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateBonus method, of class GameControl.
     */
    @Test
    public void testCalculateBonus() {
        //this.console.println("calculateBonus");
        Player player = null;
        int expResult = 0;
        int result = GameControl.calculateBonus(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of helpFruits method, of class GameControl.
     */
    @Test
    public void testHelpFruits() {
        //this.console.println("helpFruits");
        Player player = null;
        int expResult = 0;
        int result = GameControl.helpFruits(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
    
}
