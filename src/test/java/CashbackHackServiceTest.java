import org.junit.Test;

class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }
}