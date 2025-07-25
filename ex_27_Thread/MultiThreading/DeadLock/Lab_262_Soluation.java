package ex_27_Thread.MultiThreading.DeadLock;

public class Lab_262_Soluation {

    public static void main(String[] args) {
        Lab_262_Soluation tdSolution = new Lab_262_Soluation();

        final Resource1 a = tdSolution.new Resource1();
        final Resource2 b = tdSolution.new Resource2();

        // Thread-1
        Runnable b1 = new Runnable() {
            @Override
            public void run() {
              synchronized (b) {
                  try {
                      // Adding delay so that both threads can start trying to lock resources
                      Thread.sleep(100);
                  }catch (InterruptedException e){
                      e.printStackTrace();
                  }

                  // Thread-1 have resource1 but need resource2 also
                  synchronized (a) {
                      System.out.println("In block 1");
                  }
              }
            }
        };

        // Thread-2
        Runnable b2 = new Runnable() {
            @Override
            public void run() {
                synchronized (b) {
                    // Thread-1 have resource1 but need resource2 also
                    synchronized (a) {
                        System.out.println("In block 2");
                    }
                }
            }
        };

        new Thread(b1).start();
        new Thread(b2).start();
    }

    // resource1
    private class Resource1 {
        private int i = 10;

        public int getI() { return i; }
    }

    // resource2
    private class Resource2 {
        private int i = 10;

        public int getI() { return i; }

        public void setI(int i){ this.i = i; }
    }
}
