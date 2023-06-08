import java.util.Scanner;
class Print_pattern4{
//1st part
public static void pattern(int i,char ch1){
for(int j=1;j<=i;j++){
pattern_line(j,ch1);
}
}
public static void pattern_line(int col,char ch2){
System.out.println();
for(int k=1;k<=col;k++){
System.out.print(ch2);
}
}
//2nt part
public static void pattern2(int i,char ch1){
for(int j=i-1;j>=1;j--){
pattern_line2(j,ch1);
}
}
public static void pattern_line2(int col,char ch2){
System.out.println();
for(int k=col;k>=1;k--){
System.out.print(ch2);
}
}
//main method()
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int num=sc.nextInt();
pattern(num,ch);
pattern2(num,ch);
}
}