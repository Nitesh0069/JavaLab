// 6.	Write a java program to perform mathematical operations. 
// Create a class called AddSub with methods to add and subtract.
//  Create another class called MulDiv that extends from AddSub class to use the member data of the super class. 
// MulDiv should have methods to multiply and divide A main function should 
// access the methods and perform the mathematical operations. 

import java.util.Scanner;

class AddSub{
//variables for the class AddSub
   int num1,num2;
   //parameterized constructor 
   public AddSub(int x, int y)
   {
    num1 = x;
    num2= y;
   }
   //additon methods
    public int additon(){
        return num1+num2;
    }
    //subtraction method
    public int subtraction(){
        return num1-num2;
    }
}

//multiplication and divison method
class MulDiv extends AddSub{
    // parameterized constructor
    public MulDiv(int x,int y){
        super(x, y);//super(x,y) is accesing the addsub varibales int x and int y
        //using super key words we can access the variables of parent class this 
    }
    // multiplication method
    public int Multiplication(){
        return num1*num2;
    }
    //division method
    public float Division(){
        return (float)num1/num2;
    }

}

// main class
public class _6_inheritence {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        MulDiv asmd = new MulDiv(x,y);
        System.out.println( "shows how to acces super class member data" );
        System.out.printf( "%d\n" ,asmd.additon());
        System.out.printf( "%d\n" ,asmd.subtraction());
        System.out.printf( "%.2f\n" ,asmd.Division() );
        System.out.printf( "%d\n" ,asmd.Multiplication() );
    }
    
 }

 
// shows how to acces super class member data
// 40
// -20
// 0
// 300