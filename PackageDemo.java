// 11.	Create a package ‘student.Fulltime.BCA’ in your current working directory a. 
// Create a default class student in the above package with the following attributes: 
// Name, age, sex. b. Have methods for storing as well as displaying 


/*Main Class*/

import studentFulltimeBCA.StudentInfo;

class _11_PackageDemo
{
	public static void main(String args[])
	{
	StudentInfo a =new StudentInfo(18,'M',"PETER","Mr. JOHN", "Mrs.MARY", "VIZAG");
		a.display();
	}
}


//package studentFulltimeBCA;

// public class StudentInfo
// {
// 	int age;
// 	char sex;
// 	String name,add,fn,mn;
// 	public StudentInfo(int e,char f,String a,String b,String c,String d)
// 	{
// 		age=e;
// 		sex=f;
// 		name=a;
// 		add=d;
// 		fn=b;
// 		mn=c;
// 	}
// 	public void display()
// 	{
// 		System.out.println("STUDENT PERSONAL DETAILS");
// 		System.out.println("Name of the student is: "+name);
// 		System.out.println("Age="+age);
// 		System.out.println("Student is "+sex);  
// 		System.out.println("Address of the student is: "+add);
// 		System.out.println("Father's name: "+fn);
// 		System.out.println("Mother'sname is: "+mn);
// 	}
// }   create package and store the data there
// javac -d.java
