package com.kirkwang.basicStructure;

/**
 * Created by amp on 9/22/2015.
 */
public class Job extends Thread {
    private int counter;

    public static void main(String... args) throws InterruptedException {
        Job job = new Job();
        job.start();
        Thread.sleep(1000);
        System.out.println("waiting to get end....");
        synchronized (job) {

            System.out.println("about to sleep ");

            if (!job.isAlive()) {
                System.out.println("I am not alive");
            }
            //  job.wait(10000);


        }

        System.out.println(job.counter);
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 1000; i++) {
                counter++;
            }
            this.notifyAll();
            System.out.println("completed counting....");
        }
    }
}
