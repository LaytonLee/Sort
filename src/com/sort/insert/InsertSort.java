package com.sort.insert;

/**
 * 直接插入排序
 * @author 誠
 *
 */
public class InsertSort {
	/**
	 * 直接插入排序
	 * @param a
	 * 			待排序数组
	 * 
	 */
	public int insertSort(int[] a){
		int n = a.length;    // 数据个数
		int exchange = 0;    //比较次数
		int j, temp;
		//进行n-1躺插入
		for(int i = 1; i < n; i++){
			temp = a[i];
			
			j = i-1;
			//从  a2 开始，将前 0 - i-1 看成有序表，将第 i 个元素插入到有序表
			while (j >= 0 && temp < a[j]) {
				a[j+1] = a[j];
				j--;
				exchange++;
			}
			//exchange++;
			a[j+1] = temp;
		}
		
		//验证输出
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
		//System.out.println(exchange);
		return exchange;
	}
}
