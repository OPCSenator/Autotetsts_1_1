package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackHackServiceTest {

    @Test
    void remain() {
        int amount = 900;
        int expected = 100;
        CashBackHackService cashBack = new CashBackHackService();
        int actual = cashBack.remain(amount);
        assertEquals(expected, actual);
    }
}