
package my.calculator;

import java.util.Arrays;

public class Stack<T> {
    private T[] stack;
    private int topEntryIndex;
    private static final int DEFAULT_CAPACITY = 25;
	
    // creates an array with capacity 25
    public Stack()
    {
	this(DEFAULT_CAPACITY);
    } // end default constructor
	
    // creates an array of a specified capacity
    public Stack(int capacity)
    {
	@SuppressWarnings("unchecked")
	T[] tempStack = (T[]) new Object[capacity];
	stack = tempStack;
	topEntryIndex = -1;
    } // end constructor
	
    public void push(T newEntry)
    {
	if (topEntryIndex == stack.length) {
            //doubles the size of the array if it is full
            int newArrayLength = stack.length * 2;
            stack = Arrays.copyOf(stack, newArrayLength);
	}
	stack[topEntryIndex + 1] = newEntry;
	topEntryIndex++;
    } // end push
	
    public T pop()
    {
	if (isEmpty()) {
            //checks if the array is empty
            return null;
	}
	T temp = stack [topEntryIndex];
	stack[topEntryIndex] = null;
	topEntryIndex--;
	return temp;
    } // end pop
	
    public T peek() 
    {
	if (isEmpty()) {
            //checks if the array is empty
            return null;
	}
	return stack[topEntryIndex];
    } // end peek
	
    public void clear()
    {
	for (int i = topEntryIndex; i >= 0; i--) {
            stack[i] = null;
	}
    } // end clear
	
    public boolean isEmpty()
    {
	if (topEntryIndex >= 0) {
            return false;
	}
	else {
            return true;
	}
    } // end isEmpty
    
}
