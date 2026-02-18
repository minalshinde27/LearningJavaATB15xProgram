package Ex_15_MultiThreading;

public class Lab128_ThreadBasics {
    public static void main(String[] args) throws InterruptedException {

        Thread t = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println(i+" - "+t.getThreadGroup());
            System.out.println(i+" - "+t.getName());
            System.out.println(i+" - "+t.getPriority());
            Thread.sleep(1000);
            // Who is creating this Thread?
            // JVM
        }
    }
}
