package org.example;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        int yearCount = 0;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double price;

        for (price = 2500; price < 5000; price *= 1.075) {
            System.out.println(money.format(price));
            yearCount++;
        }

        System.out.println(money.format(price) + "\n" + yearCount);
    }
}