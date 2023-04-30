package com.enum_pro;

import java.util.Arrays;

public class AccesEnum {
	public static void main(String[] args) {
		
		Constant[] values = Constant.values();
		
		for(Constant c:values) {
			System.out.println(c+" "+c.ordinal());
		}
	}
}
