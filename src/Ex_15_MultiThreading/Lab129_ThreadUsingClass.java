package Ex_15_MultiThreading;

public class Lab129_ThreadUsingClass {
    public static void main(String[] args) {

        Worker worker = new Worker();
        worker.start();
        // Where is the Start ?
        Worker worker2 = new Worker();
        worker2.start();

    }
}

class Worker extends Thread{

    Worker(ThreadGroup threadGroup,String name){
        super(threadGroup,name);
    }

    Worker(){
        super();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(i  + " --> "+ Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}