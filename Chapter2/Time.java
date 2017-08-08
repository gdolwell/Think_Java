/**
 * Time.java
 * exercise form Think Java by Allen Downey
 * @author gdolwell
 */



public class Time {
    
    
    public static void main (String args[]) {
        int hour1, hour2, minutes1, minutes2, seconds1, seconds2;
        float percent_of_day;
        float secs_since_midnight_finish, secs_since_midnight_start, secs_in_day;
        
        hour1 = 1600;
        minutes1 = 11;
        seconds1 = 30;
        hour2 = 1600;
        minutes2 = 40;
        seconds2= 45;
        
        secs_in_day = 60*60*24;
        secs_since_midnight_start = (((hour1 * 60) + minutes1) * 60) + seconds1;
        percent_of_day = secs_since_midnight_start / secs_in_day;
        secs_since_midnight_finish = (((hour2 * 60) + minutes2) * 60) + seconds2;
                
        System.out.print(secs_since_midnight_start);
        System.out.println(" seconds have elapsed since midnight.");
        
        System.out.print(percent_of_day);
        System.out.println(" percent of the day has elapsed.");
        
        System.out.print(secs_since_midnight_finish - secs_since_midnight_start);
        System.out.println(" seconds have passed since the start of this exercise.");
    }
}

