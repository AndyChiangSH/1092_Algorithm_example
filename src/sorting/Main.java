// to test the result
package sorting;

public class Main 
{
	public static void main(String[] args) 
	{
		int[] data = {8, 1, 2, 8, -1, 10, 15, 8, 7, 20, 3, -10, 11, 25, 0, 8, 10, -5, 8, 33, -29, 50, 6, 5};
		Data[] arr = new Data[data.length];
		
		for(int i = 0; i < data.length; i++)
		{
			arr[i] = new Data(data[i]);
		}
		new ThreeWayPartition().sort(arr);
		show(arr);
	}
	
	private static void show(Data[] a) 
	{
		for(int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i].value+" ");
		}
	}
}
