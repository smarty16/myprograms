class Employee{
int id;
String name;
float salary;
void insertRecords(int i,String n,float s){
id=i;
name=n;
salary=s;
}
void displayInformation(){
System.out.println(id+" "+name+" "+salary);
}
}
class TestEmployee{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insertRecords(111,"jack",20000);
e1.displayInformation();
e2.insertRecords(222,"syam",30000);
e2.displayInformation();
e3.insertRecords(333,"ram",60000);
e3.displayInformation();
}
}