package com.company;

public class ShowOldEvenNumbers implements Runnable{
    private int start;
    private int end;
    private int step;
    private int sleepTime;
    private String threadName;

    public ShowOldEvenNumbers(int start, int end, int step, int sleepTime, String threadName) {
        this.start = start;
        this.end = end;
        this.step = step;
        this.sleepTime = sleepTime;
        this.threadName = threadName;
    }

    @Override
    public void run(){
        for (int i = start; i <= end; i += step){
            String msg = threadName + " i=" + i;
            System.out.println(msg);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
