package kr.co.ezen.chap01.part01.ObjectVsObjectArray.run;

import java.util.Scanner;

import kr.co.ezen.chap01.part01_ObjectVsObjectArray.model.vo.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		int[] arr=new int[3]; 
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	
		/*
		Book[] bk=new Book[3];
		
		bk[0]=new Book("�ڹ��� ����","ȫ�浿","����",10000);
		bk[1]=new Book("���� ����","���","��",20000);
		bk[2]=new Book("�౸�� ����","�̵���","���",30000); // ���1
		*/
		
		//���2
		Book[] bk= {//�迭���� ���ÿ� �ʱ�ȭ
				new Book("�ڹ��� ����","ȫ�浿","����",10000),  //��ü��� ���� �ּҰ��� ����ִ�. Book@7852e922
				new Book("���� ����","���","��",20000),
				new Book("�౸�� ����","�̵���","���",30000)
		};
		
		System.out.println(bk);
		System.out.println(bk[0]);  //Book@7852e922 �ּҰ��� ���´�.(��Ȯ�ϰ� �����ڸ� �ּҰ� �ƴ� �ؽ��ڵ尪..?)
		System.out.println(bk[0].getPrice());
		
		for(int i=0;i<bk.length;i++) {
			System.out.println(bk[i].information());
		}
		
		//���� �˻� ������
		Scanner sc=new Scanner(System.in);
		System.out.print("�˻��� å ����: ");
		String SearchTitle=sc.nextLine();
		
		for(int i=0;i<bk.length;i++) {
			if(bk[i].getTitle().equals(SearchTitle)) {
				System.out.println(bk[i].information());
			}
		}
		
	}

}
