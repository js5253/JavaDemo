package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

 Public class RoomTest {

    private Room systemUnderTest;

    @BeforeEach
    void assignRoom() {
        this.systemUnderTest = new Room(
        );
    }
    @Test
    void testRooms() {
        this.systemUnderTest.renovate();
        assertEquals(this.systemUnderTest.y, true);
        this.systemUnderTest.();
        assertEquals(this.systemUnderTest.n, false);
    }
