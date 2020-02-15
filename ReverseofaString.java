import java.util.*;
class ReverseofaString
{
public static void main(String[] arg)
{
String str;

Scanner sc=new Scanner (System.in);
System.out.print("enter a string");
str=sc.nextLine();
System.out.println("reverse is");
for (int j=str.length();j>0;j--)
{
System.out.print(str.charAt(j-1));
}
}
}