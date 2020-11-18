package aaa;

import java.util.*;

public class Maopao {
	public static void main(String[] args) {
		int[] a = {12,43,22,45,21,23,76,1,5,34,32,123,19,8,563,11};
		maopaoAarry(a);
	}
	public static int[] maopaoAarry(int[] a) {
		for(int i = 0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		return a;
	}
}
