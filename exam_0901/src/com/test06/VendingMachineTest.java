package com.test06;

import java.util.Scanner;

import com.test06.biz.VendingMachineBiz;
import com.test06.entity.Juice;
import com.test06.entity.Coffee;
import com.test06.entity.Coke;
import com.test06.entity.Drink;

public class VendingMachineTest {
	public static void main(String[] args) {
		printMenu();

	}

	private static void printMenu() {
		VendingMachineBiz vm = new VendingMachineBiz();
		
		boolean end = true;
		
		while(end) {
			Scanner sc = new Scanner(System.in);
			System.out.println("============================");
			System.out.println("[음료수 자판기 관리 시스템]");
			System.out.println("============================");
			System.out.println("1.전체 음료수 및 잔액 보기");
			System.out.println("2.쥬스 구입하기 ( 200원 )");
			System.out.println("3.커피 구입하기 ( 100원 )");
			System.out.println("4.코크 구입하기 ( 50원 )");
			System.out.println("5.구입한 음료수 목록 보기");
			System.out.println("9.종료");
			System.out.println("============================");
			System.out.print("메뉴 입력 => ");
			
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				Drink[] drinkList = new Drink[] {
						new Coffee(),
						new Coke(),
						new Juice()
				};
				vm.printDrinkList(drinkList);
				break;
			case 2:
				vm.cartDrink(new Juice());
				break;
			case 3:
				vm.cartDrink(new Coffee());
				break;
			case 4:
				vm.cartDrink(new Coke());
				break;
			case 5:
				vm.printCart();
				break;
			case 9:
				System.out.println("프로그램 종료");
				end = false;
				break;
			default:
				System.out.println("메뉴값을 확인 후 다시 입력하세요.");
			}
		}
	}
}
