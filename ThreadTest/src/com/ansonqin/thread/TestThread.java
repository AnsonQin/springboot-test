package com.ansonqin.thread;

public class TestThread extends Thread {

    private Integer runTotal = 10;

    public int getRunTotal() {
        return runTotal;
    }

    public void setRunTotal(int runTotal) {
        this.runTotal = runTotal;
    }

    public void run(){
        while (true){
            runTotal++;
        }
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread();

        TestThread t2 = new TestThread();
        t1.start();
        t2.start();

        while (true){
            if(t1.getRunTotal()!=t2.getRunTotal()){
                System.out.println("线程1 = " + t1.getRunTotal());
                System.out.println("线程2 = " + t2.getRunTotal());
            }
        }
    }
}
