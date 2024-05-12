package AlanTuring.Programs;

import static org.junit.jupiter.api.Assertions.*;

class CountUpTest {

    @org.junit.jupiter.api.Test
    void countUp() {
        CountUp cu = new CountUp();
        cu.countUp();
        assertEquals(0, cu.i);
    }

}