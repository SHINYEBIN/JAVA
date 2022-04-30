package controller;

import java.util.ArrayList;

import model.dao.CoffeeDao;
import model.exception.CoffeeException;
import model.vo.Coffee;

public class CoffeeManager {
	private Coffee[] orderArr;
	//private int count; //default 0
	
	private ArrayList<Coffee> orderList; //array�迭�� coffee Ÿ�� ��.
	private CoffeeDao coDao;
	
	public CoffeeManager() {
		// Ŀ�� �ֹ��� 5�� �޴� ��ü �迭
		orderArr=new Coffee[5];
		//orderList=new ArrayList<Coffee>();
		coDao=new CoffeeDao();
		orderList=coDao.openList(); // ��ȯ�ϴ� Ÿ���� ArrayList<Coffee> Ÿ���̴ϱ� orderList=new ArrayList<Coffee>();ó�� ���� ���ϰ� coDao.openList(); �̿�
		
	}
	
	// Ŀ�� �ֹ� ���� ����ϱ�
	public Coffee insertCoffee(Coffee coffee) {
		// ���� �ֹ��� Ŀ���� �ֹ���ȣ ����ϱ�
		//coffee.setOrderNo(count+1); 
		
		// �ֹ� ����Ʈ�� ���� �ֹ��� �߰��ϱ�
		//orderArr[count++]=coffee; //�ְ� �� �� �����ϱ�(�����������̱� ������)
		
		coffee.setOrderNo(orderList.size()+1); // ������ �����Ͱ� �󸶸��ϳ�!
		orderList.add(coffee);
		
		return coffee;  // Ŀ�Ǹ� �����ض�
	}
	
	public Coffee verifyCoffee(int orderNo) throws CoffeeException {
		/*
		if(orderNo > count ) {
			throw new CoffeeException("�߸��� �ֹ� �����Դϴ�.");
		}
		return orderArr[orderNo-1];
		*/
		
		if(orderNo > orderList.size()) {
			throw new CoffeeException("�߸��� �ֹ� �����Դϴ�.");
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
		orderList.remove(idx); // array�迭�� Ư¡: �����ϰų� ������ �� ������ �ڵ����� �̵��Ѵ�!
		
		if(idx !=orderList.size()) {  // �̵��� ��ü�� ��ȣ�ٲ��ִ� ��.
			for(int i=idx;i<orderList.size();i++) {
				orderList.get(i).setOrderNo(i+1);;  // ���� 3���� �����ǰ� 4���� ������ �Ǹ� 4���� 3������ �ٲ�����Ѵ�...???!?!? setOrderNo(i)�� 2���̴ϱ� +1������Ѵ�?!??
			}
		}
		
		/*
		for(int i=idx;i<count;i++) { //idx�� ���� �ε�����
			if(i == count-1)
				break;
			if(count <= orderArr.length && orderArr[i+1] !=null) { //(�� �迭�� ũ�⺸�� ���� �迭 ���� ���� null�� �ƴϸ�)
				orderArr[i]=orderArr[i+1];
				orderArr[i].setOrderNo(i+1);
				orderArr[i+1]=null;
				
			}
		}
		
		count--;
		*/
	}
	
	public ArrayList<Coffee> getOrderList() {
		return orderList;  // orderList�� ��ȯ�ϸ� �ȴ�.
	}
	
	public void setOrderList(ArrayList<Coffee> orderList) {
		this.orderList=orderList;
	}
	
	/*
	public Coffee[] getOrderArr() {
		return orderArr;
	}
	*/
	
	public void close() { // ��ü���� ������ �������� �Ǹ� ���⼭ �������� �Ѵ�. 
		coDao.saveList(orderList); // ���� orderList ��ü�� �����ϴ� �Ŵ�.
	}
	 
	
}
