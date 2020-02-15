import java.util.*;
public class BinaryDecimal{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter a binary number:");
long num=sc.nextLong();
int decimal=convertBinaryToDecimal(num);
System.out.print(num + "in binary"+decimal+"in decimal");
}
public static int convertBinaryToDecimal(long num)
{
int decimalNumber =0,i=0;
long remainder;
while(num !=0)
{
remainder =num%10;
num/=10;
decimalNumber +=remainder*Math.pow(2,i);
++i;
}
return decimalNumber;
}
}

