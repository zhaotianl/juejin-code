package com.itmayiedu;

public class Thread004 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					// ѧϰ����ʱjob
					try {
						// �������Ϊ����״̬
						Thread.currentThread().sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					System.out.println("i:" + i);
				}
			}
		});
		t1.start();
	}

}
