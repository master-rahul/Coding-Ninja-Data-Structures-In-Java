/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

public class ComplexNumbers {
	int real, imaginary;
    ComplexNumbers(int a , int b){
        real = a;
        imaginary = b;
    }
    void print(){
        System.out.println(real+" + i"+imaginary);
    }
    void plus(ComplexNumbers c){
        this.real = this.real + c.real;
        this.imaginary = this.imaginary + c.imaginary;
    }
    void multiply(ComplexNumbers e){
        int a = this.real * e.real;
        int b = this.real * e.imaginary;
        int c = this.imaginary * e.real;
        int d = this. imaginary * e.imaginary;
        this.real = a -d;
        this. imaginary = b+c;
    }
	
}
