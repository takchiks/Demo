package com.cogent.threads;
class Thread1091 extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
class Thread1092 extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class Manager109 {
	public static void main(String[] args) {
		Thread1091 t1 = new Thread1091();
		t1.setName("Jack");
		Thread1091 t2 = new Thread1091();
		t1.setName("Jamie");
		
		t1.run();
		t2.run();
		t1.start();
		t1.start();
		System.out.println(Thread.currentThread().getName());
		
	}

}
