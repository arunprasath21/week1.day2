package week1.Day2.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int i ;
		for (i=1;i<arr.length;i++) {
	      if (i!=arr[i-1]){
		 System.out.println(i);
		break;
	      }
	}
	}
	
	
}
