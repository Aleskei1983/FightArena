package com.ABriukhachev;

public class Mag extends Warior{
    private int mana;
    private int maxMana;
    private int magicAttack;

    public Mag (String name, int lives, int attack, int defence, GameCube gameCube, int mana, int magicAttack){
        super(name, lives, attack, defence, gameCube);
        this.mana = mana;
        this.maxMana = mana;
        this.magicAttack = magicAttack;
    }
    @Override
    public void attackOpponent(Warior opponent){
        int strike = 0;
        if (mana < maxMana){
            mana += 10;
            if (mana > maxMana) {
                mana = maxMana;
            }
            strike = attack + gameCube.play();
            setupMessage(String.format("%s attacking with a punch with %s hp", name, strike));
        } else {
            strike = magicAttack + gameCube.play();
            setupMessage(String.format("%s use the magic with %s hp", name, strike));
            mana = 0;
        }
        opponent.defendYourself(strike);
    }
    public String graficMana(){
        return graficIndicator(mana, maxMana);
    }
}
