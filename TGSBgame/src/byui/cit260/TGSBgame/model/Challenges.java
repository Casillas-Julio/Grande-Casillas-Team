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
//public enum Challenges {
enum ChallengeEnum {
    doubt,
    iniquity,
    addictions,
    ignorance,
    dishonesty,
    deception,
    pride,
    unemployment,
    peer_pressure,
    sickeness,
    rebellion,
    fear,
    greed,
    loneliness,
    betrayal,
    power,
    poverty,
    loss,
    fun;
}

public class Challenges implements Serializable{
    
    //class instance variables
    private String type;
    private double ammount;
    private final String[] challenges;

    // assignment 9 - implement an array and populate the list with appropriate objects
    public Challenges() {
        challenges = new String[ChallengeEnum.values().length];
        
        String doubt = " Are you here visiting NY? Are you here for a specific reason?       " 
                      +"\n You come across as a good person, are you religious?                " 
                      +"\n Are you one of those people that only goes to one church?           "
                      +"\n How do you know you are going to a good one, or even if             "   
                      +"\n there's such a thing? Are you sure you are making a smart choice?   " 
                      +"\n What do you think about experiencing a different faith or           " 
                      +"\n philosophy that can make you happy?                                 ";
        challenges[ChallengeEnum.doubt.ordinal()] = doubt;
        
        String iniquity = " Hey you look new in town. Are you looking to have some fun?         " 
                         +"\n You know, New York has some of the best looking people in the world!" 
                         +"\n I have two tickets for some really hot show that is a lot of fun.   "
                         +"\n Come let's have some fun, it will be free!                          "
                         +"\n Come on, what's the problems? That's nothing wrong with it.         ";
        challenges[ChallengeEnum.iniquity.ordinal()] = iniquity;
        
        String addictions = " Do you have a light?                                 "
                           +"\n You look a bit stressed. Smoking can helps you relax." 
                           +"\n Do you a smoke? Ok, how about let's get a drink?     "
                           +"\n You don't drink either?                              ";
        challenges[ChallengeEnum.addictions.ordinal()] = addictions;
        
        String ignorance = " Do you know about the TED Talk here in November?        "
                          +"\n It is an invite-only event, but I have some connections." 
                          +"\n Do you want to come with me today to arrange for you to "
                          +"\n get an invitation?                                      "
                          +"\n Are you sure you want to miss this opportunity?         "       
                          +"\n It will be probably the only time in your life that you "
                          +"\n will be able to attend.                                 " 
                          +"\n Let's plan to meet after lunch and go visit my friend.  "
                          +"\n Can I pick up?                                          ";
      
        challenges[ChallengeEnum.ignorance.ordinal()] = ignorance;
        
        String dishonesty = " You are not from here are you?                              " 
                           +"\n Would be interested in making some money on some good       "
                           +"\n articles once you return home?                              "
                           +"\n I can give you a great deal on some products identical to   "
                           +"\n the original and you can double the price for a good profit."
                           +"\n Are you sure? You can make a very good out of this.         ";
        challenges[ChallengeEnum.dishonesty.ordinal()] = dishonesty;
        
        String deception = " You look like a Mormon, are you?                             "
                          +"\n Do you know that Joseph Smith was proved to be a farse and   "
                          +"\n now they have concrete proof of it?                          " 
                          +"\n Do you want to come see where they have all the artifacts    "
                          +"\n they collected?                                              "
                          +"\n They are in a museum in town.                                ";
        challenges[ChallengeEnum.deception.ordinal()] = deception;
        
        String pride = " Are you here in business?                                     " 
                      +"\n You look like someone really important that I've seen on TV.  "
                      +"\n You look really confident, you must be good at what you do.   "
                      +"\n I'm going to a VIP meeting today where you can meet very      "
                      +"\n important and infuential people, do you want to come with me? "
                      +"\n Come on, you look rich, powerful, and that you can accomplish "
                      +"\n anything you put your mind to it. Why not?                    "
                      +"\n You deserve the best this city has to offer.                     ";
        challenges[ChallengeEnum.pride.ordinal()] = pride;
        
        String unemployment = " Are you here in New York looking for a better job?              "
                             +"\n I can connect you with a great company, they even triple pay    "
                             +"\n for you to work on Sundays.                                     "       
                             +"\n Are you sure? What you can make here is probably a lot more     "
                             +"\n that you can make anywhere.                                     "
                             +"\n This is a lifetime opportunity, I can take you there right now  "
                             +"\n and you can improve your lifestyle right away.                  "
                             +"\n Are you coming with me?                                         ";
        challenges[ChallengeEnum.unemployment.ordinal()] = unemployment;
        
        String peer_pressure = " Hi, do you have plans while you are in town?                    "
                              +"\n Are you telling me that you are in New York and what you are    "
                              +"\n going to do is to go to some temple?                            "
                              +"\n If you don't spend time doing anything else,                    "
                              +"\n you are wasting your trip.                                      "
                              +"\n Just come with me, and I can show you the best of town.         "
                              +"\n Are you coming?                                                 ";
        challenges[ChallengeEnum.peer_pressure.ordinal()] = peer_pressure;
        
        String sickeness = " You look sick, are you feeling well?                             " 
                          +"\n You probably need to cancel all your appointments today.         "
                          +"\n Just take some time for yourself. Do you want me to bring you    "
                          +"\n some movies and snacks for you, so you can hang out and rest     "
                          +"\n until you feel better?                                           "
                          +"\n I'm sure if you don't go to this Mormon temple in the next few   "
                          +"\n days or weeks it won't really matter, right?                     ";
        challenges[ChallengeEnum.sickeness.ordinal()] = sickeness;
        
        String rebelion = " Are you going to the Mormon temple?                             "
                         +"\n Do your leaders make you go there?                              "
                         +"\n I don't think you have any freedom to chose.                    "
                         +"\n Can you make decisions by yourself?                             "
                         +"\n There's a lot of places to go in New York city, why don't       ";
        challenges[ChallengeEnum.rebellion.ordinal()] = rebelion;
        
        String fear = " Are you traveling alone?                                 "
                     +"\n Did you make sure to bring money with you?               "
                     +"\n You need cash in this town.                              "
                     +"\n Do you want me to tak you where you are going?           "
                     +"\n My car is near by and I can take you anywhere.           "
                     +"\n You are safe with me, let's go.                          ";
        challenges[ChallengeEnum.fear.ordinal()] = fear;
        
        String greed =" Hey do you want to make a lot of money fast from a very "
                      +"\n small investiment?                                      "
                      +"\n I know this health product from a reliable company, that"
                      +"\n can both cure baldness and make you lose weight at the  "
                      +"\n same time.                                              "
                      +"\n You can make a quick return in only two or three months."
                      +"\n Do you want to see a presentation today?                "
                      +"\n Why not? You can start to make money tomorrow?          "
                      +"\n Can I come over at 3PM?                                 ";
        challenges[ChallengeEnum.greed.ordinal()] = greed;
        
        String loneliness = " Are you here for Comic Con happening this week?             "
                           +"\n Are you sure?                                               "
                           +"\n Are you going to be alone during your whole trip?           "
                           +"\n when you can make lots of new friends?                      "
                           +"\n That is the best convention to make friends from all over   "
                           +"\n the place. Come with me, I'm sure you can go to this other  "
                           +"\n place any other day.                                        ";
        challenges[ChallengeEnum.loneliness.ordinal()] = loneliness;
        
        String betrayal = " You look like someone with a destination in mind.      "
                         +"\n Are you here to participate in a learning experience?  "
                         +"\n Do you really want to learn more about God?            "
                         +"\n There's a group that meets every week in Brooklyn,     "
                         +"\n and we learn profound truths about God and ourselves.  "
                         +"\n Will you come with me this Thursday?                   ";
        challenges[ChallengeEnum.betrayal.ordinal()] = betrayal;
        
        String power = " Would you like to learn how to influence a lot of       "
                      +"\n people for a good cause?                                "
                      +"\n Can you join me in this political campaign?             "
                      +"\n We need a great representative in you area, and you     "
                      +"\n look like you may be just the right person              ";
        challenges[ChallengeEnum.power.ordinal()] = power;
        
        String poverty = " Have you seen the new program created by the government      "
                        +"\n that will take care of all our financial needs?              "
                        +"\n It is wonderful, you won't need to work for barely anything! "
                        +"\n You will have housing, food, and many more                   ";
        challenges[ChallengeEnum.poverty.ordinal()] = poverty;
        
        String loss =" Have you ever grived for someone?                         "
                     +"\n There's a place here in town where you can light candles, "
                     +"\n place flowers, and say a prayer for the souls of the ones "
                     +"\n who parted this life. Do you want me to give you the      "
                     +"\n directions there?                                         "
                     +"\n You can have someone go there with you.                   "
                     +"\n Would you like me to give you the information?            ";
        challenges[ChallengeEnum.loss.ordinal()] = loss;
        
        String fun = " You will not believe this, but I have an extra great seat "
                    +"\n for a U2 concert happening today here in New York.        "
                    +"\n Do you want go?                                           "
                    +"\n I'm selling it half-price of the original and you will    "
                    +"\n never find a better deal.                                 "
                    +"\n Are you free to go?                                       "
                    +"\n You need to go right now or the lines will be to big      "
                    +"\n and you will never get in.                                "
                    +"\n Do you want to come with me?                              ";
        challenges[ChallengeEnum.fun.ordinal()] = fun;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumChallenges(){
        return challenges.length;
    }
            
            
    public String getChallenge (int whichEntry){
        return challenges[whichEntry];
    }
    
    @Override
    public String toString() {
        return "Challenges{" + "type=" + type + ", ammount=" + ammount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.ammount) ^ (Double.doubleToLongBits(this.ammount) >>> 32));
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
        final Challenges other = (Challenges) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (Double.doubleToLongBits(this.ammount) != Double.doubleToLongBits(other.ammount)) {
            return false;
        }
        return true;
    }
}
