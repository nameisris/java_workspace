package com.kosta.shop;

import com.kosta.dao.goodsDAO;
import com.kosta.dao.orderDAO;
import com.kosta.order.Order;
import com.kosta.product.Goods;

public class Shop {

	// 구현해야 하는 부분: ApplicationMain.java 오류 없이 작동하도록 필요한 모든 메서드를 구현한다.
	// 일전의 service 류의 메서드와 같은 내용 구현
	// DAO 구현
	
	// 기본 생성자
	public Shop() {
		
	}
	
	// 상품 추가
	public void addProduct(Goods goods) {
		System.out.println("[상품 추가]");
		System.out.println(goods);
		
		int cnt = goodsDAO.insertProduct(goods);
		
		if(cnt > 0) {
			System.out.println(cnt + "개의 상품 추가");
		}
	}
	
	// 주문 추가
	public void order(Order order) {
		System.out.println("[주문 추가]");
		System.out.println(order);
		
		int cnt = orderDAO.insertOrder(order);
		
		if(cnt > 0) {
			System.out.println(cnt + "개의 주문 추가");
		}
	}
	
	// 상품 정보 조회
	public Goods findProductByCode(String code) {
		System.out.println("[상품 정보 조회]");
		Goods goods = goodsDAO.selectProductByCode(code);
		
		return goods;
	}
	
	// 전체 상품 정보 출력
	public void printAllProductInfo() {
		System.out.println("[전체 상품 정보]");
		goodsDAO.selectAllProductInfo();
	}
	
	// 전체 주문 정보 출력
	public void printAllOrderInfo() {
		System.out.println("[전체 주문 정보]");
		orderDAO.selectAllOrderInfo();
	}

	// 주문 정보 조회
	public Order findOrderByNo(int orderNo) {
		Order order = orderDAO.selectOrderByNo(orderNo);
		
		return order;
	}
	
	// 주문 취소
	public Order cancelOrder(int orderNo) {
		Order order = orderDAO.updateOrder(orderNo);
		
		
		return order;
	}
	
	// 주문 내역
	public void printOrderDetailsByCustomerAndIsCanceled(String name, String cancel) {
		if(cancel.equals("정상")) {
			
		} else {
			
		}
	}
	
	
}
