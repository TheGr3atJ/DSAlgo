package com.IB.Stacks;

import java.util.Stack;

public class InfixToPostfix {

	public String toPostfix(String inp){
		String res = "";
		char[] arr = inp.toCharArray();
		int n = arr.length;
		Stack<Character> s = new Stack<Character>();
		for(int i =0;i<n;i++){
			if(Character.isAlphabetic(arr[i]))
				res += arr[i];
			else if(')'==arr[i]){
				while(!s.isEmpty() && s.peek()!='('){
					res+=s.pop();
				}
				if(s.isEmpty())
					return "Invalid Expression";
				else
					s.pop();
			}
			else{
				while( !s.isEmpty() &&s.peek()!='(' && prec(arr[i])<prec(s.peek())){
					res+=s.pop();
				}
				s.push(arr[i]);
			}
		}
		while( !s.isEmpty()){
			if(s.peek()=='(')
				return "Invalid Expression";
			res+=s.pop();
		}
		return res;
	}
	private int prec(char c) {
		if('+'==c || '-'==c)
			return 1;
		else if('*'==c || '/'==c)
			return 2;
		else if('^'==c)
			return 3;
		else
		return 4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new InfixToPostfix().toPostfix("(a+b)*(c-d)/e"));
	}

}
