class Rectangle{
int length;
int width;
void insertRecords(int i,int n){
length=i;
width=n;
}
void calculateArea(){
System.out.println(length*width);
}
}
class TestRectangle{
public static void main(String args[]){
Rectangle r1=new Rectangle(),r2=new Rectangle();
r1.insertRecords(12,13);
r1.calculateArea();
r2.insertRecords(14,15);
r2.calculateArea();
}
}