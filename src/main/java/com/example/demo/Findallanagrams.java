package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Findallanagrams {

	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			String catchNumber = s.substring(i, i + p.length());
			catchNumber.indexOf(p);

		}
		return result;
	}

	public static void main(String[] args) {
		Findallanagrams test = new Findallanagrams();
		String s = "cbaebabacd";
		String p = "abc";
		test.findAnagrams(s, p);
	}

}
