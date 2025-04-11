package com.collectionFramework;
interface Demo3{
	void m1();
	void m2();
}
interface Demo4 extends Demo3{
	void f1();
	void f2();
}
class Example1 implements Demo4{
	@Override
	public void m1() {
		System.out.println("m1()....implemented");
	}
	@Override
	public void m2() {
		System.out.println("m2()....implemented");
	}
	@Override
	public void f1() {
		System.out.println("f1()....implemented");
	}
	@Override
	public void f2() {
		System.out.println("f2()....implemented");
	}
}
public class Mainclass2 {
	public static void main(String[] args) {
		Example1 e=new Example1();
		e.f1();
		e.f2();
		e.m1();
		e.m2();
		Demo3 d=e;
		d.m1();
		d.m2();
	}

}
