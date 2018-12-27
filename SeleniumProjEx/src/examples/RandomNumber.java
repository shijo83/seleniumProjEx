package examples;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {

		Random generator = new Random();
		
		int num;
		
		num = generator.nextInt(100);
		
		System.out.println("Random number from 0 to 99 = "+ num);
	}

}
