package org.example;
import java.lang.Runnable;
public class Store implements Runnable {
    Stock stock;
    Store(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            stock.sell();
        }
    }
}
