class Account{
int acc_no;
String name;
float amount;
void insert(int i,String n,float a){
acc_no=i;
name=n;
amount=a;
}
void deposite(float amt){
amount=amount+amt;
System.out.println(amt+ " is deposited");
}
void withdraw(float amt){
if(amount<amt){
System.out.println("Insufficient Balance");
}
else{
amount=amount-amt;
System.out.println(amt+" is withdrawn");
}
}
void checkBalance()
{System.out.println("Balance is:"+amount);}
void display(){System.out.println(acc_no+" "+name+" "+amount);}
}
class TestAccount{
public static void main(String args[]){
Account a1=new Account();
a1.insert(832345,"jack",10000);
a1.display();
a1.checkBalance();
a1.deposite(40000);
a1.checkBalance();
a1.withdraw(60000);
a1.checkBalance();
}
}