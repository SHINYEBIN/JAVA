package model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.vo.Coffee;

//DAO(Data Access Object): �����͸� ������ ó���ϴ� ���� DAO��� �Ѵ�. �װŸ� MVC���Ͽ����� ������ ���� ó���ϴ� �� model�̶�� �з��� �ϰ� ���� �����͸� ������ϴ� Ŭ�������� DAOŬ������� �Ѵ�.
// Ŭ���� �̸� ���� DAO�� ���̸� �������� ������� �ϴ� Ŭ������.
// �����͸� �ְ�ޱ� ���� �߰��ٸ� ����.(Ŭ���� ��ü�� ���� �ƴϴ�)
public class CoffeeDao {
	
	public ArrayList<Coffee> openList() { //��ȯŸ�� �޼����  //��ȯ�ϴ� ������ ���ִ� �� openList
		ArrayList<Coffee> list=new ArrayList<Coffee>();
		
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("coffee.dat"))){
			
			while(in.available() !=-1) {
				list.add((Coffee)in.readObject());  //������ �����ͼ� list�� ����
			}
		}catch(EOFException e) {
			System.out.println("�ҷ����⿡ �����Ͽ����ϴ�");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		return list;
	}
	
	public int saveList(ArrayList<Coffee> list) {
		int result=-1;
		
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("coffee.dat"))) {  // ������ ������ϴ� Ŭ����       ������ ������Ҷ��� 2������ �̿��Ѵ�.(��ȯ�������� �츮������ ������ �ʴ´�)
   			for(Coffee co:list) {
				out.writeObject(co); //writeObject �޼��� �̿�
			}
			result=1;
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		return result;
	}
	
	public void outStream(ObjectOutputStream out,Coffee co) {
		
		try {
			out.writeObject(co); // ���
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

// coffeeDao
