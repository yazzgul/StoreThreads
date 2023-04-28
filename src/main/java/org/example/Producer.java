package org.example;
import java.lang.Runnable;
public class Producer implements Runnable {
    Stock stock;
    Producer(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            stock.add();
        }
    }
}
