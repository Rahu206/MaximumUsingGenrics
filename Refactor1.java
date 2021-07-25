package com.javagenrics;

public class Refactor1 <T extends Comparable<T>> {
	
		T x,y,z;
		
		public Refactor1(T x, T y, T z) {
			super();
			this.x = x;
			this.y = y;
			this.z = z;
		}
		
		public T maximum() {
			return Refactor1.maximum(x, y, z);
		}
		
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

		public static String testMaximum(String x, String y, String z) {
			String max = x;
			if(y.compareTo(max)>0) {
				max = y;
			}
			if(y.compareTo(max)>0) {
				max=z;
			}
			printMax(x,y,z,max);
			return max;
		}
		
		public static <T> void printMax(T x, T y, T z, T max) {
			System.out.println("Max of these "+x+" "+y+" "+z+" is "+max);
		}
		
		public static void main(String[] args) {
			Integer xi=15, yi=49, zi=6;
			Float xf=48.9f, yf=77.8f ,zf=36.4f;
			String xs="Apple", ys="Peach", zs="Banana";
			
			Refactor1 reFactor = new Refactor1(xi, yi, zi);
			reFactor.maximum();
			
			Refactor1 reFactor1 = new Refactor1(xf, yf, zf);
			reFactor1.maximum();
			
			Refactor1 reFactor2 = new Refactor1(xs, ys, zs);
			reFactor2.maximum();
		}

	}
	
	
	
	
	
	
	
