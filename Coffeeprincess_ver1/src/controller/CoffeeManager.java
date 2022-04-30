package controller;

import model.exception.CoffeeException;
import model.vo.Coffee;

public class CoffeeManager {
	private Coffee[] orderArr;
	private int count; //default 0
	
	public CoffeeManager() {
		// Ŀ�� �ֹ��� 5�� �޴� ��ü �迭
		orderArr=new Coffee[5];
		
	}
	
	// Ŀ�� �ֹ� ���� ����ϱ�
	public Coffee insertCoffee(Coffee coffee) {
		// ���� �ֹ��� Ŀ���� �ֹ���ȣ ����ϱ�
		coffee.setOrderNo(count+1); //
		
		// �ֹ� ����Ʈ�� ���� �ֹ��� �߰��ϱ�
		orderArr[count++]=coffee; //�ְ� �� �� �����ϱ�(�����������̱� ������)
		
		return coffee;
	}
	
	public Coffee verifyCoffee(int orderNo) throws CoffeeException {
		if(orderNo > count ) {
			throw new CoffeeException("�߸��� �ֹ� �����Դϴ�.");
		}
		return orderArr[orderNo-1];
	}
	
	public void updateCoffee(int orderNo,Coffee coffee) {
		orderArr[orderNo-1]=coffee;
		coffee.setOrderNo(orderNo);
	}
	
	public void deleteCoffee(int idx) {
		orderArr[idx]=null;
		
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
