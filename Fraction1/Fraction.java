public class Fraction {
	private int numerator;
	private int denominator;
	
	public void setNumerator(int n){
		this.numerator=n;	
	}
	
	public void setDenominator(int d){
		this.denominator=d;
	}
	
	public int getNumerator(){
		return numerator;
	}

	public int getDenominator(){
		return denominator;
	}

	public void print(){
		System.out.println("The fraction is " + this.getNumerator() + "/"   + this.getDenominator());
	}
}


