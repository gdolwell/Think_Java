
/**
 * Write a description of class hello_world here.
 *
 * @author gdolwell
 */


public class Date
{
	public static void main(String[] args) {;
        int date, year;
        String day, month;
        date = 3;
        day = "Thursday";
        month = "August";
        year = 2017;
        
        /**System.out.println(day);
        *System.out.println(date);
        *System.out.println(month);
        System.out.println(year);
        */
        
        System.out.println("American Format:");
        System.out.println(day + ", " + month + " " + date + " ," + year);
        System.out.println("European Format:");
        System.out.println(day + " " + date + " " + month + " " + year);
    }
}
