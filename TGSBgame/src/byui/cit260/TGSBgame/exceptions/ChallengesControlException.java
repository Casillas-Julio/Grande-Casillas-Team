/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TGSBgame.exceptions;

/**
 *
 * @author Adriana
 */
public class ChallengesControlException extends Exception{

    public ChallengesControlException() {
    }

    public ChallengesControlException(String message) {
        super(message);
    }

    public ChallengesControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChallengesControlException(Throwable cause) {
        super(cause);
    }

    public ChallengesControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
