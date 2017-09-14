package test;
import java.util.Scanner;

//import rectanglewithinput.rectangle2;	
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A[] arr = new A[4];
		Scanner scanner = new Scanner (System.in);
		int length,breadth;
		
		rectangle2[] arr= new rectangle2[5] ;
		for(int i=0;i<arr.length;i++)
		{
			 System.out.println("Enter length for rectangle"+(i+1));
	            length= scanner.nextInt(); 
	            System.out.print("Enter breadthfor rectangle "+(i+1));  
	   		 breadth= scanner.nextInt();  
	   		 arr[i]=new rectangle2(length,breadth);
	   		 
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Recatangle "+(i+1));
			arr[i].area();
			arr[i].disp();
		}
		
		
	/*	
		rectangle2 r1=new rectangle2();
		r1.area();
		rectangle2 r2=new rectangle2();
		for(int i=2; i>3; i--){
            System.out.println("Enter length for rectangle"+i);
            length= scanner.nextInt(); 
            System.out.print("Enter breadthfor rectangle "+i);  
   		 breadth= scanner.nextInt();  
   		r2.area();
   		r2.display();*/
	}

}
