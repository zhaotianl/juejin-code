package com.itmayiedu;

//1. �̳�thread�࣬��дrun������run�����У���Ҫ�߳�ִ�д���
class ThreadDemo01 extends Thread {

	// run�����У���Ҫ�߳���Ҫִ�д���
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print("��id:" + this.getId() + ",");
			System.out.print("name:" + getName());
			System.out.println("..i:" + i);
			System.out.println();
		}
	}

}

// 1.ʲô���߳� �߳���һ��ִ��·����ÿ���̶߳�����Ӱ�졣
// 2.ʲô�Ƕ��̣߳����߳���һ�������У��ж�����ͬ��ִ��·��������ִ�С�Ŀ��Ϊ����߳���Ч�ʡ�
// 3.��һ�������У�һ�������̡߳�
// 4.������߳����̶߳�û�У���ôִ�г���
// �̼߳��ַ��� �û��̡߳��ػ��߳�
// ���߳� ���߳� GC�߳�
public class Test001 {

	// �������
	public static void main(String[] args) {
		System.out.println("main... ���߳̿�ʼ...");
		// 1.�����߳�
		ThreadDemo01 threadDemo01 = new ThreadDemo01();
		// 2.�����߳�
		threadDemo01.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main..i:" + i);
		}
		System.out.println("main... ���߳̽���...");
	}

}
