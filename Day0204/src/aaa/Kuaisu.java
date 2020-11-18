package aaa;

import java.util.Arrays;

/**
 * 快速排序
* @author 郑杰存
*/
public class Kuaisu {
	public static void main(String[] args) {
		int[] a = {12,43,22,45,21,23,76,1,5,34,32,123,19,8,563,11};
		kuaisu(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	/**
	 *
	  *  快排代码
	 * @param a
	 * @param low
	 * @param high
	 */
	public static void kuaisu(int[] a,int low,int high){
        int i,j,t,temp;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        temp = a[low];//temp就是基准位
        while (i<j) {
            //首先看右边，依次往左递减
            while (temp<=a[j]&&i<j) {
                j--;
            }
            //然后看左边，依次往右递增
            while (temp>=a[i]&&i<j) {
                i++;
            }
            //满足条件则交换
            if (i<j) {
                t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }
        //最后与i和j相等位置的数字交换
        a[low] = a[i];
        a[i] = temp;
        kuaisu(a, low, j-1);//递归调用左半数组
        kuaisu(a, j+1, high);//递归调用右半数组
    }
}
