package Ex_13_ExceptionHandling;

public class CustomExceptionExample {
    public static void main() throws BankCurrencyMismatchException {

        Bank sbi = new Bank("INR", 100);
        Bank icici = new Bank("INR", 200);
        int total = sbi.add(icici);
        System.out.println(total);

        Bank jpmorgan = new Bank("USD", 50);
        int total1 = icici.add(jpmorgan);
        System.out.println(total1);

    }
}
