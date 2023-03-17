package Multithreading.ProducerConsumer;

 class Company {
             int n;
             boolean f=false;
             //f=false ->Chance-->Producer
            //f=true->Chance-->Consumer

     // Synchronized both methods by using synchronized keyword
             synchronized public void produce_item(int n){
                 if(f){
                     try {
                         wait();
                     } catch (InterruptedException e) {
                         throw new RuntimeException(e);
                     }
                 }
                 this.n=n;
                 System.out.println("Produced : "+this.n);
                 f=true;
                 notify();
             }
             synchronized public int consume_item(){
                 if (!f){
                     try {
                         wait();
                     } catch (InterruptedException e) {
                         throw new RuntimeException(e);
                     }
                 }
                 f=false;
                 notify();
                 System.out.println("Consumed : "+this.n);
                 return this.n;
             }
}
