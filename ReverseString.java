import java.util.Scanner;
class ReverseString
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String n;
System.out.print("Enter a string:");
n=sc.next();
String rev="";
int len=n.length()-1;
for(int i=len;i>=0;i--){
rev=rev+n.charAt(i);
}
System.out.println(rev);
}
}