import java.util.Scanner;
class Sum_of_the_digits
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter any positive integer:");
int num1=sc.nextInt();
int num=num1;
int rem;
int sum=0;
while(num>0){
rem=num%10;
sum=sum+rem;
num=num/10;
}
System.out.println("sum of digits of "+num1+":"+sum);
}
}
