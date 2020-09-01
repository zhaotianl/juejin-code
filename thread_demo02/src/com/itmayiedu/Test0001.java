package com.itmayiedu;

/**
 * ʹ����volatile����û��ʹ��synchronized
 */
class ThreadDemo01 implements Runnable {
    // ͬʱ������ڹ���100
    private volatile static int count = 100;// ��ŷ�������
    private static Object oj = new Object();
    public boolean flag = true;

    public void run() {
        if (flag) {
            while (count > 0) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                if (count > 0) {
                    System.out.println(Thread.currentThread().getName() + ",����" + (100 - count + 1) + "��Ʊ");
                    --count;
                }
            }

        } else {
            while (count > 0) {
                sale();
            }
        }
    }

    public static void sale() {
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            // TODO: handle exception
        }
        if (count > 0) {
            System.out.println(Thread.currentThread().getName() + ",����" + (100 - count + 1) + "��Ʊ");
            --count;
        }

    }
}

public class Test0001 {
    public static void main(String[] args) throws InterruptedException {

        ThreadDemo01 threadDemo01 = new ThreadDemo01();
        Thread t1 = new Thread(threadDemo01, "����1");
        Thread t2 = new Thread(threadDemo01, "����2");
        t1.start();
        Thread.sleep(40);
        threadDemo01.flag = false;
        t2.start();
    }
}
