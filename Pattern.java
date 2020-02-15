import java.util.Scanner;
public class Pattern
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter thew number of rows:");
int rows=sc.nextInt();
for(int i=rows;i>=0;i--)
{
	for(int j=rows;j>i;j--)
	    {
		System.out.print(" ");
	    }
	     for (int k=1;k<=i;k++)
	          {
		 System.out.print("*");
	          }
	    System.out.println();
}
}
}
