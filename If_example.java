import java.util.Scanner;
class If_example
{
public static void main(String args[]){
int i;
int j;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
j=sc.nextInt();
if(i<j){
System.out.println(j+" is maximum");
System.out.println(i+" is minimum");
}
else if(i>j){
System.out.println(i+" is maximum");
System.out.println(j+" is minimum");
}
else{
System.out.println("both are equal");
}
}
}