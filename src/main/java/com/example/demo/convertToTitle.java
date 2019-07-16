package com.example.demo;

public class convertToTitle {
	public String convertToTitle(int n) {
	    char input = (char) (n+64);
	    StringBuilder result = new StringBuilder();
	    int init = 65;
        int carry=0;
        if(input>=91){
            carry = (input-91)/26+1;
        }
        char one=input;
	    if(carry>0){
            one= (char) (init+carry-1);
        }
        result.append(one);

	    if(carry>0){
            int diff = input-91;
            diff =diff%26;
            char two = (char) (init+diff);
	        result.append(two);
        }
//        int diff = input-91;
//	    if(input>90){
//            char sec = (char) dif;
//	        result.append(sec);
//        }
	    return String.valueOf(result);



//        int OriNumber = n+64;	//ascii
//        int number = OriNumber;
//        int sInto=0;
//        int dif = OriNumber-91;
//        int fInto = number/90;
//        int fintoNumber = fInto+65;
//        int init = 65;
//        if(OriNumber>90) {
//        	number = init;
//        	sInto=65+dif;
//        }
//
//        char c = (char) number;
//        if(fInto>1) {
//        	c = (char) fintoNumber;
//        }
//        char intoc = (char) sInto;
////        if(sInto>90) {
////        	intoc=(char) ((char) 65+dif);
////        }
//        StringBuffer add = new StringBuffer();
//        add.append(c);
//        if(OriNumber>90) {
//        	add.append(intoc);
//        }
//        String str = String.valueOf(add);
//        return str;
    }
	
	public static void main(String[] args) {
		convertToTitle test = new convertToTitle();
		int n=702;
//        1 -> A
//        2 -> B
//        3 -> C
//        26 -> Z
//        27 -> AA
//        28 -> AB
//        52 -> AZ
//        53 -> BA
//        701 -> ZY
//        703 -> AAA
        String result = test.convertToTitle(n);
		System.out.println(result);
	}
}
