package com.example.app.AnimalWorld.utils;

import com.example.app.AnimalWorld.model.Animals;

public class RandomPositionEnum {
    public static int getRandomInRange() {
        return (int) (Math.random() * (Animals.values().length));
    }
}
