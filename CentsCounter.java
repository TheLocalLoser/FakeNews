import java.util.Scanner;

public class CentsCounter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int quarters, dimes, nickels, cents;
		int whatsLeft, total;
		
		System.out.print("How many cents do you have?");
		total = keyboard.nextInt();
		
		quarters = total / 25;
		whatsLeft = total % 25;
		
		dimes = whatsLeft / 10;
		whatsLeft = whatsLeft % 10;
		
		nickels = whatsLeft / 5;
		whatsLeft = whatsLeft % 5;
		
		cents = whatsLeft;
		
		System.out.println();
		System.out.println("From " + total + " cents you get");
		System.out.println(quarters + " quarter(s)");
		System.out.println(dimes + " dime(s)");
		System.out.println(nickels + " nickel(s)");
		System.out.println(cents + " cent(s)");
		
		keyboard.close();
	}

}