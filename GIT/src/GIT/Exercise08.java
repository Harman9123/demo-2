package GIT;
public class Exercise08 {
	
	/*
	 * Entry point for the application, command line arguments are not
	 * used for this program.
	 */
	public static void main(String[] args) {
		System.out.println("Exercise 08 (21S) Version 1");
		EggCounter counter = new EggCounter();
		counter.enterEggs();
		counter.printReport();
		System.out.println("Program by Harmanpreet Singh");
	}
}
