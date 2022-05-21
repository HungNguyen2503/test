package Bai3;

import java.util.concurrent.RecursiveAction;

public class Rational {
	private int numberator;
	private int denominator;
	
	//constructor
	public Rational(int numberator, int denominator) {
		super();
		this.numberator = numberator;
		this.denominator = denominator;
	}
	public Rational(Rational R , String key) {
		switch (key) {
			case "->": {
				reduce(R);
				break;
			}	
			case "<->": {
				reciprocal(R);
				break;
			}
		}
	}
	public Rational(Rational A, Rational B, String key) {
		switch (key) {
			case "+": {
				add(A, B);
				break;
			}	
			case "-": {
				subtract(A, B);
				break;				
			}
			case "*": {
				multiply(A, B);
				break;
			}
			case "/": {
				devide(A, B);
				break;
			}
			case "<>": {
				tolerance(A, B);
				break;
			}
		}
	}
	
	//getter & setter
	public int getNumberator() {
		return numberator;
	}
	public void setNumberator(int numberator) {
		this.numberator = numberator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	//reduce
	private void reduce(Rational R) {
		if(this.ucln(R.getNumberator(), R.getDenominator()) == 1) {
			this.setNumberator(R.getNumberator());
			this.setDenominator(R.getDenominator());
		}
		else {
			int temp = this.ucln(R.getNumberator(), R.getDenominator());
			this.setNumberator(R.getNumberator() / temp);
			this.setDenominator(R.getDenominator() / temp);
		}
	}
	
	private void reduce(int a, int b) {
		if(this.ucln(a,b) == 1) {
			this.setNumberator(a);
			this.setDenominator(b);
		}
		else {
			int temp = this.ucln(a, b);
			this.setNumberator(a / temp);
			this.setDenominator(b / temp);
		}
	}
	//reciprocal
	private void reciprocal(Rational R) {
		int temp = R.getNumberator();
		this.setNumberator(R.getDenominator());
		this.setDenominator(temp);
		reduce(this.getNumberator(), this.getDenominator());
	}
	//add
	private void add(Rational A, Rational B) {
		this.setNumberator(A.getNumberator()*B.getDenominator() + A.getDenominator()*B.getNumberator());
		this.setDenominator(A.getDenominator()*B.getDenominator());
		reduce(this.getNumberator(), this.getDenominator());
	}
	//sub
	private void subtract(Rational A, Rational B) {
		this.setNumberator(A.getNumberator()*B.getDenominator() - A.getDenominator()*B.getNumberator());
		this.setDenominator(A.getDenominator()*B.getDenominator());
		reduce(this.getNumberator(), this.getDenominator());
	}
	//mul
	private void multiply(Rational A, Rational B) {
		this.setNumberator(A.getNumberator() * B.getNumberator());
		this.setDenominator(A.getDenominator() * B.getDenominator());
		reduce(this.getNumberator(), this.getDenominator());
	}
	//devide
	private void devide(Rational A, Rational B) {
		this.setNumberator(A.getNumberator() * B.getDenominator());
		this.setDenominator(A.getDenominator() * B.getNumberator());
		reduce(this.getNumberator(), this.getDenominator());
	}	
	//tolerance
	private void tolerance(Rational A, Rational B) {
		float a = (float) A.getNumberator() / A.getDenominator();
		float b = (float) B.getNumberator() / B.getDenominator();
		float c = (float) a - b;
		reduce(A);
		reduce(B);
		if(c > 0) {
			System.out.println("Phân số " + A.show() + " lớn hơn");
		}else System.out.println("Phân số " + B.show() + " lớn hơn");
	}
	//ucln
	private int ucln(int a,int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while(a != b) {
			if(a > b) {
				a = a - b;
			}else b = b -a;
		}
		return b;
	}
	public String show() {
		return	this.getNumberator() + "/" + this.getDenominator();
	}
}
