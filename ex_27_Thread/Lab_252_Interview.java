// Create a Thread by class.

package ex_27_Thread;

public class Lab_252_Interview {
    public static void main(String[] args) {

       ThreadGroup threadGroup = new ThreadGroup("Workers");

        // Task 1 go from 1 to 5

        WorkerTh w1 = new WorkerTh(threadGroup, "W1");
        w1.start();

        WorkerTh w2 = new WorkerTh(threadGroup, "W2");
        w2.start();

    }
}

// Thread by class

class WorkerTh extends Thread{

    WorkerTh(ThreadGroup threadGroup, String name){ super(threadGroup,name); }


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