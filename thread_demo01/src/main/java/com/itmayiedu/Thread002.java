package com.itmayiedu;

class ThreadDemo02 implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(" �� i:" + i);
		}
	}
}

// 1.ʵ��runable�ӿڣ���дrun����
public class Thread002 {
	public static void main(String[] args) {
		System.out.println("main... ���߳̿�ʼ...");
	
		// �����߳�
		ThreadDemo02 threadDemo02 = new ThreadDemo02();
		Thread t1= new Thread(threadDemo02);
		// �����߳�
		t1.start();
		for (int i = 0; i <10; i++) {
			System.out.println("main..i:"+i);
		}
		System.out.println("main... ���߳̽���...");
	}

}
