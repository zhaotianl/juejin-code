package com.itmayiedu;

class ThreadDemo004 extends Thread {
	public  volatile boolean flag = true;

	@Override
	public void run() {
		System.out.println("�߳̿�ʼ...");
		while (flag) {

		}
		System.out.println("�߳̽Y��...");
	}
	public void setRuning(boolean flag){
		this.flag=flag;
	}
}

public class Test0004 {
   public static void main(String[] args) throws InterruptedException {
	  ThreadDemo004 threadDemo004 = new ThreadDemo004();
	  threadDemo004.start();
	  Thread.sleep(3000);
	  threadDemo004.setRuning(false);
	  System.out.println("flag�ѽ��Ğ�false");
	  Thread.sleep(1000);
	  System.out.println("flag:"+threadDemo004.flag);
}
}
