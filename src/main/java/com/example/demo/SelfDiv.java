package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class SelfDiv {

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList();
		List<Integer> list = new ArrayList();
		for (int i = left; i <= right; i++) {
			list.add(i);
		}
		int count=0;
		for(int i=0; i<list.size(); i++) {
			Integer num = list.get(i);
			String str = String.valueOf(num);
			int amount = str.length();
			count=0;
			for(int j=0; j<amount; j++) {
				String divStr = str.substring(j,j+1);
				int div = Integer.valueOf(divStr);
				if(div==0) {
					break;
				}
				int divCount = num%div;
				if(divCount==0) {
					count+=1;
				}
				if(amount==count) {
					result.add(num);
				}
			}
			
			
		}
		
		
		
		return result;
	}

	public static void main(String[] args) {
		SelfDiv test = new SelfDiv();
		int left = 1;
		int right = 22;
		List<Integer> result = test.selfDividingNumbers(left, right);
		System.out.println(result);
	}

}
