package sorting;

public class Quick_select {
	public static int select(Comparable[] a, int k) {
		int lo = 0;
		int hi = a.length - 1;
		
		while(hi > lo) {
			int j = partition(a, lo, hi);
			if(j < k) lo = j + 1;
			else if(j > k) hi = j - 1;
			else return k;
		}
		return k;
	}
	
	private static int partition(Comparable[] a, int lo, int hi) {
		int i = lo, j = hi + 1;

		while (true) {
			while (less(a[++i], a[lo]))
				if (i == hi)
					break;

			while (less(a[lo], a[--j]))
				if (j == lo)
					break;

			if (i >= j)
				break;
			exch(a, i, j);
		}

		exch(a, lo, j);
		return j;
	}
	
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) > 0;
	}

	private static void exch(Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
