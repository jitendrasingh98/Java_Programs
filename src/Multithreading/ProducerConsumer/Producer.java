package Multithreading.ProducerConsumer;
//this is producer thread
 class Producer extends Thread {
     Company c;//company object
     public Producer(Company c){
         this.c=c;
     }
     @Override
     public void run() {
      int i=1;
      while (true){
          this.c.produce_item(i);
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          i++;

      }

     }
 }
