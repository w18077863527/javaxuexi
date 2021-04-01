package com.xx.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test1 {
	public static void main(String[] args) {
		
		Collection coll=new ArrayList();
		coll.add("这是一个集合");
		coll.add("hahaha");
		System.out.println(coll.size());
		System.out.println(coll.contains("这是"));
		
		Collection coll2=new ArrayList();
		coll2.addAll(coll);
		System.out.println(coll2.equals(coll));
		System.out.println(coll2.size());
		System.out.println(coll2.isEmpty());
		System.out.println(coll2.contains("这是一个集合"));
		Object a=coll2.toArray();
		//遍历
		Iterator b=coll2.iterator();
		while(b.hasNext()){
			Object obj=b.next();
			System.out.println(obj);
		}
		
		coll2.add("tom");
		for(Object f:coll2){
			System.out.println(f);
		}
	}
}
