package com.test06.biz;

import com.test06.entity.Drink;

public interface IVendingMachineBiz {
	public void cartDrink(Drink drink);
	
	public void printCart();
	
	public void printDrinkList(Drink[] drinkList);
}
