package oop;

public class Marks {
double t;
double a;
double h;
public Marks (double i,double q,double r)
{
	double x=i+q+r;
	System.out.println("I am constructor 1 with 3 arguments and sum is: "+x);
}
public Marks()
{
	t=4.6;
	a=5.2;
	h=3.3;
	double x1=t+a+h;
	System.out.println("I am constructor 2 with 0 argumentsand sum is: "+x1);
}

public double cal()
{
	double z=t+a+h;
	return z;
}
}
