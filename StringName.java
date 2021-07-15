package com.javagenrics;

public class StringName {
	
	
	public String maximum2(String xs, String ys, String zs) {
		String maxs = xs;
		if(ys.compareTo(maxs)>0) {
			maxs = ys;
		}
		if(ys.compareTo(maxs)>0) {
			maxs=zs;
		}
		printMax2(xs,ys,zs,maxs);
		return maxs;
	}
	

	public static void printMax2(String xs, String ys, String zs, String maxs) {
		System.out.println("Max between "+xs+" ,"+ys+", "+zs+" string is "+maxs);
	}
	
	public static void main(String[] args) {
		
		StringName stringMax = new StringName();
		stringMax.maximum2("Apple","Peach","Banana");
	}

}

