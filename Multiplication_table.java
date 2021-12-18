package assignmentjfd;

import java.util.Scanner;

public class Multiplication_table
{
  public static void main(String args[])
  {
	  try (Scanner obj = new Scanner(System.in))
	{
		System.out.println("Enter a number for multiplication");
		  int num=obj.nextInt();
		  
		  for(int i=1;i<=10;i++)
		  {
			  System.out.println(num  +"X" + i + "="+num*i);
		  }
	}
  }
}
