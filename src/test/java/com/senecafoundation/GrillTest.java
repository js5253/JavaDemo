package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class GrillTest {

    private Grill systemUnderTest;

    @BeforeEach
    void assignGrill() {
        this.systemUnderTest = new Grill(
        );
    }

    @Test 
    void testGrillCreate() {
        assertEquals(0, this.systemUnderTest.temperature);
        assertEquals(false, this.systemUnderTest.power);
    }

    @Test
    void testTemp() {
        this.systemUnderTest.increaseTemp(5);
        assertEquals(this.systemUnderTest.temperature, 5);
        this.systemUnderTest.decreaseTemp(3);
        assertEquals(this.systemUnderTest.temperature, 2);
    }

    @Test
    void testCanTurnOn() {
        this.systemUnderTest.turnOn();
        assertEquals(this.systemUnderTest.power, true);
        this.systemUnderTest.turnOff();
        assertEquals(this.systemUnderTest.power, false);
    }

    
}
