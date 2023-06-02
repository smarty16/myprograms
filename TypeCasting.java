import java.util.*;
public class TypeCasting
{
public static void main(String args[])
{
char ch;
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
int aschii;
aschii=(int)ch;
System.out.println("ASCHII of "+ch+"is"+aschii);
}
}