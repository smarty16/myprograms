import java.util.Scanner;
class PrintSeries{
public static void main(String args[]){
int counter=0;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
while(counter<=num){
System.out.print(counter);
if(counter<num){
System.out.print(",");
}
counter=counter+1;
}
}
}