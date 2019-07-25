package com.example.demo;

public class HappyNumber {
	int co = 0;
	public boolean isHappy(int n) {
		int count = 0;
		double pow = 0;
		int positionNumber = 0;
		String toStr = String.valueOf(n);
		for (int i = 0; i < toStr.length(); i++) {
			String position = toStr.substring(i, i + 1);
			positionNumber = Integer.valueOf(position);
			pow = Math.pow(positionNumber, 2);
			count += pow;
		}
		if (count == 1) {
			return true;
		}
		co+=1;
		if(co==10) {
			return false;
		}
		return isHappy(count);

	}

	public static void main(String[] args) {
		HappyNumber test = new HappyNumber();
		int n = 19;
		boolean result = test.isHappy(n);
		System.out.println(result);
	}

}
