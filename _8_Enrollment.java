// 8.	Write a java program to create a student class with following attributes: Enrollment_id: Name, Mark of sub1, Mark of sub2, mark of sub3, Total Marks. 
// Total of the three marks must be calculated only when the student passes in all three subjects. The pass mark for each subject is 50. 
// If a candidate fails in any one of the subjects his total mark must be declared as zero. Using this condition write a constructor for this class.
//  Write separate functions for accepting and displaying student details. In the main method create an array of three student objects and display the details. 


import java.util.*;
class Student{
    Scanner sc = new Scanner(System.in);
    String Enrollment_id;
    String name;
    int sub1,sub2,sub3,totalmarks;

    public void getinfo(){
        System.out.println( "Enter enrollment id " );
        Enrollment_id = sc.next();
        System.out.println( "Enter name of student" );
        name = sc.next();
        System.out.println( "Enter the marks of 3 subject of students" );
        int sub1= sc.nextInt();
        int sub2= sc.nextInt();
        int sub3= sc.nextInt();

        if(sub1>=50 &&sub2>=50 &&sub3>=50){
            totalmarks = sub1+sub2+sub3;
        }
        else{
            totalmarks = 0;
        }
    
    }

    Student(){
        getinfo();
    }


    public void display(){
        System.out.printf( "\nEnrollment id = %s\t name of student is %s \t marks is %d\n",Enrollment_id,name,totalmarks );
    }

}




public class _8_Enrollment{
    public static void main(String[] args) {
        System.out.println("Enter the Stduent details");
      
        Student s[]= new Student[3];
        for(int i = 0;i<3;i++){
            s[i]= new Student();
        }

        System.out.println("Displaying infomartion of students ");
        for(int i=0 ; i<3;i++){
            s[i].display();
        }

    }

}


// Displaying infomartion of students

// Enrollment id = qw1      name of student is nitesh       marks is 222

// Enrollment id = qw2      name of student is guddu        marks is 235

// Enrollment id = qw3      name of student is munna        marks is 0