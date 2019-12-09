package com.revature.sort;

public class BubbleSort {
		
	public static int[] Bubblesort(int[] list) { 
		int j = 0;//iteration count
		int temp = 0;//holder
		
		for(int i = 0; i < list.length - 1; i++ ) {
			
			for(j = 0; j < list.length - 1 - i; j++) {
				if(list[j] > list[j + 1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
			return list;
	}
	
		public static void main(String[] args) {
			int[] list = new int[100];
			for(int i = 0; i < list.length; i++) {
				list[i] = (int) (Math.random()*100 + 1);
				
			}
			list = Bubblesort(list);
			for(int i = 0; i < list.length; i++) {
				if(i != list.length - 1) {
					System.out.println(list[i] + " ");
				}else {
					
				}
				System.out.println(list[i]);
			}
		}
}