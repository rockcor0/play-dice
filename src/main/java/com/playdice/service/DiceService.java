package com.playdice.service;

import com.playdice.model.Dice;
import com.playdice.model.GameData;

import java.util.Arrays;

@org.springframework.stereotype.Service
public class DiceService {

    public GameData launchDice(int dicesQuantity){
        Dice[] dices = new Dice[dicesQuantity];
        int total = 0;
        for (int i=0; i<dices.length; i++) {
            int value = (int)(Math.random()*6+1);
            dices[i] = new Dice(value, i);
            total += dices[i].getValue();
        }
        GameData gameData = new GameData(dices, total);

        System.out.println(Arrays.toString(gameData.getDices()) + " - " + total);
        return gameData;
    }
}
