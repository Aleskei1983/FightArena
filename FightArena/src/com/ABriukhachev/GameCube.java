package com.ABriukhachev;
import java.util.Scanner;
import java.util.Random;

public class GameCube {
    private Random random;
    private int numShape;

    public GameCube(int numShape){
        this.numShape = numShape;
        random = new Random();
    }

    public int returnNumShape(){
        return numShape;
    }

    public int play(){
        return random.nextInt(numShape) + 1;
    }
    @Override
    public String toString(){
        return String.format("Game cube with %s shapes", numShape);
    }
}
