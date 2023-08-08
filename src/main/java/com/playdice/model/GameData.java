package com.playdice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class GameData {
    private Dice[] dices;
    private int total;
}
