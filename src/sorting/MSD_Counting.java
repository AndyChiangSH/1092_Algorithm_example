package sorting;

public class MSD_Counting {
	static String[] aux;
	
	public static void sort(String[] a) {
		aux = new String[a.length];
		sort(a, aux, 0, a.length - 1, 0);
	}
	
	public static void sort(String[] a, String[] aux, int lo, int hi, int d) {
		
		if(hi <= lo) return;
		System.out.println("lo = "+lo+", hi = "+hi+", d = "+d);
		int R = 256;
		int[] count = new int[R + 2];
		
		// Count every alphabet
		for(int i = lo; i <= hi; i++) {
			count[a[i].charAt(d) + 2]++;
		}
		// Accumulate count
		for(int r = 0; r < R + 1; r++) {
			count[r + 1] += count[r];
		}
		// Set every alphabet to aux
		for(int i = lo; i <= hi; i++) {
			aux[count[a[i].charAt(d) + 1]++] = a[i];
		}
		// copy aux to a
		for(int i = lo; i <= hi; i++) {
			a[i] = aux[i - lo];
		}	
		
		for(int r = 0; r < R; r++) {
			sort(a, aux, lo + count[r], lo + count[r+1] - 1, d + 1);
		}
	}
}
