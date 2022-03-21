package com.ten;

import java.util.Arrays;

public class Test {
	
	 public static void main(String[] args) {
		   
	        String s1 = abc;
	        System.out.println(First String+ s1);
	        String s2 = def;
	        System.out.println(Second String+ s2);
	        String results = dabecf;
	        System.out.println(Suffled String+ results);
	    
	        validShuffle(s1, s2, results);

	    }

	    private static void validShuffle(String s1, String s2, String result) {
	        
	        String s3 = s1 + s2;
	        StringBuffer s = new StringBuffer(s3);

	        boolean flag = false;

	        char[] ch = result.toCharArray();

	        if (s.length() != result.length()) {
	            flag = false;
	        } else {

	            for (int i = 0; i  ch.length; i++) {
	                
	                String temp = Character.toString(ch[i]);

	                if (s3.contains(temp)) {

	                    s = s.deleteCharAt(s.indexOf(temp));
	                    s3 = new String(s);
	                    flag = true;
	                    
	                } else {
	                    flag = false;
	                    break;
	                }

	            }

	        }

	        if (flag) {
	            System.out.println(Yes...  + result + is a valid shuffle of + s1 +  and  + s2 +  string  );
	        } else {
	            System.out.println(No...  + result + is a valid shuffle of + s1 +  and  + s2 +  string );
	        }

	    }

	}
