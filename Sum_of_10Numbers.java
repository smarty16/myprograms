import java.util.Scanner;
class Sum_of_Numbers{
public static void main(String args[]){
int counter=1;
int sum=0;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
while(counter<=num){
sum=sum+counter;
counter=counter+1;
}
System.out.print("sum of "+num+" numbers: "+sum);
}
}