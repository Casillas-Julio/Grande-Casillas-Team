/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.exceptions;

/**
 *
 * @author Dragon's
 */
public class MapException extends Exception {

    public MapException() {
    }

    public MapException(String string) {
        super(string);
    }

    public MapException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MapException(Throwable thrwbl) {
        super(thrwbl);
    }

    public MapException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
