import java.util.Scanner;
class product_of_the_digits
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter any positive integer:");
int num1=sc.nextInt();
int num=num1;
int rem;
int pd=1;
while(num>0){
rem=num%10;
pd=pd*rem;
num=num/10;
}
System.out.println("product of "+num1+":"+pd);
}
}
