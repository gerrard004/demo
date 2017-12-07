package com.test;

public class SubFanxing<S, P, D> extends Fanxing<S, P, D> {
	public static void main(String[] args) {
		Integer [] i = new Integer[5];
		Number [] n = i;
		i[0] = 5;
		System.out.println(n[0]);
	}
}	
