package com.ABriukhachev;

public class Main {

    public static void main(String[] args) {
		GameCube gameCube = new GameCube(10);
		Warior aragorn = new Warior("Aragorn", 140, 28, 24, gameCube);
        Warior sauron = new Mag("Sauron", 120, 20, 18, gameCube, 40, 65);
        FightArena arena = new FightArena(aragorn, sauron, gameCube);
        arena.fight();
    }
}
