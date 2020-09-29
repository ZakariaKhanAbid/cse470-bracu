package code.UnitTest.main;

public class UnitTesting {
	
	/*private UnitTesting2 m;
	
	public UnitTesting() {
		this(new UnitTesting2());
	}
	public UnitTesting(UnitTesting2 m){
		this.m=m;
	}*/
	
	public double average(double a, double b) {
		return (a+b)/2;
	}
	
	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public double divide(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by 0");
		}
		return a / b;
	}	
	
	public boolean ifEqual(int a, int b) {
		if(a==b) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*public void save(String n) {
	setName(n);
	}
	
	public void setName(String n) {
		m.setName(n);
	}
	
	public String getName() {
		return m.getName();
	}*/
	
}
