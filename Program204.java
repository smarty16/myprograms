import java.util.*;
public class Program204
{
static int diff(int a,int b)
{return a-b;}
static int product(int a,int b)
{return a*b;}
static int smallest(int a,int b)
{
if(a<b) return a;
if(a>b) return b;
return 0;
}
static int largest(int a,int b)
{
if(a>b) return a;
if(a<b) return b;
return 0;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1,num2,result;
System.out.println("Enter a number:");
num1=sc.nextInt();
System.out.println("Enter an another number:");
num2=sc.nextInt();
result=diff(num1,num2);
System.out.println("differece of two numbers:"+result);
result=product(num1,num2);
System.out.println("product of two numbers:"+result);
result=smallest(num1,num2);
System.out.println("smallest of two numbers:"+result);
result=largest(num1,num2);
System.out.println("largest of two numbers:"+result);
}
}







