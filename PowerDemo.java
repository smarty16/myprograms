import java.util.Scanner;
class PowerDemo
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the base value:");
int base=sc.nextInt();
System.out.println("enter the power value:");
int power=sc.nextInt();
int result=1;
for(int i=1;i<=power;i++){
result=result*base;
}
System.out.println("Result:"+result);
}
}