package com.test01;

public class TestMain01 {

	public static void main(String[] args) {
		int[][] array = {
				{12, 41, 36, 56, 21},
				{82, 10, 12, 61, 45},
				{14, 16, 18, 78, 65},
				{45, 26, 72, 23, 34}
		};

		double sum = 0;
		
		for(int i = 0;i < array.length;i++) {
			for(int j = 0;j < array[i].length;j++) {
				sum += (double) array[i][j];
			}
		}
		
		double average = (double) sum / (array.length * array[0].length);
		
		System.out.println(String.format("합 계 : %.1f", sum));
		System.out.println(String.format("평 균 : %.2f", average));
	}

}
