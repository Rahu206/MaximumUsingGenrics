package com.javagenrics;

import java.util.ArrayList;
import java.util.Collections;

public class Maximum {
	/**
	 * @param element 1
	 * @param element 2
	 * @param element 3
	 * @return Maximum of 3 of any Type
	 */
	public  <E extends Comparable<E>> E maxOfAnything(E element1 ,E element2 , E element3, E element4) {
		E max=element1;
		if(element2.compareTo(max)>0)
			max=element2;
		if(element3.compareTo(max)>0)
			max=element3;
		if(element4.compareTo(max)>0)
			max=element4;
		return max;	
	}
	
	/**
	 * UC4 : Taking more then 3 arguments n sorting them
	 * @param <H>
	 * @param arrayList
	 */
	public <H extends Comparable<H>> void maxInArrayList (ArrayList<H> arrayList) {
		Collections.sort(arrayList);
		for(H temp:arrayList)
			System.out.println(temp);
	}


	public static void main(String[] args) {
		Maximum m = new Maximum();
		System.out.println(m.maxOfAnything(20.55,55.8,8.8,55.44));
		System.out.println(m.maxOfAnything(200,55,8,45));
		System.out.println(m.maxOfAnything("A","B","C","H"));
		
		MyGenericClass<Integer> myclass = new MyGenericClass<>(1,2,3,4);
		Integer trial1 = myclass.maxOfAnything(myclass.getVariable1(), myclass.getVariable2(), myclass.getVariable3(),myclass.getVariale4());
		System.out.println(trial1);
		
		MyGenericClass<String> myclass1 = new MyGenericClass<>("Apple","Banana","Peru","Grapes");
		String trial2 = myclass1.maxOfAnything(myclass1.getVariable1(), myclass1.getVariable2(), myclass1.getVariable3(),myclass1.getVariale4());
		System.out.println(trial2);
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(4);arrayList.add(8);arrayList.add(25);arrayList.add(1);
		m.maxInArrayList(arrayList);
		
		
	}


}
