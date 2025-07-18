// Create a Thread by class.

package ex_27_Thread;

public class Lab_253_Interview {
    public static void main(String[] args) {

       ThreadGroup threadGroup = new ThreadGroup("Workers");

        Runnable w1 = new WorkerTh2();
        Thread t1 = new Thread(w1);
        t1.start();

        Runnable w2 = new WorkerTh2();
        Thread t2 = new Thread(w2);
        t2.start();

        for (int i = 0; i < 10; i++){
            System.out.println(i + " - " + Thread.currentThread().getName());
        }

    }
}

// Thread by class

class WorkerTh2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}