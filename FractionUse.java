package fraction_package;

public class FractionUse {
	public static void main(String args[]) {
		Fraction f1 = new Fraction(20,30);
		f1.print();
		f1.add(10,20);
		f1.print();
		
		Fraction f2 = new Fraction(10,90);
		f2.add(f1);
		f2.print();
		f1.print();
		try {
			f1.setDenomiator(1);
			System.out.println("No Exception");
		}
		catch(ZeroDenominatorException e) {//Incase of exception
			System.out.println("Error in Denominator");
		}
		finally {
			System.out.println("Compusory execution");
		}
		Fraction f3 = Fraction.add(f1,f2);
		f3.print();
		f1.print();
		f2.print();
	}
}
