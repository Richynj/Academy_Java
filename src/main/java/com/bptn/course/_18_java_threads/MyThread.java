package com.bptn.course._18_java_threads;


class A{
	public void show() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hi java");
		}
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}
class B {
	
	public void run() {
		
		for (int i =0; i < 100; i++);
		System.out.println("Hello Java");
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}


public class MyThread {

	public static void main(String[] args) {
		//Create an object of class A
		A myObj = new A();
		
		myObj.start();
		
		B myObj1 = new B();
		
		myObj1.start();
		
		System.out.println("Main thread");
		
		

	}

}
