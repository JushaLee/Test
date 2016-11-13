package com.ljs.test;

public class Test {
	
	public static void main(String[] args) {
		testMaxLength_1();
	}
	
	public static void testMaxLength_1(){
		MaxLength maxLength = new MaxLength();
		
		String str = "abcabcbb";
		
	    assertEqual(maxLength.maxLength(str),3);
	}
	
	public static void testMaxLength_2(){
		MaxLength maxLength = new MaxLength();
		
		String str = "bbbbb";
		
	    assertEqual(maxLength.maxLength(str),1);
	}
	
	public static void testMaxLength_3(){
		MaxLength maxLength = new MaxLength();
		
		String str = "abcdefabcdefnn";
		
	    assertEqual(maxLength.maxLength(str),6);
	}
	
	public static void testMaxLength_4(){
		MaxLength maxLength = new MaxLength();
		
		String str = "";
		
	    assertEqual(maxLength.maxLength(str),0);
	}
	
	public static void testMaxLength_5(){
		MaxLength maxLength = new MaxLength();
		
		String str = "aaaaaabbbbbbbbbbcccdd";
		
	    assertEqual(maxLength.maxLength(str),10);
	}

}
