class Driver3{
	public static void main(String[] args){

		Fraction f3 = new Fraction(5,8);
		f3.inverse();
		f3.print();
		if(f3.isProper())
			System.out.println("True");
		else
			System.out.println("False");
	
		Fraction f4 = new Fraction(3,12);
		f4.reduce();
		f4.print();
	}
}
