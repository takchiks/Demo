package com.cogent.threads;

class Mythread105 extends Thread {
	public void run() {
		for(int i =100;i<200;i++) {
			System.out.println("loop 2" + i);
		}
	}

}

public class Manager105_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread105 mt1 = new Mythread105();
		mt1.start();

		for(int i =100;i<200;i++) {
			System.out.println("loop 2" + i);
		}

	}

}
