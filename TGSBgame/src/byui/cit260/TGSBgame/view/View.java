/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import tgsbgame.TGSBgame;

/**
 *
 * @author Adriana
 */

public abstract class View implements ViewInterface {
    
    private String promptMessage;
    
    protected final BufferedReader keyboard = TGSBgame.getInFile();
    protected final PrintWriter console = TGSBgame.getOutFile();
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String message) {
        this.promptMessage = message;
    }
    
    @Override
    public void display() {
        String value = "";
        boolean done = false;

        do {
            //this.console.println(this.promptMessage);//display prompt message
            this.console.println(this.promptMessage);
            value = this.getInput();// get the user's input
            done = this.doAction(value);//do action based on value entered
        } while (!done);
    }

    @Override
    public String getInput() {
        boolean valid = false;
        String value = null;

        // while valid name has not been retrieved
        while (!valid) {

            try {
                // get value entered from keyboard
                value = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.INFO, null, ex);
            }
            value = value.trim();

            if (value.length() < 1) {// blank value entered
                System.out.println("You must enter a value.");
                continue;
            }

            break;
        }

        return value; // Return Name
    }
}