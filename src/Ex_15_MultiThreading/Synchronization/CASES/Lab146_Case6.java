package Ex_15_MultiThreading.Synchronization.CASES;

public class Lab146_Case6 {
    public static void main(String[] args) throws Exception{
        Sync5 s1=new Sync5();
//        Sync5 s2=new Sync5();
        A5 ta=new A5(s1,"A");
        ta.start();
        B5 tb=new B5(s1,"B");
        tb.start();
    }
}

class A5 extends Thread {

    Sync5 s;

    public A5(Sync5 s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m1();
    }


}

class B5 extends Thread {

    Sync5 s;

    public B5(Sync5 s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m2();
    }
}

class Sync5 {
    static synchronized void m1() {
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(th.getName() + " - m1 -" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
            }
        }
    }

    static synchronized void m2() {
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