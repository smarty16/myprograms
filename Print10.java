import java.util.Scanner;
class Print10{
public static void main(String args[]){
int counter=0;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
while(counter<=10){
System.out.print(counter);
if(counter<10){
System.out.print(",");
}
counter=counter+1;
}
}
}