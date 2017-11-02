package com.example.adam.kaijuattackonacity;

import com.example.adam.kaijuattackonacity.Kaijua.KingKong;

// DONT FORGET THIS WHEN TRYING TO USE assertEquals()
import static junit.framework.Assert.*;

//import org.junit.Before;
import org.junit.Test;

/**
 * Created by adam on 01/11/2017.
 */


//Test classes dont extend
//Name is normally {WhateverClass}Test
public class KingKongTest {


//
//    @Before
//    public void before() {
//        kingKong = new KingKong("Kong", 1000, 80);
//    }



    @Test
    public void testHealth() {
        //Arrange is create object of type KingKong
        //Act is act on method (getHealth())
        //Assert health matches what i expect

        //To create any object you say
        // Type variableName = new Type()

        KingKong kingKong = new KingKong("Kong", 1000, 80);

        //I need to get health from kingkong
        int health = kingKong.getHealth();

        //Assert stuff
        assertEquals(1000, health);

    }

    @Test
    public void testCanRoar() {
        KingKong kingKong = new KingKong("Kong", 1000, 80);
        String roar = kingKong.roar();
        assertEquals("roar!", roar);
    }

    @Test
    public void hasName() {
        KingKong kingKong = new KingKong("Kong", 1000, 80);
        String name = kingKong.name();
        assertEquals("Kong", name);
    }

    @Test
    public void hasAttack() {
        KingKong kingKong = new KingKong("Kong", 1000, 80);
        int attack = kingKong.getAttack();
        assertEquals(80, attack);
    }
}
