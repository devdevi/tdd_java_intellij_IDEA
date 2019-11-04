package com.visaka.javatest.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

//    Creamos diferentes escenarios
    @Test
    public void  player_loses_when_dice_number_is_too_low() {

//        Dice dice =  new Dice( 6);
        //        Creamos dado simulado con mockito
        Dice dice =  Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);
        Player player = new Player(dice, 2);
        assertEquals(false, player.play());
    }

    @Test
    public void  player_wins_when_dice_number_is_big() {

        Dice dice =  Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);
        Player player = new Player(dice, 3);
//        assertEquals(true, player.play());
        assertTrue(player.play());
    }


}