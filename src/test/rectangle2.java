package test;

public class rectangle2 {
	int length1,breadth1;
	int area;
	public rectangle2 ()
	{
		length1=0;
		breadth1=0;
	}
	public rectangle2(int length,int breadth)
	{
		this.length1=length;
		this.breadth1=breadth;
	}
	public void area()
	{
		area=length1*breadth1;
	}
	public void disp()
	{
		System.out.print("length=");
		System.out.println(length1);
		
		System.out.print("breadth=");
		System.out.println(breadth1);
		System.out.print("area=");
		System.out.println(area);
	}
	



}
