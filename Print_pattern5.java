import java.util.Scanner;
class Print_pattern5{
//1sr part
public static void pattern(int i,char ch1){
for(int j=1;j<=i;j++){
for(int k=1;k<=j;k++){
System.out.print(ch1);
}
System.out.println("");
}
}
//2nd part
public static void pattern1(int a,char ch2){
for(int j=a;j>=1;j--){
for(int k=j;k>=1;k--){
System.out.print(ch2);
}
System.out.println("");
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int num=sc.nextInt();
int num1=(num/2);
pattern(num1,ch);
int num2=(num-(num/2));
pattern1(num2,ch);
}
}