package com.itmayiedu;

/**
 * ͬ������ʹ�õ���ʲô����
 * ��ͬ������ʹ��this����
 * ֤����ʽ: һ���߳�ʹ��ͬ�������(this����),��һ���߳�ʹ��ͬ����������������߳���Ʊ����ʵ��ͬ������ô��������ݴ���
 */
public class ThreadTrain2 implements Runnable {
    private int trainCount = 100;
    private boolean flag = true;
    private Object oj = new Object();

    @Override
    public void run() {
        if (flag) {
            while (trainCount > 0) {
                synchronized (this) {
                    if (trainCount > 0) {
                        try {
                            Thread.sleep(50);
                        } catch (Exception e) {

                        }
                        System.out.println(Thread.currentThread().getName() + ",���۵�" + (100 - trainCount + 1) + "��Ʊ");
                        trainCount--;
                    }
                }
            }
        } else {
            while (trainCount > 0) {
                sale();
            }
        }

    }

    public synchronized void sale() {
        if (trainCount > 0) {
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
            System.out.println(Thread.currentThread().getName() + ",���۵�" + (100 - trainCount + 1) + "��Ʊ");
            trainCount--;
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadTrain2 threadTrain = new ThreadTrain2();
        Thread t1 = new Thread(threadTrain, "1��");
        Thread t2 = new Thread(threadTrain, "2��");
        t1.start();
        Thread.sleep(40);
        threadTrain.flag = false;
        t2.start();
    }

}
