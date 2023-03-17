package Multithreading;

import java.util.logging.SocketHandler;

public class ThreadOperations {
    public static void main(String[] args) {
        System.out.println("Program Started....");
        int a=10+30;
        System.out.println("Sum : "+a);
        //thread
        Thread t=Thread.currentThread();//static method
        String tname = t.getName();//get thread name
        System.out.println("Current Running Thread is "+tname);

        //Set Thread Name
        t.setName("New Thread");
        System.out.println("thread is "+t.getName());
        //Get Thread Id
        System.out.println("Thread Id is "+t.getId());
        System.out.println("Program Ended.");
    }
}
