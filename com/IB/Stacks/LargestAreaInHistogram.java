package com.IB.Stacks;

import java.util.Stack;

public class LargestAreaInHistogram {

	public int largestArea(int[] arr){
		int max = 0;
		int i = 0;
		int n = arr.length;
		Stack<Integer> s = new Stack<Integer>();
		while(i<n){
			if(s.isEmpty() || arr[s.peek()]<=arr[i])
				s.push(i++);
			else{
				int tmp = s.pop();
				int area = arr[tmp] * (s.isEmpty()?i:i-s.peek()-1);
				if(area > max)
					max = area;
			}
		}
		while(!s.isEmpty()){
			int tmp = s.pop();
			int area = arr[tmp] * (s.isEmpty()?i:i-s.peek()-1);
			if(area > max)
				max = area;
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{5,6,4,2,2,3,4,5};
		System.out.println(new LargestAreaInHistogram().largestArea(arr));
	}

}
