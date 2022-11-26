package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void boundaryValuesTest1() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void boundaryValuesTest2() {
        assertEquals(service.remain(1000),  0);
    }

    @Test
    public void boundaryValuesTest3() {
        assertEquals(service.remain(1001), 999);
    }

    @Test
    public void boundaryValuesTest4() {
        assertEquals(service.remain(1999), 1);
    }

    @Test
    public void boundaryValuesTest5() {
        assertEquals(service.remain(2000), 0);
    }

    @Test
    public void boundaryValuesTest6() {
        assertEquals(service.remain(2001), 999);
    }
    @Test
    public void correctAmountTest() {
        assertEquals(service.remain(423), 577);
    }
    @Test
    public void correctAmountTest1() {
        assertEquals(service.remain(1500), 500);
    }

    @Test
    public void correctAmountTest2() {
        assertEquals(service.remain(1899), 101);
    }

    @Test
    public void correctAmountTest3() {
        assertEquals(service.remain(2394), 606);
    }
}
