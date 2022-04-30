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
		
		bk[0]=new Book("자바의 정석","홍길동","나무",10000);
		bk[1]=new Book("룰의 정석","고수","숲",20000);
		bk[2]=new Book("축구의 정석","이동중","향기",30000); // 방법1
		*/
		
		//방법2
		Book[] bk= {//배열선언 동시에 초기화
				new Book("자바의 정석","홍길동","나무",10000),  //객체라는 것은 주소값이 들어있다. Book@7852e922
				new Book("룰의 정석","고수","숲",20000),
				new Book("축구의 정석","이동중","향기",30000)
		};
		
		System.out.println(bk);
		System.out.println(bk[0]);  //Book@7852e922 주소값이 나온다.(정확하게 말하자면 주소값 아닌 해시코드값..?)
		System.out.println(bk[0].getPrice());
		
		for(int i=0;i<bk.length;i++) {
			System.out.println(bk[i].information());
		}
		
		//도서 검색 만들어보기
		Scanner sc=new Scanner(System.in);
		System.out.print("검색할 책 제목: ");
		String SearchTitle=sc.nextLine();
		
		for(int i=0;i<bk.length;i++) {
			if(bk[i].getTitle().equals(SearchTitle)) {
				System.out.println(bk[i].information());
			}
		}
		
	}

}
