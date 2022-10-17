package fr.diginamic.banque.entites;

public class Circle {
private double rayon;

public Circle(double rayon) {
	super();
	this.rayon = rayon;	
}

public double getRayon() {
	return rayon;
}

public void setRayon(double rayon) {
	this.rayon = rayon;
}

public double getPerim() {
	
	return  Math.PI * 2*rayon;
}
public double getSurface() {
	
	return  Math.PI * (rayon * rayon);
}

}
