package com.IB.Stacks;

public class MinStack {

	int min;
	int ind;
	int[] stack;
	int cap;
	MinStack(int size){
		cap = size;
		stack = new int[size];
	}
	public void push(int i){
		if(ind==0){
			stack[ind++] = i;
			min = i;
			return;
		}
		if(ind<cap){
			if(i<min){
				stack[ind++] = 2*i-min;
				min = i;
			}
			else
				stack[ind++] = i;
		}
	}
	public int pop(){
		if(ind>0){
			if(stack[--ind]>=min)
				return stack[ind];
			else{
				int tmp = min;
				min = 2*min-stack[ind];
				return tmp;
			}
		}
		else
			return -1;
	}
	public int getMin(){
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
