package com.test06.biz;

import com.test06.entity.Coffee;
import com.test06.entity.Coke;
import com.test06.entity.Drink;
import com.test06.entity.Juice;

public class VendingMachineBiz implements IVendingMachineBiz {
	private int balance = 1000;					// 현재 잔액
	private Drink[] cartList = new Drink[3];	// 구입목록 배열
	private int count = 0;						// 배열 갯수
	
	@Override
	public void cartDrink(Drink drink) {
		
		if(drink.getPrice() > balance) {
			System.out.println("잔액이 부족하여 " + drink + " 구매 불가능합니다.");
		} else {
			// 배열 크기 작을 경우
			if(count == cartList.length) {
				System.out.println("배열 확장");
				Drink[] newDrinkList = new Drink[cartList.length * 3];
				System.arraycopy(cartList, 0, newDrinkList, 0, cartList.length);
				cartList = newDrinkList;
			}
			
			if (drink instanceof Juice) {
				cartList[count] = new Juice();
			} else if (drink instanceof Coffee) {
				cartList[count] = new Coffee();
			} else { // Coke
				cartList[count] = new Coke();
			}
			
			// 잔액 - 드링크 가격
			balance -= drink.getPrice();
			
			System.out.println(drink + "를 구입했습니다. 현재 잔액: " + balance + " 원");
			
			count++;
		}
		
	}
	
	@Override
	public void printCart() {
		int jcNum = 0;
		int cfNum = 0;
		int ckNum = 0;
		
		// 음료수 갯수 계산
		for (int i = 0; i < count; i++) {

			if (cartList[i] instanceof Juice) {
				jcNum++;
			} else if (cartList[i] instanceof Coffee) {
				cfNum++;
			} else { // Coke
				ckNum++;
			}
		}
		
		System.out.println("=====음료수 구입 목록=====");
		System.out.println("쥬스 : " + jcNum + "개");
		System.out.println("커피 : " + cfNum + "개");
		System.out.println("코크 : " + ckNum + "개");
		System.out.println("============================");
		System.out.println("사용 금액: " + (1000 - balance) + " 원");
		System.out.println("남은 금액: " + balance + " 원");
	}
	
	@Override
	public void printDrinkList(Drink[] drinkList) {
		System.out.println("===============");
		System.out.println("음료수명 가격");
		System.out.println("===============");
		
		System.out.println("커피        " + drinkList[0].getPrice() + "원");
		System.out.println("코크         " + drinkList[1].getPrice() + "원");
		System.out.println("주스        " + drinkList[2].getPrice() + "원");
		System.out.println("---------------");
		
		System.out.println("현재 잔액: " + balance + " 원");
	}
}
