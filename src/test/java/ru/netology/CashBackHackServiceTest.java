package ru.netology;

//import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;


//import static org.testng.Assert.assertEquals;

import static org.junit.Assert.*;

public class CashBackHackServiceTest {

    @org.junit.Test
     public void remain() {
        int amount = 1000;
        int expected = 0;
        CashBackHackService cashBack = new CashBackHackService();
        int actual = cashBack.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }
}