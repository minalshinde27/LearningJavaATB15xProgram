package Ex_15_MultiThreading.Synchronization;

public class Lab149_BalanceSyncExample {
    public static void main(String[] args) {

        Bank at = new Bank();
        Runnable runnable = new AccountThread(at);
        Thread th1 = new Thread(runnable, "Pramod");
        th1.start();
        Thread th2 = new Thread(runnable, "Ajim");
        th2.start();

    }
}

class AccountThread implements Runnable {
    Bank bank;

    public AccountThread(Bank accService) {
        this.bank = accService;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            bank.withdraw(225);
            if (bank.getBalance() < 0) {
                System.out.println("Amount Max out!!");
            }
        }
    }
}


class Bank {
    int balance = 1000;

    //In case if we do not synchromize withdraw method, there are chances that the validation
    // won't work properly as multiple thread will try to access same object 'balance' at same time

    //   void withdraw(int amountTo) {
    synchronized void withdraw(int amountTo) { // Fixed
        Thread th=Thread.currentThread();
        if (balance >= amountTo) {
            System.out.println("Withdraw -> " + amountTo+ " \t " + th.getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            balance = balance - amountTo;
            System.out.println(balance + " done -> \t" +th.getName());
        } else {
            System.out.println("Low Balance");
        }
    }

    public int getBalance() {
        return balance;
    }


}
