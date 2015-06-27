/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.model;

import java.io.Serializable;
import java.util.Objects;

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
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        return true;
        
        //testcase
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
        //don't have any finishing scenes
        /*Scene   finishScene= new Scene();
        finishScene.setDescription()
    */
        public enum SceneType {
            JFK Airport ,
            Time Square,
            Central Park,
            NY Subway,
            Chinatown, 
            Little Itally,
            Metropolitan Museum of Art,
            Broadway,
            Lincoln Center,
            Grand Central Station,
            Statue of Liberty,
            Hudson River,
            Chelsea Market,
            Brooklyn Bridge,
            Soho,
            Empire State Building,
            Rockefeller Center,
            Ellis Island,
            New York Public Library,
            Fifth Avenue,
            Gothan West Market,
            Washignton Square Park,
            Flatiron Building,
            Wall Street,
            Queensbridge Park _ Queens,
            Music Hall of Williamsburg _ Brooklyn,
            Carlos Bakery _ New Jersey,
            Radio City Music Hall,
            The Cathedral Church of St John the Divine,
            United Nation Headquarters,
            Unisphere _ Queens,
            Yankee Stadium _ Bronx,
            Nine Eleven Museum ,
            High Line,
            Manhatan Temple;
        }
    }
}

    private static void assignScenesToLocation(Map map, Scene[] scenes) {
        Location [][] locations = map.getLocations();

        //start point
        locations[0][0].setScene(scene[SceneType.airport.ordinal()]);
        locations[0][1].setScene(scene[SceneType.timeSquatet.ordinal()]);
        locations[0][2].setScene(scene[SceneType.centralPark.ordinal()]);
        locations[0][3].setScene(scene[SceneType.subway.ordinal()]);
        locations[0][4].setScene(scene[SceneType.chinatown.ordinal()]);
        locations[1][0].setScene(scene[SceneType.littleItaly.ordinal()]);
        locations[1][1].setScene(scene[SceneType.met.ordinal()]);
        locations[1][2].setScene(scene[SceneType.brodway.ordinal()]);
        locations[1][3].setScene(scene[SceneType.lincolnCenter.ordinal()]);
        locations[1][4].setScene(scene[SceneType.grandCentralStation.ordinal()]);
        locations[2][0].setScene(scene[SceneType.statueOfLiberty.ordinal()]);
        locations[2][1].setScene(scene[SceneType.hudsonRiver.ordinal()]);
        locations[2][2].setScene(scene[SceneType.chelseaMarket.ordinal()]);
        locations[2][3].setScene(scene[SceneType.brooklynBridge.ordinal()]);
        locations[2][4].setScene(scene[SceneType.soho.ordinal()]);
        locations[3][0].setScene(scene[SceneType.empireState.ordinal()]);
        locations[3][1].setScene(scene[SceneType.rockfellerCenter.ordinal()]);
        locations[3][2].setScene(scene[SceneType.ellisIsland.ordinal()]);
        locations[3][3].setScene(scene[SceneType.library.ordinal()]);
        locations[3][4].setScene(scene[SceneType.fifthAvenue.ordinal()]);
        locations[4][0].setScene(scene[SceneType.gothanWest.ordinal()]);
        locations[4][1].setScene(scene[SceneType.washingtonSquare.ordinal()]);
        locations[4][2].setScene(scene[SceneType.flatiron.ordinal()]);
        locations[4][3].setScene(scene[SceneType.wallStreet.ordinal()]);
        locations[4][4].setScene(scene[SceneType.queensbridgePark.ordinal()]);
        locations[5][0].setScene(scene[SceneType.musicHall.ordinal()]);
        locations[5][1].setScene(scene[SceneType.carlosBakery.ordinal()]);
        locations[5][2].setScene(scene[SceneType.radioCity.ordinal()]);
        locations[5][3].setScene(scene[SceneType.stJohnCathedral.ordinal()]);
        locations[5][4].setScene(scene[SceneType.onu.ordinal()]);
        locations[6][0].setScene(scene[SceneType.unisphere.ordinal()]);
        locations[6][1].setScene(scene[SceneType.yankeeStadium.ordinal()]);
        locations[6][2].setScene(scene[SceneType.nineElevenMuseum.ordinal()]);
        locations[6][3].setScene(scene[SceneType.highLine.ordinal()]);
        //end point
        locations[6][4].setScene(scene[SceneType.temple.ordinal()]);
}