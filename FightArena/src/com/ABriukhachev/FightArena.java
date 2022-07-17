package com.ABriukhachev;

public class FightArena {
    private Warior warior1;
    private Warior warior2;
    private GameCube gameCube;

    public FightArena(Warior warior1, Warior warior2, GameCube gameCube){
        this.warior1 = warior1;
        this.warior2 = warior2;
        this.gameCube = gameCube;
    }
    private void presentWarior(Warior w){
        System.out.println(w);
        System.out.print("Health: ");
        System.out.println(w.graficHealth());
        if (w instanceof Mag){
            System.out.print("Mana: ");
            System.out.println(((Mag)w).graficMana());
        }
    }
    private void renderFightArena(){
        System.out.println("----------------------Fight Arena----------------------");
        System.out.println("Fighters:\n");
        presentWarior(warior1);
        System.out.println();
        presentWarior(warior2);
        System.out.println();
    }
    private void fightListing(String message){
        System.out.println(message);
        try {
            Thread.sleep(500);
        }catch (InterruptedException ex){
            System.err.println("Error");
        }
    }
    public void fight(){
        Warior w1 = warior1;
        Warior w2 = warior2;
        System.out.println("Welcome to Fight Arena!");
        System.out.printf("Today's fight %s vs %s!\n\n", warior1, warior2);
        boolean startWarior2 = (gameCube.play() <= gameCube.returnNumShape()/2);
        if (startWarior2){
            w1 = warior2;
            w2 = warior1;
        }
        System.out.printf("%s will begin!\n\n FIGHT...\n\n", w1);

        while (w1.alive() && w2.alive()){
            w1.attackOpponent(w2);
            renderFightArena();
            fightListing(w1.returnLastMessage());
            fightListing(w2.returnLastMessage());
            if (w2.alive()){
                w2.attackOpponent(w1);
                renderFightArena();
                fightListing(w2.returnLastMessage());
                fightListing(w1.returnLastMessage());
            }
            System.out.println();
        }
    }
}
