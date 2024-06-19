// 9.	In a college first year class are having the following attributesName of the class (BCA, BCom, BSc), 
// Name of the staff No of the students in the class, Array of students in the class Define a class called first
//  year with above attributes and define a suitable constructor. Also write a method called best Student () which
//   process a first-year object and return the student with the highest total mark. In the main method define a first-year 
//   object and find the best student of this class 
import java.util.*;

class firstyear {
    Scanner sc = new Scanner(System.in);
    String classname;
    String classteacher;
    int stdcount;
    int stdmarks[] = new int[50];
    String stdname[] = new String[50];

    public firstyear() {
        getinfo();
    }

    public void getinfo() {
        System.out.println("Enter class name");
        classname = sc.nextLine();

        System.out.println("Enter class teacher name");
        classteacher = sc.nextLine();

        System.out.println("Enter the number of studnet in the class");
        stdcount = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the name of students");
        for (int i = 0; i < stdcount; i++) {
            stdname[i] = sc.nextLine();
        }
        System.out.println("Enter the marks of students ");
        for (int i = 0; i < stdcount; i++) {
            stdmarks[i] = sc.nextInt();
        }
    }

    void beststudent() {
        int best = 0, k = -1;
        for (int i = 0; i < stdcount; i++) {
            if (stdmarks[i] > best) {
                best = stdmarks[i];
                k = i;
            }
        }
        System.out.println("best student of the class is " + stdname[k]);
    }

}

public class _9_beststudent {
    public static void main(String[] args) {
        firstyear fy = new firstyear();
        fy.beststudent();
    }
}
