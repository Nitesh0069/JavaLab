// 3.	Write a program to demonstrate a division by zero exception 



public class _3_division_by_zero {
    public static void main(String[] args) {
        int a = 15;
        int b = 0;// changing it to other value should divide it forom 15;)
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException x){
            System.out.println("division by zero is not possible");
        }
    }
    
}

// division by zero is not possible
// 5
