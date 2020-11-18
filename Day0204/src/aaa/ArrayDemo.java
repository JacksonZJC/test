package aaa;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		String[] names = { "李四", "张三", "马六", "王五" };
		int[] a = { 12, 5, 6, 8, 21 };
		Arrays.sort(a);// 自动排序
		int re = Arrays.binarySearch(names, "李四");
		System.out.println(re);
		
//		for(String n:names) {
//			System.out.print(n+"\t");
//		}
		System.out.println(Arrays.toString(names));
		
		Arrays.fill(a,0,2,3);  //填充下标 0 -2不包括2，填充为3
		System.out.println(Arrays.toString(a));
	}

}
