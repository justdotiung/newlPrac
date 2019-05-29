package com.pro.test.integerException;

public class IntegerEx {
	
	public static boolean isNumber(String str) {
		try {
			Double.parseDouble(str);
		}catch (Exception e) {
			return false;
		}
		return true;
	}
}
