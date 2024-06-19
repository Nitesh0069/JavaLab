// 5.	Write a java program to add two integers and two float numbers. 
// When no arguments are supplied, give a default value to calculate the sum. Use function overloading.

class add{
    public int add(int a , int b){
        return(a+b);
    }
    public int add(int a,int b,int c ){
        return(a+b+c);
    }
    public int add(){
        return(8+7);
    }
    public double add(double a , double b){
        return (a+b);
    }
}


public class _5_Function_overloading {
   public static void main(String[] args) {
    System.out.println("Function over loading is ");
    add add = new add();
    System.out.println(add.add(1,5));
    System.out.println(add.add(3, 4, 5));
    System.out.println(add.add(5.4,5.6));
    System.out.println(add.add());
   } 
}

// Function over loading is 
// 6
// 12
// 11.0
// 15