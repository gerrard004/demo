package com.test;

import java.lang.ref.WeakReference;

public class  Child extends Parent {
	private int age ;
	{
		System.out.println("子类代码块1");
	}
	Child(){
		super();
		System.out.println("子类构造方法");
	}
	
	public Child(int age,String name) {
		super(name);
		System.out.println("子类带餐构造方法");
		this.age = age;
	}

	{
		System.out.println("子类代码块2");
	}
	static{
		System.out.println("子类静态方法");
	}
	static{
		System.out.println("子类静态方法2");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
//		Child c = new Child();
//		final String t = "test" + Integer.toString(1);
//		final String t2 = "test" +"1";
//		String t3 = "test" +1;
//		String t4 = "test"+ Integer.toString(1);
//		final String s1 = "s1";
//		final String s2 = "s2";
//		String s3 = s1 +s2;
//		String s4 = "s1" + "s2";
//		System.out.println(t4=="test1");
//		System.out.println(t2=="test1");
//		System.out.println(t3==t2);
//		System.out.println(s3==s4);
		String p1 = new String("test");
		String p3 = "test";
		String p2 = p3;
		WeakReference<String> rf = new WeakReference<String>(p3);
		p3 = "new";
		
		System.out.println(rf.get());
		System.out.println(p2);
	}
	
}
