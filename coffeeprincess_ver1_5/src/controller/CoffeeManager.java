package controller;

import java.util.ArrayList;

import model.dao.CoffeeDao;
import model.exception.CoffeeException;
import model.vo.Coffee;

public class CoffeeManager {
	private Coffee[] orderArr;
	//private int count; //default 0
	
	private ArrayList<Coffee> orderList; //array배열에 coffee 타입 들어감.
	private CoffeeDao coDao;
	
	public CoffeeManager() {
		// 커피 주문을 5개 받는 객체 배열
		orderArr=new Coffee[5];
		//orderList=new ArrayList<Coffee>();
		coDao=new CoffeeDao();
		orderList=coDao.openList(); // 반환하는 타입이 ArrayList<Coffee> 타입이니까 orderList=new ArrayList<Coffee>();처럼 직접 안하고 coDao.openList(); 이용
		
	}
	
	// 커피 주문 정보 등록하기
	public Coffee insertCoffee(Coffee coffee) {
		// 현재 주문된 커피의 주문번호 등록하기
		//coffee.setOrderNo(count+1); 
		
		// 주문 리스트에 현재 주문을 추가하기
		//orderArr[count++]=coffee; //넣고 난 후 증가하기(후위연산자이기 때문에)
		
		coffee.setOrderNo(orderList.size()+1); // 가져온 데이터가 얼마만하냐!
		orderList.add(coffee);
		
		return coffee;  // 커피를 리턴해라
	}
	
	public Coffee verifyCoffee(int orderNo) throws CoffeeException {
		/*
		if(orderNo > count ) {
			throw new CoffeeException("잘못된 주문 정보입니다.");
		}
		return orderArr[orderNo-1];
		*/
		
		if(orderNo > orderList.size()) {
			throw new CoffeeException("잘못된 주문 정보입니다.");
		}
		
		return orderList.get(orderNo-1);
	}
	
	public void updateCoffee(int orderNo,Coffee coffee) {
		//orderArr[orderNo-1]=coffee;
		coffee.setOrderNo(orderNo);
		orderList.set(orderNo-1, coffee);
	}
	
	public void deleteCoffee(int idx) {
		//orderArr[idx]=null;
		orderList.remove(idx); // array배열의 특징: 삽입하거나 삭제시 옆 객제가 자동으로 이동한다!
		
		if(idx !=orderList.size()) {  // 이동한 객체들 번호바꿔주는 거.
			for(int i=idx;i<orderList.size();i++) {
				orderList.get(i).setOrderNo(i+1);;  // 만약 3번이 삭제되고 4번이 들어오게 되면 4번을 3번으로 바꿔줘야한다...???!?!? setOrderNo(i)가 2번이니까 +1해줘야한다?!??
			}
		}
		
		/*
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
		*/
	}
	
	public ArrayList<Coffee> getOrderList() {
		return orderList;  // orderList를 반환하면 된다.
	}
	
	public void setOrderList(ArrayList<Coffee> orderList) {
		this.orderList=orderList;
	}
	
	/*
	public Coffee[] getOrderArr() {
		return orderArr;
	}
	*/
	
	public void close() { // 전체적인 내용이 마무리가 되면 여기서 마무리를 한다. 
		coDao.saveList(orderList); // 여기 orderList 객체를 저장하는 거다.
	}
	 
	
}
