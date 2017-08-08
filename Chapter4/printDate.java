// Select Answers from Think Java by Allen Downey
// author gdolwell





public class printDate {
	public static void printAmerican(String day, String month, int date, int year){
	System.out.print("Americans would say today is: ");
	System.out.printf("%s, %s %d, %d.\n", day, month, date, year);
    }

    public static void printEuropean(String day, int date, String month, int year){
	    System.out.print("Europeans would say today is: ");
	    System.out.printf("%s %d %s %d.\n", day, date, month, year);
    }
	
	
	public static void main (String args[]) {
		String day, month;
		int date, year;
		day = "Saturday";
		month = "August";
		date = 5;
		year = 2017;
		
		printAmerican(day, month, date, year);
		printEuropean(day, date, month, year);
		
	}
}

