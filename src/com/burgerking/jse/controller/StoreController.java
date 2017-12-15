package com.burgerking.jse.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import com.burgerking.jse.constants_pool.Value;
import com.burgerking.jse.service.StoreService;
import com.burgerking.jse.serviceImpl.StoreServiceImpl;

public class StoreController {
	public static void main(String[] args) {
		StoreService service = new StoreServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog(Value.MENU)) {
			case "0" :
				return;
			case "1" :
				String[] dummy = {
					"햄버거/5500",
					"콜라/1000",
					"감자칩/1000",
					"커피/900"
				};
				service.doEat(dummy);
				break;
			case "2" :
			String a =	JOptionPane.showInputDialog("햄버거, 콜라, 감자칩, 커피, 완료 중에서 상품명/수량으로 주문바람");
		//	System.out.println("주문내용"+a);	
		//	String b = service.order(a);
			JOptionPane.showMessageDialog(null,service.order(a));
				break;
			case "3" :
				JOptionPane.showMessageDialog(null, new SimpleDateFormat(
						"yyyy-MM-dd-hh-mm").format(new Date()));
				break;
			}
		}
	}
}
