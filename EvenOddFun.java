import java.util.*;
public class EvenOddFun{
public static boolean isEven(int n)
{return ((n/2)*2==n);}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter a number:");
n=sc.nextInt();
if(isEven(n))
{System.out.println("Even");}
else
{System.out.println("Odd");}
}
}