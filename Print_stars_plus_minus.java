import java.util.Scanner;
class Print_stars_plus_minus{
public static void print_a_multiple_chars(int i,char c){
int k=1;
for(;k<=i;k++){
System.out.print(c);
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int j=sc.nextInt();
print_a_multiple_chars(j,'*');
print_a_multiple_chars(j,'+');
print_a_multiple_chars(j,'-');
System.out.print("");
}
}