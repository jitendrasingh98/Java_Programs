package Multithreading;

//Creating Thread using Runnable Interface
 class MyThread implements Runnable{
     @Override
     public void run() {
         for(int i=0;i<=10;i++){
             System.out.print("First Thread : "+i+" ");
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
     }

     public static void main(String[] args) {
         MyThread t1= new MyThread();
         Thread thread =new Thread(t1);

         //object to another thread
         ThreadUsingThreadClass thr2 = new ThreadUsingThreadClass();
         thread.start();
         thr2.start();
     }

}
