package homeAssignment2804202;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[] args) {
		int[] element = {1, 4,3,2,8, 6, 7};
		 Arrays.sort(element);	
		 for(int i=0;i<element.length-1;i++) {
			 if(element[i]!=i+1) {
		         System.out.println(i+1);
		         break;
			 }
		 }
     }
}
