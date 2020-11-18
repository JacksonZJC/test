package aaa;

public class Arraytest2 {
	public static void main(String[] args) {
		int[][] a = { { 1, 5 }, { 6 }, { 6, 5, 9 } };
		for (int[] a1 : a) {
			for (int a2 : a1) {
				System.out.print(a2 + " ");
			}
			System.out.println();
		}

		int[][] b = {{1,2,3,4},{1,2,3},{1,2},{1}};
		for(int[] b1:b) {
			for(int b2:b1) {
				System.out.print(b2+" ");
			}
			System.out.println();
		}
	}

}
