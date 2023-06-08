import java.util.Scanner;
class Print_pattern3{
public static void pattern(int i,char ch1){
for(int j=i;j>=1;j--){
pattern_line(j,ch1);
}
}
public static void pattern_line(int col,char ch2){
System.out.println();
for(int k=col;k>=1;k--){
System.out.print(ch2);
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
char ch=sc.next().charAt(0);
pattern(num,ch);
}
}