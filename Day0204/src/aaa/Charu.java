package aaa;

import java.util.Arrays;

public class Charu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12,43,22,45,21,23,76,1,5,34,32,123,19,8,563,111,33};
		charu(a);
		
		
	}
	public static void charu(int[] a) {
		for(int i=1;i<a.length;i++) {
			int t = a[i];
			int leftindex = i - 1;
			while(leftindex>=0&&a[leftindex]>t) {
				a[leftindex+1]=a[leftindex];
				leftindex--;
			}
			a[leftindex+1]=t;
			System.out.println(Arrays.toString(a));
		}
	}

}
