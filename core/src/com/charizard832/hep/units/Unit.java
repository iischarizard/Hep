package com.charizard832.hep.units;

/**
 * Created by l on 10/8/17.
 */

public abstract class Unit {

    private int health, attack, rarity, level, exp;
    private boolean healer;
    private Type type;


    public Unit(int health, int attack, Type type){
        this.health = health;
        this.attack = attack;
        this.rarity = 1;
        this.type = type;
        level = 1;
        exp = 0;
        healer = false;
    }

    public Unit(int health, int attack, int rarity, Type type){
        this.health = health;
        this.attack = attack;
        this.rarity = rarity;
        level = 1;
        exp = 0;
        healer = false;
    }

    public Unit(int health, int attack, int rarity, boolean healer, Type type){
        this.health = health;
        this.attack = attack;
        this.healer = healer;
        this.rarity = rarity;

    }


    public int getHealth(){return health;}
    public int getAttack(){return attack;}
    public int getRarity(){return rarity;}
    public int getLevel(){return level;}
    public int getExp(){return exp;}
    public boolean isHealer(){return healer;}
    public Type getType(){return type;}

    public void setHealth(int health){this.health = health;}
    public void setAttack(int attack){this.attack = attack;}
    public void setRarity(int rarity){this.rarity = rarity;}
    public void setLevel(int level){this.level = level;}
    public void setExp(int exp){this.exp = exp;}
    public void setHealer(boolean healer){this.healer = healer;}
    public void setType(Type type){this.type = type;}

}
