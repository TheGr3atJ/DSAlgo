package com.IB.Stacks;

import java.util.Stack;

public class rainWaterTrapped {

	public int solve(int[] inp){
		int res=0;
		int n = inp.length;
		Stack<Integer> s = new Stack<Integer>();
		s.push(0);
		for(int i = 1;i<n;i++){
			while(!s.isEmpty() && inp[s.peek()]<inp[i]){
				int top = s.pop();
				if(!s.isEmpty()){
				int dist = i-s.peek()-1;
				res=res+ (Math.min(inp[s.peek()],inp[i])-inp[top])*dist;
				}
			}
			s.push(i);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inp = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(new rainWaterTrapped().solve(inp));
	}

}
