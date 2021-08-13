package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class MicrowaveTest {

    private Microwave systemUnderTest;

    @BeforeEach
    void assignMicrowave() {
        this.systemUnderTest = new Microwave(
        );
    }

    @Test 
    void testMicrowaveCreate() {
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
