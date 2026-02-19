package Ex_15_MultiThreading.Synchronization.CASES;

public class Lab145_Case5 {
    public static void main(String[] args) throws Exception{
        Sync4 s1=new Sync4();
//        Sync s2=new Sync();
        A4 ta=new A4(s1,"A");
        ta.start();
        B4 tb=new B4(s1,"B");
        tb.start();
    }
}

class A4 extends Thread {

    Sync4 s;

    public A4(Sync4 s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m1();
    }


}

class B4 extends Thread {

    Sync4 s;

    public B4(Sync4 s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m2();
    }
}

class Sync4 {
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
