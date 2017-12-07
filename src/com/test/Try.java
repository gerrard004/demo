package com.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.function.BiFunction;

public class Try {
	public static void main(String...args) throws FileNotFoundException, IOException {
		Map<String,String> env = System.getenv();
		for(String key : env.keySet()){
			System.out.println(key+"=="+env.get(key));
		}
		Properties properties = System.getProperties();
		for(Object key : properties.keySet()){
			System.out.println(key+"###"+properties.get(key));
		}
//		System.out.println(System.nanoTime());
//		System.out.println(System.nanoTime());
//		System.out.println(System.currentTimeMillis());
//		Runtime rt = Runtime.getRuntime();
//		System.out.println(rt.availableProcessors());
//		System.out.println(rt.freeMemory()/1024/1024);
//		System.out.println(rt.totalMemory()/1024/1024);
//		System.out.println(0.05+0.01);
		BigDecimal b1 = BigDecimal.valueOf(0.01);
		BigDecimal b2 = BigDecimal.valueOf(0.02);
		System.out.println(b1.add(b2));
		System.out.println('\u0007');
		Collection<String> t = new ArrayList<String>();
		t.add("dddd");
		t.add("tttt");
		t.forEach(obj -> System.out.println(obj));
		
		String [] org1 = {"一","二","三","四","五","六","七","八","九"}; 
		String [] org2 = {"一","二","三","四","五","六","七","八","九"};
		for(int i = 0;i<org1.length;i++){
			for(int j = 0;j<org2.length;j++){
				System.out.print(org1[i]+org2[j]+" ");
			}
			System.out.println();
		}
	}
}	
