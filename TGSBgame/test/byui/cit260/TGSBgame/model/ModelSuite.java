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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Adriana
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({byui.cit260.TGSBgame.model.ChallengesControlTest.class,
    byui.cit260.TGSBgame.model.PlayerTest.class, byui.cit260.TGSBgame.model.LocationTest.class, 
    byui.cit260.TGSBgame.model.ActorTest.class, byui.cit260.TGSBgame.model.GameControlTest.class })

public class ModelSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
