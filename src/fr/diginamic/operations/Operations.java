package fr.diginamic.operations;

public class Operations {

	private double a;
	private double b;
	
	
	public Operations(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public void calcul(char c) {
		switch(c){
		   
	       case '+': 
	    	   System.out.println(Double.valueOf(a+b)) ;
	           break;   
	       case '-':
	    	   System.out.println(Double.valueOf(a-b)) ;
	           break;
	   
	       case '*':
	    	   System.out.println(Double.valueOf(a*b)) ;
	          break;           
	       case '/':
	    	   System.out.println(Double.valueOf(a/b)) ;
	           break;   
	       
	   }
		
		
	}
	
	
}
