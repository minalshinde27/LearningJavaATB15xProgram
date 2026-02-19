package Ex_15_MultiThreading.Synchronization;

import java.util.ArrayList;

public class Lab150_SyncBasics {
    public static void main(String[] args) {

//        Sync001 a = new Sync001();
//        a.m1();
//        a.m2();
//        a.m3();
//        a.m4();

    }
}

class Sync001 {
    void m1() {
        synchronized (this.getClass()) {
            System.out.println("Default Object of Class will be locked!!");
        }
    }

    static void m2() {
        synchronized (Sync001.class) {
            System.out.println("Default Object of Class will be locked!!");
        }
    }

    void m3() {
        synchronized (this) {
            System.out.println("Current Object of Class will be locked!!");
        }
    }

    void m4() {
        ArrayList a = new ArrayList();
        synchronized (a) {
            //t1, t2 will not add to the 'a' now
            System.out.println("Third Party Object of Class will be locked!!");
        }
    }


}
