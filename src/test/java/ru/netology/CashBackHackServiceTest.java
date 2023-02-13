package ru.netology;

//import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;


import static org.testng.Assert.assertEquals;

class CashBackHackServiceTest {

    @org.testng.annotations.Test
     void remain() {
        int amount = 900;
        int expected = 100;
        CashBackHackService cashBack = new CashBackHackService();
        int actual = cashBack.remain(amount);
        assertEquals(actual, expected);
    }
}