package com.revature.list;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<E> {
	
	private int size = 0; // size of list
	private Object data[] = {};
	
	public MyArrayList() {
		data = new Object[5];
		
	}
	

	public void add(int val) {
		if(size == data.length) {//if number of elements is equal to array, increase the capacity
			makeCapacity();
		}
		data[size++] = val;
	}

	private void makeCapacity() {
		int moreCapacity = data.length * 2;
		data = Arrays.copyOf(data, moreCapacity);
		
	}


	public void set(int index, int val) {
			if(index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();
			
		}


	public int size() {
		// TODO Auto-generated method stub
		return size;
	}


	/*
	 * public void remove(int index) { if(index <= 0 || index > size) { throw new
	 * IndexOutOfBoundsException("Index " + index + ", size" + index); } for ( int i
	 * = index; i < size - 1; i++) { data[i] = data[i + 1]; // 1 space available
	 * after removal in array } size--; // //item removed from array }
	 */
	
	public Object get(int index) {
		checkRange(index);
		return data[index];
	}
	
	private void checkRange(int index) {
		if(index > size) {
			throw new IndexOutOfBoundsException();
		}
		
	}
	public Integer remove(int index) {
		checkRange(index);
		Integer removedValue = (Integer)data[index];
		int dataMov = size-index-1;
		System.arraycopy(data, index+1, data, index, dataMov);
		size--;
		data[size] = null;
		return removedValue;
	}

	/*
	 * public int get(int index) { if( index < 0 || index >= size) { throw new
	 * IndexOutOfBoundsException("Index " + index + ", size" + index); } return
	 * index; }
	 */

	@Override
	public String toString() {
		System.out.println(data.toString());
		return null ;
	}

	public static void main(String[] args) {
		
		ArrayList MyList = new ArrayList();
		
		MyList.add(new Integer(12)); MyList.add(new Integer(40));
		
		MyList.add(new Integer(27)); MyList.add(new Integer(35));
		
		MyList.add(new Integer(83)); MyList.add(new Integer(238));
		
		for(int i = 0; i < MyList.size(); i++) {
			
			System.out.println(MyList.get(i) + " ");
		}
		MyList.add(new Integer(101));
		
		
		System.out.println("Element at position 5: " + MyList.get(5));
		System.out.println("Total list size: " + MyList.size());
		System.out.println("Removing element at current position 4: " + MyList.remove(4));
		
			for(int i = 0; i < MyList.size(); i++) {
				
				System.out.println(MyList.get(i));
			}
	}
}