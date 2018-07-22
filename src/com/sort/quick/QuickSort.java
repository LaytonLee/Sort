package com.sort.quick;

/**
 * 快速排序
 * @author 誠
 *
 */
public class QuickSort {
	
	/**
	 * 快速排序
	 * @param x
	 * 			待排序数组
	 * @param p
	 * @param r
	 */
	public int[] quickSort(int[] x, int p, int r){
		if (p < r) {
			int q = partition(x, p, r);
			quickSort(x, p, q-1);  //对左部分递归排序
			quickSort(x, q+1, r);  //对右部分递归排序
		}
		
		return x;
	}
	
	/**
	 * 快排，分块函数
	 * @param a
	 * @param p
	 * @param r
	 * @return
	 */
	public int partition(int[] a, int p, int r){
		int i = p;
		int j = r + 1;
		int x = a[p];  // 默认将首元素设为比较元素
		
		while(true){
			while (a[++i] < x && i < r);  //++i，首到尾，直到有元素大于x=a[p]
			while (a[--j] > x);  //--j,尾到首，直到有元素小于x=a[p]
			if (i >= j) {
				break;
			}
			// a[i] > x=a[p] > a[j], 将 a[i] 与  a[j] 值交换
			int tem = a[i];
			a[i] = a[j];
			a[j] = tem;
		}
		
		// j = i-1，为从 j 分开，将 i 和  j 元素交换 
		a[p] = a[j];
		a[j] = x;
		return j; 
	}

}
