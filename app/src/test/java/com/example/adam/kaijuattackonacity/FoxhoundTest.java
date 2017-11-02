package com.example.adam.kaijuattackonacity;

import Vehicle.Foxhound;

import static junit.framework.Assert.*;
import org.junit.Test;

/**
 * Created by adam on 01/11/2017.
 */

public class FoxhoundTest {

    @Test
    public void getType() {
        Foxhound foxhound = new Foxhound("Army Car", 500);
        String type = foxhound.type();
        assertEquals("Army Car", type);
    }

}
