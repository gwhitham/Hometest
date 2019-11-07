/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 *
 * @author Geraint
 */
public class Player {
    int highScore = 0;
    int turns  = 0;
    int maxTurns = 3;
    int order = 0;
    
    public void setMaxTurns(int turns){
        this.maxTurns=turns;
    }
    
    public void setTurns(){
        this.turns++;
        this.maxTurns--;
    }
    
    public void resetTurns(){
        this.turns=0;
    }
    
    public int getTurns(){
        return this.turns;
    }
   
    public int calcScore(int i, int j){
        int result;
        String temp;
        if (i<j){    
            temp = Integer.toString(j)+Integer.toString(i);
            result = Integer.parseInt(temp); 
            return result;
        }
        else{
        temp = Integer.toString(i)+Integer.toString(j);
        result = Integer.parseInt(temp); 
        return result; 
        }

    }
    public int getScore(){
        return this.highScore;
    }
    
    public void setScore(int score){
        this.highScore = score;
    }
    
    public Player(int order){
        this.order=order;
        
    }
    
}
