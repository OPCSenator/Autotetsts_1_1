package ru.netology;

//import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;


import static org.testng.Assert.assertEquals;

class CashBackHackServiceTest {

    @org.testng.annotations.Test
     void remain() {
        int amount = 1000;
        int expected = 0;
        CashBackHackService cashBack = new CashBackHackService();
        int actual = cashBack.remain(amount);
        assertEquals(actual, expected);
    }
}