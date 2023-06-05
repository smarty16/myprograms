import java.util.Scanner;
class Test3a{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
for(int i=0;i<=num1;i=i+num2)
{
System.out.print(i);
if(i<num1){
System.out.print(",");
}
}
}
}