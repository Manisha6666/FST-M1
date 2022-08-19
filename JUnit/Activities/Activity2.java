package activities;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class Activity2 {

    @Test
    public void notEnoughFunds()
    {
        BankAccount bankAccount = new BankAccount(10);
        assertThrows(NotEnoughFundsException.class,()->bankAccount.withdraw(100));
    }

    @Test
    public void enoughFunds()
    {
        BankAccount bankAccount = new BankAccount(100);
        assertDoesNotThrow(() -> bankAccount.withdraw(100));
    }
}

