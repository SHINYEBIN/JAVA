package controller;

import model.exception.CoffeeException;
import model.vo.Coffee;

public class CoffeeManager {
	private Coffee[] orderArr;
	private int count; //default 0
	
	public CoffeeManager() {
		// 커피 주문을 5개 받는 객체 배열
		orderArr=new Coffee[5];
		
	}
	
	// 커피 주문 정보 등록하기
	public Coffee insertCoffee(Coffee coffee) {
		// 현재 주문된 커피의 주문번호 등록하기
		coffee.setOrderNo(count+1); //
		
		// 주문 리스트에 현재 주문을 추가하기
		orderArr[count++]=coffee; //넣고 난 후 증가하기(후위연산자이기 때문에)
		
		return coffee;
	}
	
	public Coffee verifyCoffee(int orderNo) throws CoffeeException {
		if(orderNo > count ) {
			throw new CoffeeException("잘못된 주문 정보입니다.");
		}
		return orderArr[orderNo-1];
	}
	
	public void updateCoffee(int orderNo,Coffee coffee) {
		orderArr[orderNo-1]=coffee;
		coffee.setOrderNo(orderNo);
	}
	
	public void deleteCoffee(int idx) {
		orderArr[idx]=null;
		
		for(int i=idx;i<count;i++) { //idx는 실제 인덱스값
			if(i == count-1)
				break;
			if(count <= orderArr.length && orderArr[i+1] !=null) { //(총 배열의 크기보다 적고 배열 옆의 값이 null이 아니면)
				orderArr[i]=orderArr[i+1];
				orderArr[i].setOrderNo(i+1);
				orderArr[i+1]=null;
				
			}
		}
		
		count--;
		
	}
	
	public Coffee[] getOrderArr() {
		return orderArr;
	}
	
	/*
	public void close() {
		// 
	}
	 */
	
}
