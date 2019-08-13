package com.zensar.mockito;

public class Arithmetic {
	private Calculator calculator;
	
	public Arithmetic() {
		
	}

	public Arithmetic(Calculator calculator) {
		super();
		this.calculator = calculator;
	}
	 
	public int doAddition(int x,int y) {
		return calculator.add(x, y);
	}

}
