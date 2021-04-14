package sorting;

public class LSD_Counting {
	public static void sort(String[] a, int len) {
		int R = 256;
		int N = a.length;
		String[] aux = new String[N];
		
		// one char at one time
		for(int d = len - 1; d >= 0; d--) {
			int[] count = new int[R+1];
			
			// Count every alphabet
			for(int i = 0; i < N; i++) {
				count[a[i].charAt(d) + 1]++;
			}
			// Accumulate count
			for(int r = 0; r < R; r++) {
				count[r + 1] += count[r];
			}
			// Set every alphabet to aux
			for(int i = 0; i < N; i++) {
				aux[count[a[i].charAt(d)]++] = a[i];
			}
			// copy aux to a
			for(int i = 0; i < N; i++) {
				a[i] = aux[i];
			}
		}
	}
}
