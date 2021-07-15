package com.javagenrics;
 
public class FloatNumbers {
	float xf,yf,zf,maxf;
		
	public float maximum1(float xf,float yf,float zf) {
		maxf = xf;
		if(yf>maxf) {
			maxf = yf;
		}
		if(zf>maxf) {
			maxf=zf;
		}
		printMax1(xf,yf,zf,maxf);
		return maxf;
	}
	
	
	public static void printMax1(float xf,float yf,float zf, float maxf) {
		System.out.println("Max of "+xf+" "+yf+" "+zf+"  is "+maxf);
	}

	public static void main(String[] args) {
		
		FloatNumbers maxfloat = new FloatNumbers();
		maxfloat.maximum1(48.9f, 77.58f, 36.4f);
	}

}
	
