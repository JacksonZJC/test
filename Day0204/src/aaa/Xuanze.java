package aaa;

import java.util.Arrays;

public class Xuanze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12,43,22,45,21,23,76,1,5,34,32,123,19,8,563,11};
		chooes(a);
		choose2(a);
	}
	public static int[] chooes(int[] is) {
		for(int i=0;i<is.length-1;i++) {
			for(int j=i+1;j<is.length;j++) {
				if(is[i]>is[j]) {
					int t = is[i];
					is[i]=is[j];
					is[j]=t;
				}
			}
			
		}
		System.out.println(Arrays.toString(is));
		return is;
	}

	public static int[] choose2(int[] a) {
		for(int i = 0;i<a.length-1;i++) {
			for(int j=i;j<a.length-1;j++) {
				if(a[i]>a[j+1]) {
					int t = a[i];
					a[i]=a[j+1];
					a[j+1]=t;
				}
				               
			}
		}
		System.out.println(Arrays.toString(a));
		
		return a;
	}
}
