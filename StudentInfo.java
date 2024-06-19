package studentFulltimeBCA;

public class StudentInfo
{
	int age;
	char sex;
	String name,add,fn,mn;
	public StudentInfo(int e,char f,String a,String b,String c,String d)
	{
		age=e;
		sex=f;
		name=a;
		add=d;
		fn=b;
		mn=c;
	}
	public void display()
	{
		System.out.println("STUDENT PERSONAL DETAILS");
		System.out.println("Name of the student is: "+name);
		System.out.println("Age="+age);
		System.out.println("Student is "+sex);  
		System.out.println("Address of the student is: "+add);
		System.out.println("Father's name: "+fn);
		System.out.println("Mother'sname is: "+mn);
	}
}
