import java.util.*;
public class ReadString
{
public static void main(String[] args)
{
System.out.println("Enter your name:");
Scanner sc=new Scanner(System.in);
String n=sc.next();
char ch=n.charAt(0);
System.out.println("welcome"+n+ch);
}
}