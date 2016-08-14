public class Fraction {
	private int numerator;
	private int denominator;

	Fraction(){
		this.numerator=1;
		this.denominator=1;
	}

    	Fraction(int n,int d){
		this.numerator=n;
		this.denominator=d;
    	}

	Fraction(int n){
		this.numerator=n;
		this.denominator=1;
	}


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
		if(this.getDenominator()==1)
			System.out.println("The fraction is " + this.getNumerator());
		else 
			System.out.println("The fraction is " + this.getNumerator() + "/"   + this.getDenominator());
	}
}


