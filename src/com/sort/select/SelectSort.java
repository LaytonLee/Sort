package com.sort.select;

/**
 * 简单选择排序
 * @author 誠
 *
 */
public class SelectSort {
	/**
	 * 简单选择排序
	 * 
	 * @param a
	 * 			待排序数组
	 * 
	 */
	public int selectSort(int[] a){
		/**
		 * index 存储最小值的下标
		 */
		int index, temp;
		int exchange = 0;
		int n = a.length;
		/**
		 * 遍历数组
		 */
		for (int i = 0; i < n; i++) {
			index = i;
			// index =  i+1 到 n-1 中的最小值下标
			for(int j = i+1; j < n; j++){
				if (a[index] > a[j]) {
					index = j;
				}
				exchange++;
			}
			//a[i] = i+1 到 n-1 中的最小值
			if (index != i) {
				temp = a[i];
				a[i] = a[index];
				a[index] = temp;
			}
			exchange++;
		}
		
		//验证输出
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
		
		return exchange;
	}
}
