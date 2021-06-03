package sorting;

public class Insertion {
	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 1; i < N; i++) {
			Comparable temp = a[i];
			int j = i;
			while(j > 0 && less(temp, a[j-1])) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;
		}
	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) > 0;
	}
}
