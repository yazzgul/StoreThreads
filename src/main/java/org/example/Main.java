package org.example;
public class Main {
    public static void main(String[] args) {

        Stock stock = new Stock();
        Producer producer = new Producer(stock);
        Store store = new Store(stock);

        Thread thread1 = new Thread (producer);
        Thread thread2 = new Thread (store);
        thread1.start();
        thread2.start();

    }
}
