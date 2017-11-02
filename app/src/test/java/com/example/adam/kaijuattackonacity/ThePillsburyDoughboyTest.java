package com.example.adam.kaijuattackonacity;

import com.example.adam.kaijuattackonacity.Kaijua.KingKong;
import com.example.adam.kaijuattackonacity.Kaijua.ThePillsburyDoughboy;

import static junit.framework.Assert.*;

import org.junit.Test;

/**
 * Created by adam on 01/11/2017.
 */

public class ThePillsburyDoughboyTest {

    @Test

    public void testHealth() {
        //Arrange is create object of type KingKong
        //Act is act on method (getHealth())
        //Assert health matches what i expect

        //To create any object you say
        // Type variableName = new Type()

        ThePillsburyDoughboy thePillsburyDoughboy = new ThePillsburyDoughboy("Blob", 800, 40);

        //I need to get health from kingkong
        int health = thePillsburyDoughboy.getHealth();

        //Assert stuff
        assertEquals(800, health);

    }

    @Test
    public void testCanRoar() {
        ThePillsburyDoughboy thePillsburyDoughboy = new ThePillsburyDoughboy("Blob", 800, 40);
        String roar = thePillsburyDoughboy.roar();
        assertEquals("roar!", roar);
    }

    @Test
    public void hasName() {
        ThePillsburyDoughboy thePillsburyDoughboy = new ThePillsburyDoughboy("Blob", 800, 40);
        String name = thePillsburyDoughboy.name();
        assertEquals("Blob", name);
    }

    @Test
    public void hasAttack() {
        ThePillsburyDoughboy thePillsburyDoughboy = new ThePillsburyDoughboy("Blob", 800, 40);
        int attack = thePillsburyDoughboy.getAttack();
        assertEquals(40, attack);
    }

}
