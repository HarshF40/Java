import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Creating a object to take input from the standard input(Keyboard)
		//There is case in .nextInt and .nextDouble
		//when we type a number and then press enter
		//there is still '\n' left in the buffer so if anything below that expects a string
		//will take that as input and will not give the user chance to enter the data
		//so after taking a number input we do
		//scanner.nextLine() or scanner.next() that will eat up that buffer before it reaches the main input stream
		//eg:
		System.out.print("Enter Your age: ");
		int age = scanner.nextInt(); //this will take the integer part but will leave the new line and wont give the user chance to input the next data.
		scanner.nextLine(); //this will eat up the \n
		System.out.print("\nWhats your name: ");
		String name = scanner.nextLine(); //this will take the \n as the input if we dont clear the buffer
		System.out.print("\nHi " + name + " your age is " + age);
		scanner.close(); //closes the scanner
	}
	
}
