package Ex_12_OOPs.Lab095_Abstraction;

public class MultipleInheritanceThroughInterfaces {
    public static void main() {
        Son1 s1 = new Son1();
        s1.myMoney();
    }
}

interface Father1 {
    void moneyF1();
    String nameF1 = "Father1";
}

interface Father2 {
    void moneyF2();
    void pattern();
    String nameF2 = "Father2";
}

abstract class Mother {
   abstract void moneyM();
   void care(){
       System.out.println("Mother's care");
   }
}

class Son1 extends Mother implements Father1, Father2 {

    @Override
    public void moneyF2() {
        System.out.println("Father2 Money");
    }

    @Override
    public void pattern() {
        System.out.println("Father2 Pattern");
    }

    @Override
    public void moneyF1() {
        System.out.println("Father1 Money");
    }

    @Override
    void moneyM() {
        System.out.println("Mother's Money");
    }

    int myFunds = 100000;
    void myMoney(){
        System.out.println(nameF1);
        moneyF1();
        System.out.println(nameF2);
        moneyF2();
        pattern();
        care();
        moneyM();
        System.out.println("My Money");
        System.out.println(myFunds);
    }
}