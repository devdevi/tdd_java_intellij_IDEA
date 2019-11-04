package com.visaka.javatest.player;

public class Player {


//    campo de clase
    private Dice  dice;
    private  int minNumberToWin;

//  Constructor
    public Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

//    methods
    public boolean play() {
        int diceNumber = dice.roll();
        return  diceNumber > minNumberToWin;
    }
}
