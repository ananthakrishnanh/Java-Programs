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

	public void inverse(){
		int temp;
		temp=this.denominator;
		this.denominator=this.numerator;
		this.numerator=temp;	
	}

	public Fraction computeInverse(){
		Fraction inv = new Fraction(this.denominator,this.numerator);
		return inv;
	}

	

	public boolean isProper(){
		if(this.numerator<=this.denominator)
			return true;
		else 
			return false;
	}

	public void reduce(){
		if(this.numerator<=this.denominator){
				for(int i=this.numerator;i>1;i--){

					if(this.numerator%i==0&&this.denominator%i==0){
						this.numerator/=i;
						this.denominator/=i;
					}

				}
		}
		else if(this.numerator>this.denominator){
			for(int i=this.denominator;i>1;i--){

					if(this.numerator%i==0&&this.denominator%i==0){
						this.numerator/=i;
						this.denominator/=i;
					}

				}
		}
			
	}

	public void print(){
		if(this.getDenominator()==1)
			System.out.println("The fraction is " + 					this.getNumerator());
		else 
			System.out.println("The fraction is " + 					this.getNumerator() + "/" + 						this.getDenominator());
	}

	public Fraction add(Fraction frac){
		//only fraction with same base
		int fracsum;
		if(this.denominator==frac.getDenominator()){
			fracsum=this.numerator+frac.getNumerator();
			Fraction sum=new Fraction(fracsum,this.denominator);
			return sum;
		}
		else
			return null;
		
	}
}


