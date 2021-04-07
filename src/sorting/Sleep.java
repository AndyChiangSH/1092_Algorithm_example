// sleep sortXD
package sorting;

public class Sleep 
{
	public static void main(String[] args) 
	{
		int[] a = {42, 51, 15, 21, 1, 69, 12, 8, 34, 10};
		
		for(int i : a)
		{
			MultiThread t = new MultiThread(a[i]);
			t.start();
		}
	}
	
	class MultiThread extends Thread 
	{		
		private int i;
		
		public MultiThread(int p) 
		{
			i = p;
		}
		
		public void run() 
		{
			synchronized (this) 
			{
				try
				{
					wait(i);
					notifyAll();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				System.out.println(i+" ");
			}
		}
	}
}
