package Ex_15_MultiThreading.Synchronization.CASES;

public class Lab142_Case2 {
    public static void main(String[] args) throws Exception{
        Sync1 s1=new Sync1();
//        Sync1 s2=new Sync1();
        A1 ta=new A1(s1,"A");
        ta.start();
        B1 tb=new B1(s1,"B");
        tb.start();
    }
}

class A1 extends Thread {

    Sync1 s;

    public A1(Sync1 s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m1();
    }


}

class B1 extends Thread {

    Sync1 s;

    public B1(Sync1 s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m2();
    }
}

class Sync1 {
    void m1() {
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(th.getName() + " - m1 -" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
            }
        }
    }

    void m2() {
        Thread th = Thread.currentThread();
        for (int i = 101; i <= 105; i++) {
            System.out.println(th.getName() + " - m2 -" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
            }
        }
    }
}
