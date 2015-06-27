/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.model;

import byui.cit260.TGSBgame.model.Scene.SceneType;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.Objects;
import tgsbgame.TGSBgame;

/**
 *
 * @author Dragon's
 */
public class Scene implements Serializable {
    
    //class instance variables
    private String description;
    private String symbol;

    public Scene() {
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", symbol=" + symbol + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + Objects.hashCode(this.symbol);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return Objects.equals(this.symbol, other.symbol);
        
    }

    private static Scene[] createScenes{} throws MapControlException {
        BufferedImage image = null;

        Game game = TGSBgame.getCurrentGame();

        Scene[] scenes = new Scene[SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.set.Description(
                   "\nYou have arrived at the John F Kennedy Airport, which"
                + "is the busiest of New York's three airports There are "
                + "millions of passengers heading to or arriving from domestic"
                + "and international destinations every year here. Today is a "
                + "beautiful day, and there are many people passing by, some "
                + "in a hurry and some looking for someone to who could guide "
                + "them out of this madness. You run to get into one of the "
                + "AirTrain that is heading out to your hotel. A person next "
                + "to you engages in a conversation.");
        startingScene.setMapSymbol("JFK");
        startingScene.setBlocked(false);
        //startingScene.setTravelTime(240);
    //ImageIcon startingSceneImage = MapControl.getImage(startingScene,
                //"\"/citbyui/cit260/curiousworkmanship/images/startingPoint.jpg");
        startingScene.setIcon(startingSceneImage);
        scenes[ScenesType.start.ordinal()] = startingScene;

//    private void setBlocked(boolean b) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setMapSymbol(String jfk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setBlocked(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        //don't have any finishing scenes
        /*Scene   finishScene= new Scene();
        finishScene.setDescription()
    */
        public enum SceneType {
            JFK_Airport,
            Time_Square,
            Central_Park,
            NY_Subway,
            Chinatown, 
            Little_Itally,
            Metropolitan_Museum_of_Art,
            Broadway,
            Lincoln_Center,
            Grand_Central_Station,
            Statue_of_Liberty,
            Hudson_River,
            Chelsea_Market,
            Brooklyn_Bridge,
            Soho,
            Empire_State_Building,
            Rockefeller_Center,
            Ellis_Island,
            New_York_Public_Library,
            Fifth_Avenue,
            Gothan_West_Market,
            Washignton_Square_Park,
            Flatiron_Building,
            Wall_Street,
            Queensbridge_Park_Queens,
            Music_Hall_of_Williamsburg_Brooklyn,
            Carlos_Bakery_New_Jersey,
            Radio_City_Music_Hall,
            The_Cathedral_Church_of_St_John_the_Divine,
            United_Nation_Headquarters,
            Unisphere_Queens,
            Yankee_Stadium_Bronx,
            Nine_Eleven_Museum ,
            High_Line,
            Manhatan_Temple;
        }
    
    private enum void assignScenesToLocation(Map map, Scene[] scenes) {
        Location [][] locations = map.getLocations();

        //start point
        locations[0][0].setScene(scenes[SceneType.JFK_Airport.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.Time_Square.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.Central_Park.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.NY_Subway.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.Chinatown.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.Little_Itally.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.Metropolitan_Museum_of_Art.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.Broadway.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.Lincoln_Center.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.Grand_Central_Station.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.Statue_of_Liberty.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.Hudson_River.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.Chelsea_Market.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.Brooklyn_Bridge.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.Soho.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.Empire_State_Building.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.Rockefeller_Center.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.Ellis_Island.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.New_York_Public_Library.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.Fifth_Avenue.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.Gothan_West_Market.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.Washignton_Square_Park.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.Flatiron_Building.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.Wall_Street.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.Queensbridge_Park_Queens.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.Music_Hall_of_Williamsburg_Brooklyn.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.Carlos_Bakery_New_Jersey.ordinal()]);
        locations[6][0].setScene(scenes[SceneType.Radio_City_Music_Hall.ordinal()]);        
        locations[5][2].setScene(scenes[SceneType.The_Cathedral_Church_of_St_John_the_Divine. ordinal()]);
        locations[5][3].setScene(scenes[SceneType.United_Nation_Headquarters.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.Unisphere_Queens.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.Yankee_Stadium_Bronx.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.Nine_Eleven_Museum.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.High_Line.ordinal()]);
        //end point
        locations[6][4].setScene(scenes[SceneType.Manhatan_Temple.ordinal()]);
    }
    }
}