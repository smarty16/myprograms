
class Reverse_100_to_10000
{
public static void main(String args[]){
int rem;
int rev=0;
System.out.println("pallindrome from 100 to 10000 are:");
for(int num=100;num<=1000;num++){
while(num>0){
rem=num%10;
rev=rev*10+rem;
num=num/10;
}
if(num==rev){System.out.println(num);}
}
}
}