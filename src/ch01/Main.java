package ch01;

public class Main {
	public static void main(String[] args) {
		WeightedQU demo = new WeightedQU(10);
		
		demo.union(4, 3);
		demo.union(3, 8);
		demo.union(6, 5);
		demo.union(9, 4);
		demo.union(2, 1);
		demo.union(5, 0);
		demo.union(7, 2);
		demo.union(6, 1);
		demo.union(7, 3);
		
		demo.show();
	}
}
