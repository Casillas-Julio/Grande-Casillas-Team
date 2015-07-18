/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.control;

import byui.cit260.TGSBgame.exceptions.GameMenuViewException;
import byui.cit260.TGSBgame.exceptions.GameViewException;
import byui.cit260.TGSBgame.exceptions.LocationControlException;
import byui.cit260.TGSBgame.model.Actor;
import byui.cit260.TGSBgame.model.Challenges;
import byui.cit260.TGSBgame.model.Game;
import byui.cit260.TGSBgame.model.Map;
import byui.cit260.TGSBgame.model.Player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import tgsbgame.TGSBgame;


/**
 *
 * @author Adriana
 */
public class GameControl implements Serializable {

    private Player player;
    private Map map;

    public static void saveGame(Game currentGame, String filePath)
            throws GameViewException {

        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(currentGame);// write the game object of the file.
        } catch (IOException e) {
            throw new GameViewException(e.getMessage());
        }
    }

    public static void getStartExistingGame(String filePath)
            throws GameViewException, FileNotFoundException, ClassNotFoundException {

        Game game = null;

        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject();// read the game object from file

        } catch (FileNotFoundException fnfe) {
            throw new GameViewException(fnfe.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(GameControl.class.getName()).log(Level.INFO, null, ex);
        }

        //close the output file
        TGSBgame.setCurrentGame(game);
    }

    public static void createNewGame(Player player) {

        player.setFruits(10);

        Game game = new Game(); // create new game
        TGSBgame.setCurrentGame(game); // save in TGSBGame

        //game.setPlayer(player);// save player in game
        Challenges challenges = new Challenges();
        TGSBgame.setChallenges(challenges);

        Map map = MapControl.createMap(); //create nd initialize new map
        game.setMap(map); //save map in game
        try {
            LocationControl.setLocation(0);
        } catch (LocationControlException ex) {
            Logger.getLogger(GameControl.class.getName()).log(Level.INFO, null, ex);
        }
    }

    // returns bonus fruits/points if any were added
    public static int calculateTotalScore(Player player, int fruitsToAdd) {//FIXME totalScore is not beein called yet from answerView to be added here
        int totalScore;
        int bonus;

        bonus = calculateBonus(player);
        totalScore = player.getFruits() + fruitsToAdd + bonus;
        player.setFruits(totalScore);
        return bonus;
    }

    private static int calculateBonus(Player player) {
        int score = player.getFruits();
        int bonus = 0;
        //changed to increment the bonus on each level of points
        if ((score >= 20) && (player.isBonus20() == false)) {
            bonus += (int) (score * 0.2);
            player.setBonus20(true);// flag that the player already got the  20 bonus once
        }
        if ((score >= 40) && (player.isBonus40() == false)) {
            bonus += (int) (score * 0.25);
            player.setBonus40(true);// flag that the player already got the  40 bonus once
        }
        if ((score >= 60) && (player.isBonus60() == false)) {
            bonus += (int) (score * 0.3);
            player.setBonus60(true);// flag that the player already got the  60 bonus once
        }
        return bonus;
    }

    public static int helpFruits(Player player) {
        int totalScore;
        final int bonusHelpFruits = 2;

        totalScore = player.getFruits() + bonusHelpFruits;
        player.setFruits(totalScore);
        return bonusHelpFruits;
    }

    public static void writeActorList(Actor actorList, String filePath)
            throws GameMenuViewException {

        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(actorList);// write the game object of the file.
        } catch (IOException e) {
            throw new GameMenuViewException(e.getMessage());
        }
    }

    public GameControl(GameControl totalScore) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static boolean endOfGame(Player player, int location){
        Game game = TGSBgame.getCurrentGame();
        Map map = game.getMap();
       
        if (player.getFruits() == 0) {
            System.out.println("\n************************************************************************************"
                    + "\n* Unfortunately you lost this battle, but victory can still be yours. Elder Ballard*"
                    + "\n* said: And for those of you who have fallen prey to any kind of [lure], there is  *"
                    + "\n* hope because God loves all of His children and because the Atonement of the Lord *"
                    + "\n* Jesus Christ makes all things possible. The Lord is our Shepherd, and we shall   *"
                    + "\n* not want as we trust in the power of the Atonement, as the Apostle Paul          *"
                    + "\n* proclaimed, “I can do all things through Christ which strengtheneth me”(Phi.4:13) *"
                    + "\n* M. Russell Ballard- O That Cunning Plan of the Evil One, 2010.                   *"
                    + "\n*                                                                                  *"
                    + "\n* Try again and make better decisions!                                             *"
                    + "\n************************************************************************************");
            return true;
        }
        else if (location == (map.getMapSize() - 1)) {
            // this means you reach the end of the game
            System.out.println("\n**************************************************************************************"
                    + "\n* Congratulations! You have successfully reached the Temple. Elder Ballard said: Our*"
                    + "\n* love for our Father in Heaven and the Lord Jesus Christ needs to be reflected in  *"
                    + "\n* our daily choices and actions. They have promised peace, joy, and happiness to    *"
                    + "\n* those who keep Their commandments. Brothers and sisters, may we all be aware of   *"
                    + "\n* the [lures] being presented to us by the counterfeit fisher of men, Lucifer. May  *"
                    + "\n* we have the wisdom and spiritual insight to discern and refuse his many dangerous *"
                    + "\n* offerings.M. Russell Ballard- O That Cunning Plan of the Evil One, 2010.          *"
                    + "\n*  By following these teachings you are well in your way to one day receive eternal *"
                    + "\n* life. Just as Lehi under the tree of life the fruits of such life will make you   *"
                    + "\n* happy. “Remember, remember that it is upon the rock of our Redeemer,who is Christ, *"
                    + "\n* the Son of God, that ye must build your foundation … , a foundation whereon if men*"
                    + "\n*  if men build they cannot fall.” Helaman 5:12.                                     *"
                    + "\n*************************************************************************************");
            return true;
        }
        return false;
    }

}
