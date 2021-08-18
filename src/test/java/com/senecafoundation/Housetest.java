

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

 public class HouseTest {

    private House systemUnderTest;

    @BeforeEach
    void assignRoom() {
        this.systemUnderTest = new Room(
        );
    }
    @Test
    void testRooms() {
        this.systemUnderTest.renovate();
        assertEquals (this.systemUnderTest.y, true);
        assertEquals (this.systemUnderTest.n, false);
    }
}


