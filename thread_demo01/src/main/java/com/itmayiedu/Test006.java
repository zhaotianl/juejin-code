package com.itmayiedu;

//join
public class Test006 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("���߳�,i:" + i);
                }
            }
        });
        t1.start();
        // �������̵߳���ִ�е�t1.join()����ʱ������Ϊ���߳�Ӧ�ð�ִ��Ȩ�ø�t1
        t1.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("main�߳�,i:" + i);
        }
    }
}