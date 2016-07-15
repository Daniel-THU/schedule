
public class Algorithm {
	
	public static JobNode[] mergeSort(JobNode list[], int left, int right){
		int middle = (left + right) / 2;
		JobNode[] list1 = null, list2 = null, ansList = null;
		
		if (left < right) {  
			list1 = mergeSort(list, left, middle);
			list2 = mergeSort(list, middle + 1, right);
			ansList = merge(list1, list2); //将两个数组合并， 合并后数组降序， 长度为两个传入数组的长度和和
		} else {
			ansList = new JobNode[1];
			ansList[0] = list[left];
			return ansList;
		}
		return ansList;
	}
	private static JobNode[] merge(JobNode list1[], JobNode list2[]) {
		JobNode[] ansList = new JobNode[list1.length + list2.length];
		int i = 0, j = 0, k = 0;
		while (i < list1.length && j < list2.length) {
			if (list1[i].getTime() > list2[j].getTime()) {
				ansList[k] = list1[i];
				i++;
			} else {
				ansList[k] = list2[j];
				j++;
			}
			k++;
		}
		if (i == list1.length) {
			while (j < list2.length) {
				ansList[k] = list2[j];
				j++;
				k++;
			}
		} else if (j == list2.length) {
			while (i < list1.length) {
				ansList[k] = list1[i];
				i++;
				k++;
			}
		}
		return ansList;
	}
}
