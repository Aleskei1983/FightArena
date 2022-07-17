package com.ABriukhachev;

public class Warior {
    protected String name;
    protected int health;
    protected int maxHealth;
    protected int attack;
    protected int defence;
    protected GameCube gameCube;
    public String message;

    public Warior(String name, int lives, int attack, int defence, GameCube gameCube){
        this.name = name;
        this.health = lives;
        this.maxHealth = lives;
        this.attack = attack;
        this.defence = defence;
        this.gameCube = gameCube;
    }
    public boolean alive() {
        return (health > 0);
    }
    protected String graficIndicator(int actual, int maximum){
        String s = "[";
        int quite = 20;
        double numbers = Math.round(((double)actual / maximum) * quite);
        if ((numbers == 0) && (alive()))
            numbers = 1;
        for (int i = 0; i < numbers; i++){
            s += "#";
        }
        for (int i = 0; i < quite - numbers; i++){
            s += " ";
        }
        s += "]";
        return s;
    }
    public void attackOpponent(Warior opponent){
        int strike = attack + gameCube.play();
        setupMessage(String.format("%s attacking with a punch with %s hp", name, strike));
        opponent.defendYourself(strike);
    }
    public void defendYourself(int strike){
        int injury = strike - (defence + gameCube.play());
        if (injury > 0){
            health -= injury;
            message = String.format("%s suffered damage %s hp", name, injury);
            if (health <= 0) {
                health = 0;
                message += " and die";
            }
        }
            else
                message = String.format("%s repuls attack", name);
            setupMessage(message);
    }
    protected void setupMessage(String message) {
        this.message = message;
    }
    public String returnLastMessage() {
        return message;
    }
    public String graficHealth(){
        return graficIndicator(health, maxHealth);
    }
    @Override
    public String toString(){
        return name;
    }
}
