package first;
import java.util.Date;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Mydateclass{
	

	    public static void main(String[] args) {
	        // Joining date (Year, Month (0-indexed), Day)
	        int joiningYear = 2020;
	        int joiningMonth = 5; // June (0-indexed)
	        int joiningDay = 15;

	        Calendar joiningCalendar = Calendar.getInstance();
	        joiningCalendar.set(joiningYear, joiningMonth, joiningDay, 0, 0, 0);
	        Date joiningDate = joiningCalendar.getTime();

	        // Current date
	        Date currentDate = new Date();

	        // Calculate the difference in milliseconds
	        long timeDifferenceMillis = currentDate.getTime() - joiningDate.getTime();

	        // Convert milliseconds to years, months, and days (approximate)
	        long years = TimeUnit.MILLISECONDS.toDays(timeDifferenceMillis) / 365;
	        long remainingDaysAfterYears = TimeUnit.MILLISECONDS.toDays(timeDifferenceMillis) % 365;
	        long months = remainingDaysAfterYears / 30; // Approximate months
	        long days = remainingDaysAfterYears % 30;   // Approximate days

	        System.out.println("Employee's Job Tenure (Approximate):");
	        System.out.println("Years: " + years);
	        System.out.println("Months: " + months);
	        System.out.println("Days: " + days);
}
}