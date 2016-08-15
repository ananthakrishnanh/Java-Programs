class Driver4{
	public static void main(String[] args){
		Fraction f1 = new Fraction(2,7);
		Fraction f2 = new Fraction(3,7);
		Fraction f3 = f1.add(f2); //same as f2.add(f1)
		if(f3!=null)
			f3.print();
		else 
			System.out.println("Can add only fractions 							with same base");
	}
}
