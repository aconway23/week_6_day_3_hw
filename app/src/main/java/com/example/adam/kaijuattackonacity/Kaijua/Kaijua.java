package com.example.adam.kaijuattackonacity.Kaijua;

/**
 * Created by adam on 01/11/2017.
 */

/*
    Abstract class cannot be created
    So i cannot say

    Kaijua monster = new Kaijua("Name",4,5);

 */
public abstract class Kaijua {

    /*
        Declare my instance values / variables.
        So for example:

        boolean isTired;
     */

    private String name;
    private int health;
    private int attack;


    public Kaijua(String name, int health, int attack) {
        /*
            Like in ruby where had @name = name. We need to do the same
            But in java, we say this.name (which is like @name).
         */

        //This.name is instance variable
        //name is coming from public Kaijua(String name,....
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    /*
        To create a method we say
            [Access Modifier]         [Return type]         methodName(int a, String b) {}
            public/private/protected  string/int/double/
     */
    public String roar() {
        return "roar!";
    }

    public int getHealth() {
        return this.health;
    }

    public String name() {
        return this.name;
    }

    public int getAttack() {
        return this.attack;
    }
}

//Kaijua monster = new Kaijua("darren")