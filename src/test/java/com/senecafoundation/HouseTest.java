package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

 public class HouseTest {

    private House systemUnderTest;

    @BeforeEach
    void assignRoom() {
        this.systemUnderTest = new House(
        );
    }

    @Test
    void testHouse() {
        this.systemUnderTest.buildRoom();
        assertEquals(this.systemUnderTest.numRooms, 1);
        this.systemUnderTest.demolishRoom();
        assertEquals(this.systemUnderTest.numRooms, 0);
    }
 }
    