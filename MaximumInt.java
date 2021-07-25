package com.javagenrics;

public class MaximumInt {
			int x;
			int y;
			int z;
			int max;
			public int maximum(int x,int y, int z) {
			max = x;
			if(y>max) {
				max = y;
			}
			if(z>max) {
				max=z;
			}
			printMax(x,y,z,max);
			return max;
		}
		
		public static void printMax(int x, int y, int z, int max) {
			System.out.println("Maximum number between "+x+" "+y+" "+z+" = "+max);
		}

		public static void main(String[] args) {
			MaximumInt maxInt = new MaximumInt();
			maxInt.maximum(15, 49, 6);
		}


}
