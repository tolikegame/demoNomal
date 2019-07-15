package com.example.demo;

public class convertToTitle {
	public String convertToTitle(int n) {
        int OriNumber = n+64;	//ascii
        int number = OriNumber;
        int sInto=0;
        int dif = OriNumber-91;
        int fInto = number/90;
        int fintoNumber = fInto+65;
        int init = 65;
        if(OriNumber>90) {
        	number = init;
        	sInto=65+dif;
        }
        
        char c = (char) number;
        if(fInto>1) {
        	c = (char) fintoNumber;
        }
        char intoc = (char) sInto;
//        if(sInto>90) {
//        	intoc=(char) ((char) 65+dif);
//        }
        StringBuffer add = new StringBuffer();
        add.append(c);
        if(OriNumber>90) {
        	add.append(intoc);
        }
        String str = String.valueOf(add);
        return str;
    }
	
	public static void main(String[] args) {
		convertToTitle test = new convertToTitle();
		int n=52;
		String result = test.convertToTitle(n);
		System.out.println(result);
	}
}
