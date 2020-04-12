package classesandobjects;

public class IFElseStatement {

	public static void main(String[] args) {

		int marks = 95;

		if ((marks>=0) && (marks<=59)) {
			System.out.println("You fail the class.");

		} else if ((marks>= 60) && (marks <70)) {
			System.out.println("You recieve D Grade.");

		} else if ((marks>= 70) && (marks<80)) {
			System.out.println("You recieve C Grade");
		}
		  else if ((marks>= 80) && (marks<90)) {
			System.out.println("You recieve B Grade");
		}
		  else if ((marks>= 90) && (marks<=100)) {
			System.out.println("You recieve A Grade");
		}
		  else {
			System.out.println("Invalid Marks");
		}
	}
}



