package com.playdice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dice {
    private int value;
    private int position;
}
