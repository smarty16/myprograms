class Student{
int rollno;
String name;
Student(){
rollno=0;
name=null;
}
Student(int r,String n){
rollno=r;
name=n;
}
void displayInformation(){
System.out.println(rollno+" "+name);
}
}
class TestStudent3{
public static void main(String args[]){
Student s1=new Student(111,"jack");
Student s2=new Student(222,"syam");

s1.displayInformation();

s2.displayInformation();
}
}