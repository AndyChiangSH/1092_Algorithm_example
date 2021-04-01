package connectivity;

public class QuickFindUF {
	
	private int[] id;

	public QuickFindUF(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++)
			id[i] = i;
	}

	public int find(int p) {
		return id[p];
	}

	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		for(int i = 0; i < id.length; i++) {
			if(id[i] == pid) {
				id[i] = qid;
			}
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
