import java.util.Random;
import java.util.Scanner;

/*
	ISYS 320
	Name(s):drew schulte	
	Date: april 16
*/

public class P5_RandomMessageRepeater {

	public static void main(String[] args) {
		System.out.println(getRandomMessage());
		doWhileRepeater("Why would a Pop-Tart want to live inside a toaster?");
		whileRepeater("Enter a number");
	}

	public static String getRandomMessage() {
		Random r = new Random();
		int value = r.nextInt(3);

		if (value == 0) {
			return "I am hungry";
		}
		if (value == 1) {
			return "I will eat";
		} else {
			return "Maybe";
		}

	}

	public static void doWhileRepeater(String message) {
		Scanner console = new Scanner(System.in);
		int x = 1;
		do {
			System.out.println(message);
			System.out.println("Do you want to hear it again (-1 for no)?");
			x = console.nextInt();
		} while (x >= 0);

	}

	public static void whileRepeater(String message) {
		Scanner console = new Scanner(System.in);
		int x = 1;
		while (x >= 0) {
			System.out.println(message);
			System.out.println("positive will continue and negitive will exit?");
			x = console.nextInt();
		}

	}
}
