package com.sort.merge;

/**
 * 效率较差的归并排序
 * @author 誠
 *
 */
public class MergeSort_1 {
	
	public static final int SIZE = 1000000;
	/**
	 * 归并排序
	 * @param obj
	 * @param left
	 * @param right
	 */
	public int[] mergeSort(int[] obj, int left, int right) {
		int[] bridge = new int[SIZE];   //中间数组
		if (left < right) {
			int center = (left + right)/2;   //中点
			mergeSort(obj, left, center);
			mergeSort(obj, center+1, right);
			merge(obj, bridge, left, center, right);   //合并到数组bridge
			copy(obj, bridge, left, right);   //复制回数组obj
		}
		return obj;
		
	}
	
	/**
	 * 合并函数
	 * @param obj
	 * 			原数组
	 * @param bridge
	 * 				中间数组
	 * @param left
	 * @param center
	 * @param right
	 */
	public void merge(int[] obj, int[] bridge, int left, int center, int right){
		int mid = center + 1;
		int third = left;
		int tem = left;
		//将要合并数组从最小元素开始比较，依次插入到bridge
		while(left <= center && mid <= right){
			//从两个数组取出小的放入中间数组
			if (obj[left] <= obj[mid]) {
				bridge[third++] = obj[left++];
			}
			else{
				bridge[third++] = obj[mid++];
			}
		}
		
		//剩余部分一次置入中间数组bridge
		//右侧数组剩余
		while(mid <= right){
			bridge[third++] = obj[mid++];
		}
		//左侧数组剩余
		while (left <= center) {
			bridge[third++] = obj[left++];
		}
		//将中间数组bridge 的内容拷贝到原数组obj
		copy(obj, bridge, tem, right);
	}
	
	/**
	 * 复制函数
	 * @param obj
	 * 			原数组
	 * @param bridge
	 * 				中间数组
	 * @param left
	 * @param right
	 */
	public void copy(int[] obj, int[] bridge, int left, int right){
		while(left <= right){
			obj[left] = bridge[left];
			left++;
		}
	}
}
