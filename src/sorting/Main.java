// to test the result
package sorting;

public class Main 
{
	public static void main(String[] args) 
	{
		Data[] arr = new Data[10];
		int[] data = {5, 1, 2, 8, 3, 10, 15, 8, 7, 20};
		for(int i = 0; i < 10; i++)
		{
			arr[i] = new Data(data[i]);
		}
		new Selection().sort(arr);
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
