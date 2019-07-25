package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class PairOfSong {

	public int numPairsDivisibleBy60(int[] time) {
		int count = 0;
		int k=0;
		for (int i = 0; i < time.length; i++) {
			for (int j =1+k; j < time.length; j++) {
				if ((time[i] + time[j]) % 60 == 0) {
					count+=1;
				}
			}
			k+=1;
		}
		return count;

	}

	public static void main(String[] args) {
		PairOfSong test = new PairOfSong();
		int[] time = {418,204,77,278,239,457,284,263,372,279,476,416,360,18};
		int result = test.numPairsDivisibleBy60(time);
		System.out.println(result);
	}

}
