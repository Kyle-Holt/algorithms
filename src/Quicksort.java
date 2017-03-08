import java.util.Arrays;

public class Quicksort {
	
	public int[] quicksort(int array[], int left, int right) {
		
			int mid = partition(array, left, right);
			
			if(left < mid - 1) {
				quicksort(array, left, mid-1);
			}
			if (mid < right) {
				quicksort(array, mid, right);
		}
		return array;	
	}
	
	public int partition(int array[], int left, int right) {
		int mid = array[(left + right)/2];
		int temp;
		
		while(left <= right) {
			while(array[left] < mid) {
				left++;
			}
			while(array[right] > mid) {
				right--;
			}
			if(left <= right){
				temp = array[right];
				array[right] = array[left];
				array[left] = temp;
				left++;
				right--;
			}
		}
		return left;
	}
	
	public static void main(String a[]) {
		Quicksort quik = new Quicksort();
		int[] array = {0, 2, 333, 6, 3, 77, 84, 2};
		int[] newArray = quik.quicksort(array, 0, 7);
		System.out.println(Arrays.toString(newArray));
	}
}
