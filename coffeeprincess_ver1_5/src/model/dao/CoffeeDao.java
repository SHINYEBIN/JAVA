package model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.vo.Coffee;

//DAO(Data Access Object): 데이터를 가지고 처리하는 것을 DAO라고 한다. 그거를 MVC패턴에서는 데이터 관련 처리하는 걸 model이라고 분류를 하고 실제 데이터를 입출력하는 클래스들을 DAO클래스라고 한다.
// 클래스 이름 옆에 DAO를 붙이면 데이터의 입출력을 하는 클래스다.
// 데이터를 주고받기 위한 중간다리 역할.(클래스 자체가 값이 아니다)
public class CoffeeDao {
	
	public ArrayList<Coffee> openList() { //반환타입 메서드명  //반환하는 역할을 해주는 게 openList
		ArrayList<Coffee> list=new ArrayList<Coffee>();
		
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("coffee.dat"))){
			
			while(in.available() !=-1) {
				list.add((Coffee)in.readObject());  //파일을 가져와서 list에 저장
			}
		}catch(EOFException e) {
			System.out.println("불러오기에 성공하였습니다");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		return list;
	}
	
	public int saveList(ArrayList<Coffee> list) {
		int result=-1;
		
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("coffee.dat"))) {  // 파일의 입출력하는 클래스       파일을 입출력할때는 2진수를 이용한다.(변환해주지만 우리눈에는 보이지 않는다)
   			for(Coffee co:list) {
				out.writeObject(co); //writeObject 메서드 이용
			}
			result=1;
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		return result;
	}
	
	public void outStream(ObjectOutputStream out,Coffee co) {
		
		try {
			out.writeObject(co); // 출력
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

// coffeeDao
