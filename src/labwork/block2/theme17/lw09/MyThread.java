package labwork.block2.theme17.lw09;

public class MyThread extends Thread {
    private int numberOfThread;
    private MyObject myObject1;
    private MyObject myObject2;
    private MyObject myObject3;

    public MyThread(int numberOfThread, MyObject myObject1, MyObject myObject2, MyObject myObject3) {
        this.numberOfThread = numberOfThread;
        this.myObject1 = myObject1;
        this.myObject2 = myObject2;
        this.myObject3 = myObject3;
    }

    public int getNumberOfThread() {
        return numberOfThread;
    }

    @Override
    public void run() {
        switch (this.getNumberOfThread()) {
            case 0:
                synchronized (myObject1) {
                    System.out.println(getName() + ": Holding lock 1...");
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + ": Waiting for lock 2...");
                    synchronized (myObject2) {
                        System.out.println(getName() + ": Holding lock 1 and 2...");
                    }
                }

                break;
            case 1:
                synchronized (myObject2) {
                    System.out.println(getName() + ": Holding lock 2...");
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + ": Waiting for lock 3...");
                    synchronized (myObject3) {
                        System.out.println(getName() + ": Holding lock 2 and 3...");
                    }
                }

                break;
            case 2:
                synchronized (myObject3) {
                    System.out.println(getName() + ": Holding lock 3...");
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + ": Waiting for lock 1...");
                    synchronized (myObject1) {
                        System.out.println(getName() + ": Holding lock 3 and 1...");
                    }
                }

                break;
        }
    }
}
