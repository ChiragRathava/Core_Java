package ex_27_Thread.MultiThreading.joinDemo;

public class Lab_264 {

    public static void main(String[] args) {
        Work h1 = new Work();
        MyThread th1 = new MyThread(h1,"A");
        th1.start();

        try {
            th1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(th.getName() + "--" + i);
            try { Thread.sleep(1000); }
            catch (Exception e){}
        }
    }
}

class MyThread extends Thread {
    Work work;

    public MyThread(Work hello, String tname){
        super(tname);
        this.work = hello;
    }

    public void run(){ work.show(); }
}

class Work {
    void show() {
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(th.getName() + "--" + i);
            try { Thread.sleep(1000); }
            catch (Exception e){}
        }
    }
}