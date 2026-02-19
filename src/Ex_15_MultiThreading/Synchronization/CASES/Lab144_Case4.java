package Ex_15_MultiThreading.Synchronization.CASES;

public class Lab144_Case4 {
    public static void main(String[] args) throws Exception{
        Sync3 s1=new Sync3();
//        Sync3 s2=new Sync3();
        A3 ta=new A3(s1,"A");
        ta.start();
        B3 tb=new B3(s1,"B");
        tb.start();
    }
}

class A3 extends Thread {

    Sync3 s;

    public A3(Sync3 s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m1();
    }


}

class B3 extends Thread {

    Sync3 s;

    public B3(Sync3 s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m2();
    }
}

class Sync3 {
    synchronized void m1() {
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