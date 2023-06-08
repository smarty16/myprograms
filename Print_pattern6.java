import java.util.Scanner;
class Print_pattern6{
public static void pattern(int n,char ch1,char ch2){
for(int i=(n/2),j=1,i>=1,j<=n;i--,j+=2)
{
	pattern_line(i,j,ch1,ch2);
}
public static void pattern_line(int i1,int j1,char ch3,char ch4){
System.out.println();
for(int k=1;k<=i1;k++){System.out.print(ch3);}
for(int p=1;p<=j1;p++){System.out.print(ch4);}	
for(int k=1;k<=i1;k++){System.out.print(ch3);}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
char ch=sc.next().charAt(0);
char ch0=sc.next().charAt(0);
System.out.println();
pattern(num,ch,ch0);
}
}
