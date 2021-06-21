package Account;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);

        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }

    @Test
    public void depositCannotAcceptNegative() {
        Account account = new Account(20);

        Assert.assertEquals(false, account.deposit(-10));
    }

    @Test
    public void withdrawCannotAcceptNegative() {
        Account account = new Account(20);

        Assert.assertEquals(false, account.withdraw(-10));
    }

    @Test
    public void cannotOverstepLimit() {
        Account account = new Account(20);
        account.withdraw(30);

        Assert.assertEquals(0d, account.getBalance(), epsilon);
    }

    @Test
    public void correctDeposit() {
        Account account = new Account(20);

        Assert.assertEquals(true, account.deposit(10));
    }

    @Test
    public void correctWithdraw() {
        Account account = new Account(20);

        Assert.assertEquals(true, account.withdraw(10));
    }

    @Test
    public void correctDepositAccount() {
        Account account = new Account(20);
        account.deposit(10);
        Assert.assertEquals(10d, account.getBalance(), epsilon);
    }

    @Test
    public void correctWithdrawAccount() {
        Account account = new Account(20);
        account.withdraw(10);
        Assert.assertEquals(-10d, account.getBalance(), epsilon);
    }
}
