/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.view;

import java.io.PrintWriter;
import tgsbgame.TGSBgame;

/**
 *
 * @author Adriana
 */
public class ErrorView {

    private static final PrintWriter errorFile = TGSBgame.getOutFile();
    private static final PrintWriter logFile = TGSBgame.getLogFile();

    public static void display(String className, String errorMessage) {

        errorFile.println(
                "_________________________________________________"
                + "\n- ERROR - " + errorMessage
                + "\n_________________________________________________");
        
        //log error
        logFile.println(className + " - " + errorMessage);
    }

    
}
