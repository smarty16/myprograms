class Student{
int rollno;
String name;
void insertRecords(int r,String n){
rollno=r;
name=n;
}
void displayInformation(){
System.out.println(rollno+" "+name);
}
}
class TestStudent2{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
s1.insertRecords(111,"jack");
s1.displayInformation();
s2.insertRecords(222,"syam");
s2.displayInformation();
}
}