package sorting;

import sorting.KunthShuffle;

public class ThreeWayPartition {
	private static void sort(Comparable[] a, int lo, int hi) {
		if (hi <= lo)
			return;
		int lt = lo, gt = hi, i = lo;
		Comparable v = a[lo];

		while (i <= gt) {
			int cmp = a[i].compareTo(v);
			if (cmp > 0)
				exch(a, lt++, i++);
			else if (cmp < 0)
				exch(a, i, gt--);
			else
				i++;
		}
		sort(a, lo, lt - 1);
		sort(a, gt + 1, hi);
	}

	public static void sort(Comparable[] a) {
		KunthShuffle.shuffle(a);
		sort(a, 0, a.length - 1);
	}

	private static void exch(Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
