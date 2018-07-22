package com.sort.bubble;

/**
 * 冒泡排序
 * @author 誠
 *
 */
public class BubbleSort {
	
	/**
	 * 冒泡排序
	 * 
	 * @param a
	 * 			待排序数组
	 * 
	 */
	public int bubbleSort(int[] a){
		int n = a.length;
		int exchange, temp;
		exchange = 0;
		
		for(int i=n; i>1; i--){
			for(int j=0; j<i-1; j++){
				if (a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				exchange++;
			}
		}
		
		//验证输出
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
		
		return exchange;  //交换次数
	}
}
