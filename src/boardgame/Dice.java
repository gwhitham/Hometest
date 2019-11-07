/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

import java.util.Random;

/**
 *
 * @author Geraint
 */
public class Dice {
    int diceID = 0;
    int number;

    public int getDiceID() {
        return diceID;
    }

    public void setDiceID(int diceID) {
        this.diceID = diceID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public int roll(){
        Random rand = new Random();
        this.number=rand.nextInt(6)+1;
        return this.number;
    }
    
    public Dice(int id){
        this.diceID=id;
}
}
