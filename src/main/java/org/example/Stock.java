package org.example;

public class Stock {
    private int product = 0;
    public synchronized void sell() {
        while (product < 1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.getMessage();
            }
        }
        product--;
        System.out.println("Магазин продал 1 товар");
        System.out.println("Товаров на складе: " + product);
        notify();
    }
    public synchronized void add() {
        while (product >=4 ) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.getMessage();
            }
        }
        product++;
        System.out.println("Производитель добавил 1 товар");
        System.out.println("Товаров на складе: " + product);
        notify();
    }
}
