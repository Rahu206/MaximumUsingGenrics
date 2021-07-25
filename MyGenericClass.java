package com.javagenrics;

public class MyGenericClass<E> extends Maximum {
	E variable1;
	E variable2;
	E variable3;
	E variale4;

	public MyGenericClass(E variable1, E variable2, E variable3, E variale4) {
		super();
		this.variable1 = variable1;
		this.variable2 = variable2;
		this.variable3 = variable3;
		this.variale4 = variale4;
	}

	public E getVariable1() {
		return variable1;
	}

	public void setVariable1(E variable1) {
		this.variable1 = variable1;
	}

	public E getVariable2() {
		return variable2;
	}

	public void setVariable2(E variable2) {
		this.variable2 = variable2;
	}

	public E getVariable3() {
		return variable3;
	}

	public void setVariable3(E variable3) {
		this.variable3 = variable3;
	}

	public E getVariale4() {
		return variale4;
	}

	public void setVariale4(E variale4) {
		this.variale4 = variale4;
	}

}
