package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ShowOldEvenNumbers os = new ShowOldEvenNumbers(1, 10, 2, 10, "Đếm số lẻ");
        ShowOldEvenNumbers is = new ShowOldEvenNumbers(0, 10, 2, 15, "Đếm số chẵn");

        Thread thread1 = new Thread(is);
        Thread thread2 = new Thread(os);

        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
    }
}
