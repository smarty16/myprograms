import java.util.Scanner;
class Print_pattern{
public static void pattern(int i,char ch1){
for(int j=1;j<=i;j++){
for(int k=1;k<=j;k++){
System.out.print(ch1);
}
System.out.println("");
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
char ch=sc.next().charAt(0);
System.out.println();
pattern(num,ch);

}
}
