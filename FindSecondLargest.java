package week1.day2assignments;
import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println("the second largest array is:" + data[data.length-2]);

	}

}
