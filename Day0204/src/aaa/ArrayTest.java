package aaa;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int[] grade= {50,99,68,76,89,44,88};
		Arrays.sort(grade);
		System.out.println(Arrays.toString(grade));
		for(int i=grade.length-1;i>=0;i--) {
			System.out.print(grade[i]+",");
		}
	}

}
