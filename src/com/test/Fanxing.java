package com.test;

public class Fanxing<T, P, D> {
	private T t1;
	private P p1;
	private D d1;

	public Fanxing(T t, P p, D d) {
		t1 = t;
		p1 = p;
		d1 = d;
	}

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}

	public P getP1() {
		return p1;
	}

	public void setP1(P p1) {
		this.p1 = p1;
	}

	public D getD1() {
		return d1;
	}

	public void setD1(D d1) {
		this.d1 = d1;
	}

	public Fanxing() {
		super();
	}

	public Object getFanxingT(Fanxing<?, ?, ?> t1) {
		return t1.getT1();
	}

	public static void main(String[] args) {
		Fanxing<String, Integer, String> t = new Fanxing<>("dafdaf", 2, "1111");
		System.out.println(t.getT1().length());
		System.out.println(t.getP1().doubleValue());
		System.out.println(t.getFanxingT(new Fanxing<String, Integer, String>(
				"88888", 2, "999999")));
	}

}
