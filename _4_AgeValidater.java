// 4.	Write a program to create a user defined exception say Pay Out of Bounds. 

public class _4_AgeValidater {
    public static void main(String[] args) {
        int []Age={15,-3,130};


        for(int testage : Age){
            //used for each loop
            try{
                validateAge(testage);
                System.out.printf( "%d is valid age\n" ,testage );
            }
            catch(AgeOutOFRange e){
                System.out.println("Exception caught : "+e.getMessage());
            }
        }
    }

    public static void validateAge(int testage)throws AgeOutOFRange{
        if( testage <0|| testage >120){
            throw new AgeOutOFRange("age is out of acceptble range "+ testage);
        }
    }
}
// public class AgeOutOFRange extends Exception{
//     public AgeOutOFRange(String message){
//         super(message);
//     }
// }
//  make a separate .java file to use it as exception for running 
    

