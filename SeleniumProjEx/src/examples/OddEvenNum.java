package examples;
import java.util.Scanner;

public class OddEvenNum {

	public static void main(String[] args) {

		int a;
		System.out.println("Enter number to check if it's odd or even:");
		Scanner num = new Scanner(System.in);
		a = num.nextInt();
		
		if (a % 2 == 0)
			System.out.println("You've entered an even number");
		else
			System.out.println("You've entered an odd number");
	}

}
