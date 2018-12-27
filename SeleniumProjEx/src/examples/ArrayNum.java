package examples;
public class ArrayNum {

	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40, 50, 10};
	      int total = 0;

	      for( int num : array) 
	      {
	          total = total+num;
	      }
	      System.out.println("Sum of all elements in array is: "+total);
	}
}