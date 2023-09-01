package com.test03;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TestMain03 {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		List<Double> list = new ArrayList<Double>();
		
		double sum = 0;
		int cnt = st.countTokens();
		while(st.hasMoreTokens()) {
			sum += Double.parseDouble(st.nextToken());
		}
		
		double average =  sum / cnt;
		
		System.out.println(String.format("합 계: %.3f", sum));
		System.out.println(String.format("평 균: %.3f", average));
		
	}
}
