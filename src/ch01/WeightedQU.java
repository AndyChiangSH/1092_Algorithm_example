package ch01;

public class WeightedQU {
	
	private int[] id;
	private int[] size;

	public WeightedQU(int N) {
		id = new int[N];
		size = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
			size[i] = 1;
		}
	}

	public int find(int i) {
		while (i != id[i]) {
			id[i] = id[id[i]];
			i = id[i];
		}
		return i;
	}

	public void union(int p, int q) {
		int proot = find(p);
		int qroot = find(q);
		
		if(size[proot] < size[qroot]) {
			id[proot] = qroot;
			size[qroot] += size[proot];
		}
		else {
			id[qroot] = proot;
			size[proot] += size[qroot];
		}
	}
	
	public void connected(int p, int q) {
		if(find(p) == find(q)) {
			System.out.println("connected");
		}
		else {
			System.out.println("not connected");
		}
	}
	
	public void show() {
		for(int i = 0; i < id.length; i++) {
			System.out.print(id[i]+" ");
		}
	}
}
