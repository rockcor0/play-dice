package com.playdice.service;

import com.playdice.model.Dice;
import com.playdice.dto.DiceQuantity;
import com.playdice.model.GameData;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class WebService {
    private final DiceService diceService;

    @PostMapping(value = "/launch", consumes = "application/json")
    public ResponseEntity<?> launchDices(@RequestBody DiceQuantity diceQuantity){
        GameData response = diceService.launchDice(diceQuantity.ordinal() + 1);
        return ResponseEntity.ok(response);
    }
}
