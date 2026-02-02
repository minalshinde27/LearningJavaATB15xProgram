package Ex_13_ExceptionHandling;

public class Bank {
    private String currency;
    private int amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Bank(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public int add (Bank bankName) throws BankCurrencyMismatchException {
        if(bankName.currency.equals("INR")) {
            return bankName.amount + this.amount;
        } else {
            throw new BankCurrencyMismatchException("Currency Mismatch");
        }
    }
}

class BankCurrencyMismatchException extends Exception {
    BankCurrencyMismatchException (String msg){
        super(msg);
    }
}