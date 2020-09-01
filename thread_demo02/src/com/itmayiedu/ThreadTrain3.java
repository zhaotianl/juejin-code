package com.itmayiedu;

/**
 * ��̬ͬ������
 */
public class ThreadTrain3 implements Runnable {
	private static int trainCount = 100;

	@Override
	public void run() {
		while (trainCount > 0) {
			try {
				Thread.sleep(50);
			} catch (Exception e) {

			}
			sale();
		}
	}

	public static void sale() {
		synchronized (ThreadTrain3.class) {
			if (trainCount > 0) {
				System.out.println(Thread.currentThread().getName() + ",���۵�" + (100 - trainCount + 1) + "��Ʊ");
				trainCount--;
			}
		}

	}

	public static void main(String[] args) {
		ThreadTrain3 threadTrain = new ThreadTrain3();
		Thread t1 = new Thread(threadTrain, "1��");
		Thread t2 = new Thread(threadTrain, "2��");
		t1.start();
		t2.start();
	}

}
