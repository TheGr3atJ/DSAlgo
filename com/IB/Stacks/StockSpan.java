package com.IB.Stacks;

import java.util.Stack;


public class StockSpan {

	
	public int[] solve(int[] inp){
		Stack<Integer> s = new Stack<Integer>();
		int n = inp.length;
		int[] res = new int[n];
		s.add(0);
		res[0] = 1;
		for(int i=1;i<n;i++){
			if(inp[s.peek()]<=inp[i]){
				while(!s.isEmpty() && inp[s.peek()]<=inp[i])
					s.pop();
				res[i] = s.isEmpty() ? i+1 : i-s.peek();
			}
			else
				res[i] = 1;
			s.add(i);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inp = new int[]{100, 80, 60, 70, 60, 75, 85};
		System.out.println(new StockSpan().solve(inp));
	}

}
