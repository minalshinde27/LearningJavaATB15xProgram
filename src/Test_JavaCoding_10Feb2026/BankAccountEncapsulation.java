package Test_JavaCoding_10Feb2026;

public class BankAccountEncapsulation {
    public static void main() {
        BankAccount b = new BankAccount(1000, 500, 200);
        System.out.println("Initial Balance is : "+b.getBalance());
        b.deposit();
        System.out.println("Balance after Deposit : "+b.getBalance());
        b.withdrawal();
        System.out.println("Balance after Withdrawal : "+b.getBalance());
    }
}

class BankAccount{
    private int balance;
    private int dMoney;
    private int wMoney;

    public BankAccount(int balance, int dMoney, int wMoney) {
        this.balance = balance;
        this.dMoney = dMoney;
        this.wMoney = wMoney;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(){
        if(dMoney>0){
            this.balance = balance+dMoney;
       //     return balance;
        } else {
            System.out.println("Negative Deposits Not Allowed");
        }

    }

    public void withdrawal(){
        if(wMoney<balance){
            this.balance = balance-wMoney;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
