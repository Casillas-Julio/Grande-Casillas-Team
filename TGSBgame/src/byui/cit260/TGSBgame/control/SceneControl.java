/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.model.Actor;
import java.util.Random;

/**
 *
 * @author Adriana
 */
public class SceneControl {

    private final Random rand;

    public SceneControl() {
        rand = new Random(System.currentTimeMillis());
    }

    public String getActor() {
        int whichEntry;

        whichEntry = rand.nextInt(Actor.values().length);
        for (Actor a : Actor.values()) {
            if (a.ordinal() == whichEntry) {
                return a.toString();
            }
        }
        return null;
    }
}
