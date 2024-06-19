//2.	Write a program to display the month of a year. Months of the year should be held in an array.


// using calendar class 
import java.util.Calendar;

public class _2_months {
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        
        String month[] = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        
        // Get the current month index from the Calendar instance
        int currentMonthIndex = calendar.get(Calendar.MONTH);
        
        // Output the current month
        System.out.println("Current month: " + month[currentMonthIndex]);
    }
}

// Current month: June