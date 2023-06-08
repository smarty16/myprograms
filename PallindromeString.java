import java.util.Scanner;
class PallindromeString1
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String n;
System.out.print("Enter a string:");
n=sc.next();
n=n.toLowerCase();
String rev="";
int len=n.length()-1;
for(int i=len;i>=0;i--){
rev=rev+n.charAt(i);
}
System.out.println(n+" "+rev);
if(rev.equals(n)){System.out.println("pallindrome");}
else{System.out.println("is not pallindrome");}
}
}
