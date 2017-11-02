package com.example.adam.kaijuattackonacity.Kaijua;

/**
 * Created by adam on 01/11/2017.
 */

public class KingKong extends Kaijua {

    //Constructors are methods they:
    //   have no return type
    //   have same name as class
    //  so class Derp
    //    public Derp(....)
    public KingKong(String name, int health, int attack) {

        //When i say super in a constructor
        //I am actually calling my parents construtor
        //In this case, look to the public Kaiju(String ..

        /*
            So if i call KingKong kingKong = new KingKong("Bob", 100, 4);
            it comes into here so
            name = "Bob";
            health = 100;
            attack = 4;

            Calling super will look
            super("Bob", 100, 4);

            In kaiju this then sets
               this.name = "Bob";
               this.health = 100;
               this.attck = 4;

         */
        super(name, health, attack);
    }
}
