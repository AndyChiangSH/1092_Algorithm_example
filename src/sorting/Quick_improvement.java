package sorting;

import sorting.KunthShuffle;

public class Quick_improvement 
{
	static int CUTOFF = 32;
	
	private static int partition(Comparable[] a, int lo, int hi)
	{
		int i = lo, j = hi + 1;
		
		while(true)
		{
			while(less(a[++i], a[lo]))
				if(i == hi) break;
			
			while(less(a[lo], a[--j]))
				if(j == lo) break;
			
			if(i >= j) break;
			exch(a, i, j);
		}
		
		exch(a, lo, j);
		return j;
	}
	
	private static void sort(Comparable[] a, int lo, int hi)
	{
		// cutoff when the subarray is short
		if (hi - lo <= CUTOFF - 1) {
//			Insertion.sort(a, lo, hi);
			return;
		}
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}
	
	public static void sort(Comparable[] a)
	{
		KunthShuffle.shuffle(a);
		sort(a, 0, a.length-1);
	}
	
	private static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) > 0;
	}
	
	private static void exch(Comparable[] a, int i, int j)
	{
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
