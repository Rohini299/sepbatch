package package1;

public class Student1 {
	
	int rollno;
	int age;
	public void method1() 
	{System.out.println("Welcome to all of you");	
	}
	
	public void method2() 
	{System.out.println("Automation is very easy");	
	}
	
	public static void main(String[] args) 
	{Student1 Rohini = new Student1();
	Rohini.rollno = 12;
	Rohini.age = 29;
	
	System.out.println("value of rollno is " + Rohini.rollno);
	System.out.println("value of age is " + Rohini.age);
	
	Rohini.method1();
	Rohini.method2();
	System.out.println();

	
	
	
	Student1 Hari = new Student1();
	Hari.rollno = 13;
	Hari.age = 32;
	
	System.out.println("value of rollno is " + Hari.rollno);
	System.out.println("value of age is " + Hari.age);
	
	Hari.method1();
	Hari.method2();
	
	}
	

}
