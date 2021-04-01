// to test the result
package sorting;

public class Main 
{
	public static void main(String[] args) 
	{
		int[] data = {5, 1, 2, 8, 3, 10, 15, 8, 7, 20, -1, -10, 11, 25, 0};
		Data[] arr = new Data[data.length];
		
		for(int i = 0; i < data.length; i++)
		{
			arr[i] = new Data(data[i]);
		}
		new Insertion().sort(arr);
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
