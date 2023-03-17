package Multithreading.ProducerConsumer;
//this is main class contain main method
public class Main {
    public static void main(String[] args) {
        Company company =new Company();//company class object
        Producer producer =new Producer(company);//producer class object
        Consumer consumer=new Consumer(company);//consumer class object
        producer.start();//start producer  thread
        consumer.start();//start consumer  thread
    }
}
