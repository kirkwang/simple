package com.kirkwang.basicStructure;

/**
 * Created by amp on 9/22/2015.
 */
public class Job extends Thread {
  private int counter;

  @Override
  public void run(){
    synchronized (this){
      for(int i =0; i <10000; i++){
        counter++;
      }
      this.notifyAll();
      System.out.println("completed counting....");
    }
  }

  public static void main(String... args) throws InterruptedException {
    Job job= new Job();
    job.start();
    Thread.sleep(10000);
    System.out.println("waiting to get end....");
    synchronized (job){
      job.wait();
    }

    System.out.println(job.counter);
  }
}
