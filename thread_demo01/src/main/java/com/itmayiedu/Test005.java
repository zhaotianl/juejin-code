package com.itmayiedu;

public class Test005 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				while (true) {
					try {
						Thread.sleep(1000);

					} catch (Exception e) {
						// TODO: handle exception
					}
					System.out.println("�������߳�(�û��߳�)");
				}
			}
		});
		// ��ʶ��ǰ����Ϊ�ػ��߳�
		t1.setDaemon(true);
		t1.start();
		for (int i = 0; i < 10; i++) {
			Thread.sleep(300);
			System.out.println("main:i:" + i);
		}
		System.out.println("���߳�ִ�����...");

	}

}
