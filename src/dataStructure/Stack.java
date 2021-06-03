// stack template
package dataStructure;

class Data {	// you can add whatever data type you want
	public int num;
}

public class Stack {
	private Data[] data;
	private int maxSize;
	private int top;
	
	public Stack(int len) {	// initialize
		maxSize = len;
		data = new Data[maxSize];
		for(int i = 0; i < maxSize; i++) {
			data[i] = new Data();
		}
		top = -1;
	}
	
	public boolean isFull() {
		if(top == maxSize - 1) return true;
		else return false;
	}
	
	public boolean isEmpty() {
		if(top == -1) return true;
		else return false;
	}
	
	public void push(int num) {		// given data, add push on top of stack.
		if(isFull()) {
			System.out.println("Stack is full!");
			return;
		}
		else {
			data[++top].num = num;
		}
		return;
	}
	
	public Data pop() {		// pop up the data on top of stack.
		if(isEmpty()) {
			System.out.println("Stack is empty!");
			return null;
		}
		else {
			return data[top--];
		}
	}
}