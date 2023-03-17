package Multithreading;

//Creating thread using thread class
public class ThreadUsingThreadClass extends Thread {
    @Override
    public void run() {
        //ask for thread
        for(int i=0;i<=20;i++){
            System.out.println("Second Thread : "+i);
            try {
                Thread.sleep(1500);
            }
            catch (Exception e){

            }
        }
    }
}
