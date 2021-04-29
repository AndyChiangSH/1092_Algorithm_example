package sorting;

public class Heap {
	public static void sort(Comparable[] a) {
		int N = a.length-1;
		
		for(int i = N/2; i > 0; i--) {	// build max heap(in-place)
			sink(a, i, N);
		}
		
		while(N > 1) {	// delMax N time: O(2*NlogN)
			exch(a, 1, N--);
			sink(a, 1, N);
		}
	}
	
	private static void sink(Comparable[] a, int k, int N) {
		while(2*k <= N) {
			int j = 2*k;	// its child
			if(j < N && less(a[j], a[j+1])) j++;	// right or left which is large?
			if(!less(a[k], a[j])) break;
			exch(a, k, j);
			k = j;
		}
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
