public class Class_Object{
	String name;
	int age;
public Class_Objects(String string, int i) {
		// TODO Auto-generated constructor stub
	}
public void student(String name,int age) {
	this.age=age;
	this.name=name;
	
}
public void display() {
	System.out.println("Student Name:"+name+"\nAge:"+age);
}
public static void main(String[]args) {
	Class_Objects s1=new Class_Objects("Varun K V",21);
	s1.display();
}
}
