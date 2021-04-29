// to test the result
package sorting;

public class Main 
{
	public static void main(String[] args) 
	{
		int[] data = {8, 1, 2, 8, -1, 10, 15, 8, 7, 20, 3, -10, 11, 25, 0, 8, 10, -5, 8, 33, -29, 50, 6, 5};
		Data[] arr = new Data[data.length+1];
		
		arr[0] = new Data(0);
		for(int i = 0; i < data.length; i++)
		{
			arr[i+1] = new Data(data[i]);
		}
		
		new Heap().sort(arr);
		show(arr);
		
//		String[] strArr = {"dad", "add", "cab", "fad", "fee", "deb", "dab", "bee", "feb", "bed", "ebb", "ace"};
//		new MSD_Counting().sort(strArr);
//		show(strArr);
	}
	
	private static void show(Data[] a) 
	{
		for(int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i].value+" ");
		}
		System.out.println();
	}
	
	private static void show(String[] s) 
	{
		for(int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
		}
		System.out.println();
	}
}
