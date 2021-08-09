package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class CarTest {

    private Car systemUnderTest;

    @BeforeEach
    void assignCar() {
        this.systemUnderTest = new Car(
        );
    }

    @Test 
    void testCarCreate() {
        assertEquals(0, this.systemUnderTest.rpms);
        assertEquals(null, this.systemUnderTest.isDoorOpen);
    }

    @Test
    void testRPM() {
        this.systemUnderTest.increaseRpm(5);
        assertEquals(this.systemUnderTest.rpms, 5);
        this.systemUnderTest.decreaseRpm(3);
        assertEquals(this.systemUnderTest.rpms, 2);
    }

    @Test
    void testDoor() {
        this.systemUnderTest.openDoor();
        assertEquals(this.systemUnderTest.isDoorOpen, true);
        this.systemUnderTest.closeDoor();
        assertEquals(this.systemUnderTest.isDoorOpen, false);
    }

    
}
