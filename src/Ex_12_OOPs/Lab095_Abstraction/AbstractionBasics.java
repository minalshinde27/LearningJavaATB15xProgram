package Ex_12_OOPs.Lab095_Abstraction;

public class AbstractionBasics {
    public static void main() {
        Son s1 = new Son();
        s1.loan50K();
        s1.loan10K();
        System.out.println(s1.fatherIncome);
        s1.myLoan();
        System.out.println(s1.sonSal);
    }
}

abstract class Father {
    abstract void loan50K();    //'abstract' method does not have body
    void loan10K(){             //Concrete/complete method
        System.out.println("Paid 10K");
    }
    int fatherIncome = 50000;
}

class Son extends Father {
    @Override           //Child class has to override and complete abstract method of parent class
    void loan50K() {
        System.out.println("Son paid 50K");
    }
    void myLoan(){
        System.out.println("Son has own 75K loan");
    }
    int sonSal = 100000;
}
