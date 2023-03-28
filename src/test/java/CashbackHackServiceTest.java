import org.testng.annotations.Test;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @Test
    void remainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);
    }




}