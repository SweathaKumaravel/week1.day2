package week1.day2assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {0,1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i) {
				System.out.println("missing element:" + i);
				break;
			}
		}
		

	}

}
