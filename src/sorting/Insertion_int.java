package sorting;

public class Insertion_int {
	
	public static void main(String[] args) {
		Insertion_int test = new Insertion_int();
		int[] input = { -2, 7, 15, -14, 0, 15, 0, 7, -7, -4, -13, 5, 8, -14, 12 };
		
		test.insertionSort(input, 0, input.length);
		test.printArray(input, input.length);
	}
	
	private void insertionSort(int[] a, int lo, int hi) {
		for (int i = lo + 1; i < hi; i++) {
			int temp = a[i];
			int j = i;
			while(j > lo && temp < a[j-1]) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;
		}
	}
	
	public void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
	}
}
