package com.collectionFramework;
interface Demo1{
	void test() {
		
	}
	void disp() {
		
	}
}
class Example implements Demo1{
	@Override
	public void test() {
		System.out.println("Executing test");
	}
	@Override
	public void disp() {
		System.out.println("Executing disp");
	}
}
public class Mainclass3 {
	public static void main(String[] args) {
		Example e=new Example();
		e.test();
		e.disp();
		Demo1 d=e;
		e.test();
		e.disp();
	}

}
