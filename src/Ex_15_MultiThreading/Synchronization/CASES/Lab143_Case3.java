package Ex_15_MultiThreading.Synchronization.CASES;

public class Lab143_Case3 {
    public static void main(String[] args) throws Exception{
        Sync2 s1=new Sync2();
//        Sync2 s2=new Sync2();
        A2 ta=new A2(s1,"A");
        ta.start();
        B2 tb=new B2(s1,"B");
        tb.start();
    }
}

class A2 extends Thread {

    Sync2 s;

    public A2(Sync2 s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m1();
    }


}

class B2 extends Thread {

    Sync2 s;

    public B2(Sync2 s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m2();
    }
}

class Sync2 {
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

    synchronized void m2() {
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
