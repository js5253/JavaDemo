package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class CarTest {

    private Car systemUnderTest;

    @BeforeEach
    void assignCar() {
        this.systemUnderTest = new Car(50, true, 4);
    }

    @Test 
    void testCarCreate() {
        assertEquals(50, this.systemUnderTest.getRpms());
        assertEquals(true, this.systemUnderTest.getIsDoorOpen());
    }

    @Test
    void testRPM() {
        this.systemUnderTest.increaseRpm(5);
        assertEquals(this.systemUnderTest.getRpms(), 55);
        this.systemUnderTest.decreaseRpm(3);
        assertEquals(this.systemUnderTest.getRpms(), 52);
    }

    @Test
    void testDoor() {
        this.systemUnderTest.openDoor();
        assertEquals(this.systemUnderTest.getIsDoorOpen(), true);
        this.systemUnderTest.closeDoor();
        assertEquals(this.systemUnderTest.getIsDoorOpen(), false);
    }

    
}
