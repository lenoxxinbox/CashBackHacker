package ru.netology.service;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void calculateCashBackAverage() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(500);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    public void calculateCashBackMin() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void calculateCashBackMaxByThousand() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void calculateCashBackZero() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void calculatePurchaseZero() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void calculatePurchaseBig() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(9_999_999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void calculateCashBackMinFromBig() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(50_000_000);
        int expected = 0;

        assertEquals(actual, expected);
    }

}