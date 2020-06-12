package fraction_package;

public class Fraction {
	
	//Properties
	private int numerator;
	private int denominator;
//	public void setDenomiator(int d) throws Exception {
//		if(d==0) {
//			Exception e = new Exception("Denominator cannot be 0");
//			throw e;
//		}
//		return;
//	}
	//Methods
	public void setDenomiator(int d) throws ZeroDenominatorException {
		if(d==0) {
			ZeroDenominatorException e = new ZeroDenominatorException();
			throw e;
		}
		return;
	}
	
	Fraction(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}
	private void simplify(int numerator, int denominator) {
		int small,divisor=1;
		if(numerator > denominator)
			small = denominator;
		else
			small =  numerator;
		for(int i = 1; i <= small; i++) {
			if(numerator % i == 0 && denominator % i == 0)
				divisor = i;
		}
		this.numerator = numerator / divisor;
		this.denominator = denominator / divisor;
	}
	void print() {
		simplify(numerator, denominator);
		if(denominator == 1) {
			System.out.println(numerator);
			return;
		}
		else if(numerator == denominator) {
			System.out.println("1");
			return;
		}
		System.out.println(numerator+"/"+denominator);
	}
	void add(int numerator, int denominator) {
		int denominator1 = this.denominator * denominator;
		int quotient1 = denominator1 / this.denominator;
		int quotient2 = denominator1 / denominator;
		int numerator1 = quotient1 * this.numerator + quotient2 * numerator;
		simplify(numerator1,denominator1);
	}
	
	void add(Fraction f) {
		add(f.numerator, f.denominator);
	}
	
	static Fraction add(Fraction f1, Fraction f2) {
		Fraction f3 = new Fraction(f1.numerator,f1.denominator);
		f3.add(f2);
		f3.simplify(f3.numerator,f3.denominator);
		return f3;
	}
	
}
