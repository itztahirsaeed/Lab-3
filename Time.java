package oop;

public class Time {
	int h;
	int m;
	int s;
	public Time()
	{
		h=5;
		m=44;
		s=8;
	}
	public Time(int a,int b,int c)
	{
		h=a;
		m=b;
		s=c;
	}
	public void display()
	{
		System.out.println("Time is: "+h+" hours "+m+" mins "+s +" secs");
	}
	
}
