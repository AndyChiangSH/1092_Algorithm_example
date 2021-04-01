package sorting;

public class Data implements Comparable<Data> 
{
	public int value;
	
	public Data(int v)
	{
		value = v;
	}
	
	public int compareTo(Data that)
	{
		if(this.value > that.value) return -1;
		else if(this.value < that.value) return 1;
		else return 0;
	}
}
