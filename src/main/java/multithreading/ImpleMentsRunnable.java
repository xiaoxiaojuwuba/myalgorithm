package multithreading;

import java.time.LocalDateTime;

public class ImpleMentsRunnable implements Runnable {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ImpleMentsRunnable thread = new ImpleMentsRunnable();
        Thread thread1 = new Thread(thread);
        thread1.setName("S1");
        Thread thread2 = new Thread(thread);
        thread2.setName("S2");

        thread1.start();

        thread2.start();
    }

    public void run() {
        // TODO Auto-generated method stub
        synchronized (this) {
            for (int i = 0; i < 5; i++) {

                System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getId() + "  "
                        + LocalDateTime.now() + " " + i);
            }
        }

    }

}
