import java.util.Scanner;
class Smallnumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if((a<b)&&(a<c)){System.out.println(a+" is smaller number");}
else if(b<c){System.out.println(b+" is smaller number");}
else{System.out.println(c+" is smaller number");}
}
}