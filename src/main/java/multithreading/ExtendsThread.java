package multithreading;

import java.time.LocalDateTime;

public class ExtendsThread extends Thread {

    public static void main(String[] args) {
        ExtendsThread thread = new ExtendsThread();
        Thread thread1 = new Thread(thread);
        thread1.setName("S1");
        Thread thread2 = new Thread(thread);
        thread2.setName("S2");

        thread1.start();

        thread2.start();

    }

    @Override
    public void run() {

        // synchronized (this)
        //
        {
            for (int i = 0; i < 5; i++) {
                try {
                    sleep(1000);
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getId() + "  "
                        + LocalDateTime.now() + " " + i);
            }
        }

    }

}
