import java.util.Scanner;
public class Pyramid
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter thew number of rows:");
int rows=sc.nextInt();
for(int i=0;i<=rows;i++)
{
for(int j=rows;j>i;j--)
	 {
	    System.out.print(" ");
	  }
for(int k=0;k<i;k++)
	{
  	   System.out.print("* ");
	}
 	    System.out.println();
}
}} 
