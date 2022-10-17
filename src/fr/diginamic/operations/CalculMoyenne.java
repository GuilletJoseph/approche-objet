package fr.diginamic.operations;

public class CalculMoyenne {
static double [] arrDouble=new double[0];
static double a;
static double b;

public CalculMoyenne( double a, double b) {
	super();
	this.a=a;
	this.b=b;
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

public double[] getArrDouble() {
	return arrDouble;
}

public void setArrDouble(double[] arrDouble) {
	this.arrDouble = arrDouble;
}


public static void ajout () {
	double[] arr2 = new double[arrDouble.length+1];    //creer deuxieme table    
    System.arraycopy(arrDouble, 0, arr2, 0, arrDouble.length); //copier au table arr2
    arrDouble=arr2;//ajouter au table arr
    arrDouble[arrDouble.length-1]=Double.valueOf((a+b)/2);	//ajouter au dernier index
}

public static void affiche () {
	for (int i=0; i<arrDouble.length; i++) {
		System.out.println(arrDouble[i]);
	}
}




}
