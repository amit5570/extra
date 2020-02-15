import java.util.Scanner;
public class BinaryAdd{
	public static void main(String[] args)
{
	System.out.println("welcome to java program to add two binary numbers");
	Scanner scnr=new Scanner(System.in);
	System.out.println("please enter first binary no");
	String second=scnr.nextLine();
	String addition=add(first,second);
	System.out.println("addition of two binary no is:" + addition);
}
public static String add(String first,String second){
int b1=integer.parseInt(first,2);
int b2=integer.parseInt(second,2);
int sum=b1+b2;
return Integer.toBinaryString(sum);
}
}
