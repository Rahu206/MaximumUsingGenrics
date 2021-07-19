package com.javagenrics;

public class Refactor2 {
		
		public static <T extends Comparable<T>> T maximum(T x,T y,T z) {
			
			T max = x;
			if(y.compareTo(max)>0) {
				max = y;
			}
			if(z.compareTo(max)>0) {
				max=z;
			}
			printMax(x,y,z,max);
			return max;
		}

		public static <T> void printMax(T x, T y, T z, T max) {
			System.out.println("Max of these "+x+" "+y+" "+z+" is "+max);
		}
		
		@SuppressWarnings("static-access")
		public static void main(String[] args) {
			Refactor2 refactor = new Refactor2();
			refactor.maximum(34,58,69);
			
			Refactor2 refactor1 = new Refactor2();
			refactor1.maximum(48.9,57.2,69.3);
			
			Refactor2 refactor2 = new Refactor2();
			refactor2.maximum("Apple","Banana","Peach");
		}

	}