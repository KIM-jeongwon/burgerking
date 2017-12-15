package com.burgerking.jse.serviceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.burgerking.jse.service.StoreService;

public class StoreServiceImpl implements StoreService{
	private Map<String,String> menuMap;
	private Map<String,String> orderMap;
	
	public StoreServiceImpl() {
		menuMap = new HashMap<>();
		orderMap = new HashMap<>();
	}

	@Override
	public void doEat(String[] dummy) {
		for(String s : dummy) {
			String[] arr = s.split("/");
			menuMap.put(arr[0],arr[1]);
			System.out.println(menuMap.put(arr[0],arr[1]));
		}
	}

	@Override
	public String order(String a) {
		String[] b = a.split("/");
		
		for(int i =0;i<b.length;i++) {
				//b[i];
		}
		String item = b[0];
		String count = b[1];
		Set<String> keys = menuMap.keySet();
		String price = "";
		for(String key : keys) {
			if(item.equals(key)) {
				price =menuMap.get(key);
			}
			
			System.out.println("키값 : "+key);
		}
		int pay = Integer.parseInt(price) * Integer.parseInt(count);

		
		return ""+pay;
	}


}
