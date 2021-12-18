package assignmentjfd;

import java.util.Scanner;

public class Factorial 
{
  public static void main(String args[])
  {
	  Scanner obj=new Scanner(System.in);
	  
	  int i,b,fact=1;
	  
	  System.out.println("Enter a Number");
	  b=obj.nextInt();
	  
	  for(i=1;i<=b;i++)
	  {
		  fact=fact*i;
	  }
	  
	  System.out.println("Factorial of " + b +" is: "+fact);
	  obj.close();
  }
}
