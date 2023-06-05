class Student{
int id;
String name;
}
class TestStudent{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
s1.id=103;
s1.name="santhosh";
s2.id=105;
s2.name="jack";
System.out.println(s1.id);
System.out.println(s1.name);
System.out.println(s2.id);
System.out.println(s2.name);
}
}