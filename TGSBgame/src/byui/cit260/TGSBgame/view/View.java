/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.view;

import java.util.Scanner;

/**
 *
 * @author Adriana
 */

public abstract class View implements ViewInterface {
    
    private String promptMessage;

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
            System.out.println(this.promptMessage);//display prompt message
            value = this.getInput();// get the user's input
            done = this.doAction(value);//do action based on value entered
        } while (!done);
    }

    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in); //keyboard input screen
        boolean valid = false;
        String value = null;

        // while valid name has not been retrieved
        while (!valid) {

            // get value entered from keyboard
            value = keyboard.nextLine();
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