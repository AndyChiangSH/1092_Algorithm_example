package sorting;

import sorting.KunthShuffle;

public class ThreeWayPartition 
{
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
		if(hi <= lo) return;
		int lt = lo, gt = hi, i = lo;
		Comparable v = a[lo];
		
		while(i <= gt)
		{
			int cmp = a[i].compareTo(v);
			if(cmp > 0) exch(a, lt++, i++);
			else if(cmp < 0) exch(a, i, gt--);
			else i++;
		}
		sort(a, lo, lt-1);
		sort(a, gt+1, hi);
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
