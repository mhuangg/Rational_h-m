/* Team HM, Henry Zhang, Mei Huang
;APCS1 pd5
;HW #32: Irrationality Stops Here 
;2015-11-17
*/

public class Rational {
    private int numerator;
    private int denominator;
    //instance variables for class Rational
    public Rational(){
	numerator=0;
	denominator=1;
	//default constructor, 0/1=0
    }
    public Rational(int num, int den){
	if (den==0){
	    numerator=0;
	    denominator=1;
	    //the number won't be rational if the denominator is 0, so make it 0/1 instead
	}
	else{
	numerator=num;
	denominator=den;
	//otherwise, use the parameters to define the rational number
        }
    }
    
    public String toString() {
    String rationalNum = "" ;
	rationalNum += this.numerator;
	rationalNum += "/" ;
	rationalNum += this.denominator;
	//calculates the rational number with precision by converting the first int to a double, thus making the end value have double precision, adds it to String output rationalNum
	return rationalNum;
	//
    }
    
    public double floatValue() { 
        double num; 
        num = ((double)this.numerator)/this.denominator;
        //calculates the rational number with precision by converting the first int to a double, thus making the end value have double precision
        return num; 
        //return output
   }
   
   public void multiply(Rational obj) { 
       int oldN=this.numerator;
       int oldD=this.denominator;
       //separates numerator and denominator 
       this.numerator=oldN*obj.numerator;
       this.denominator=oldD*obj.denominator;
     // numerator and denom are multiplied by new Rational obj 
   } 
    
    public void divide(Rational obj){
        
        int oldN = this.numerator; 
        int oldD = this.denominator;
        //separates numerator and denominator 
        this.numerator = oldN * obj.denominator; 
        this.denominator = oldD * obj.numerator; 
        // numerator is multiplied by object's denom  & denominator multiplied by object's num 
    }
    
    //main method 
    public static void main (String[] args) { 
        Rational r = new Rational(2,3); 
        Rational s = new Rational(1,2);
        System.out.println(s.floatValue()); //should ouput 0.5
        System.out.println(r); //should output 2/3
        System.out.println(s); //should output 1/2 
        r.multiply(s); // 2/3 x 1/2 
        System.out.println(r); // should output 2/6 
        System.out.println(s); // should output 1/2 
        r.divide(s); // 2/6 / 1/2  
        System.out.println(r); //should output 4/6 
        System.out.println(s); //should output 1/2 
        
        
    }
}
