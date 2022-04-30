package com.hw4.controller;

import com.hw4.model.vo.Member;

public class MemberController {
	public static final int SIZE=10;  // 고정된 값 10
	private int memberCount;
	private Member[] mem=new Member[SIZE];
	
	{
		mem[0]=new Member("user01","pass01","김유신",20,'M',"kim23@naver.com");
		mem[1]=new Member("user02","pass02","이순신",60,'M',"lee2@naver.com");
		mem[2]=new Member("user03","pass03","유관순",17,'F',"yoo55@hanmail.net");
		mem[3]=new Member("user04","pass04","연개소문",57,'M',"yeon1@gamil.com");
		mem[4]=new Member("user05","pass05","신사임당",45,'F',"shin89@naver.com");
		
		memberCount=5;
	}
	
	public int getMemberCount() { 
		return this.memberCount;
	}
	
	public Member[] getMem() {
		return this.mem;
	}
	
	public Member checkId(String userId) { // 반환하는 type은 member 타입이다
		Member m=null; // 멤버라는 객체가 만들어지면 m에 대입을 하려고 준비를 한 거임. null이라고 하는 것은 m이라는 변수에 아직 주소값이 안들어가있기 때문에 null이라는 걸로 초기화를 해주는 거임.
					   // 
		for(int i=0;i<memberCount;i++) {
			if(mem[i].getUserId().equals(userId)) { 
				m=mem[i];  
			}
		}
		return m; //member를 의미한다 member 객체를 반환한다..?  
	}
	
	public void insertMember(Member m) {
		mem[memberCount]=m;
		memberCount++;
	}
	
	public Member searchMember(int menu,String search) {
		Member searchMember=null;
		
		for(int i=0;i<memberCount;i++) {
			if(menu==1) {
				if(mem[i].getUserId().equals(search))
					searchMember=mem[i];
			}else if(menu==2) {
				if(mem[i].getName().equals(search))
					searchMember=mem[i];
			}else {
				if(mem[i].getEmail().equals(search))
					searchMember=mem[i];
			}
		}
		return searchMember;
	}
	
	public void updateMember(Member m,int menu,String update) {
		if(menu==1) {
			m.setUserPwd(update);
		}else if(menu==2) {
			m.setName(update);
		}else {
			m.setEmail(update);
		}
	
	}
	
	public void deleteMember(String userId) {
		for(int i=0; i<memberCount;i++) {
			if(mem[i].getUserId().equals(userId)) {
				for(int j=i; j<memberCount;j++) {
					mem[j]=mem[j+1];
				}
				break;
			}
		}
		memberCount--;  // 앞으로 하나씩 땡겨서 마지막은 빈공간이 되니까 없애주는건가???
	}
	
	public Member[] sortIdAsc() {
		Member[] copy=new Member[memberCount]; // copy라는 배열을 만들겠다고 선언한 거지 진짜 복사된 게 아님.
		System.arraycopy(mem, 0, copy, 0, memberCount);  //이게 복사한거임!
		
		for(int i=0; i<copy.length;i++) {
			for(int j=0; j<i; j++) { // 만약 i가 10이면 j가 9까지. j가 i값보다 하나 작아야 됨.(비교를 하기 위해)
				if(copy[i].getUserId().compareTo(copy[j].getUserId()) <0) {// 왼쪽과 오른쪽을 비교해서 오른쪽 값이 더 크면 -를 나타낸다. //문자는 숫자로 처리되기 때문에 아스키코드
					Member temp=copy[j];    //문자지만 크기를 갖고 있는 거: 문자 상수?문자함수?
					copy[j]=copy[i];
					copy[i]=temp;
				}
			}
		}
		
		return copy;
	}
	
	
	public Member[] sortIdDesc() {
		Member[] copy=new Member[memberCount]; // copy라는 배열을 만들겠다고 선언한 거지 진짜 복사된 게 아님.
		System.arraycopy(mem, 0, copy, 0, memberCount);  //이게 복사한거임!
		
		for(int i=0; i<copy.length;i++) {
			for(int j=0; j<i; j++) { // 만약 i가 10이면 j가 9까지. j가 i값보다 하나 작아야 됨.(비교를 하기 위해)
				if(copy[i].getUserId().compareTo(copy[j].getUserId()) >0) {// 왼쪽과 오른쪽을 비교해서 오른쪽 값이 더 크면 -(음수)를 나타내고, 오른쪽값이 더 작으면 +(양수)를 나타낸다. //문자는 숫자로 처리되기 때문에 아스키코드
					Member temp=copy[j];    //문자지만 크기를 갖고 있는 거: 문자 상수?문자함수?
					copy[j]=copy[i];
					copy[i]=temp;
				}
			}
		}
		
		return copy;
	}
	
	public Member[] sortAgeAsc() {
		Member[] copy=new Member[memberCount]; 
		System.arraycopy(mem, 0, copy, 0, memberCount); 
		
		for(int i=0; i<copy.length;i++) {
			for(int j=0; j<i; j++) {
				if(copy[i].getAge()-copy[j].getAge()<0) {
					Member temp=copy[j];
					copy[j]=copy[i];
					copy[i]=temp;
				}
			}
		}
		
		return copy;
		
	}
	
	public Member[] sortAgeDesc() {
		Member[] copy=new Member[memberCount]; 
		System.arraycopy(mem, 0, copy, 0, memberCount); 
		
		for(int i=0; i<copy.length;i++) {
			for(int j=0; j<i; j++) {
				if(copy[i].getAge()-copy[j].getAge()>0) {
					Member temp=copy[j];
					copy[j]=copy[i];
					copy[i]=temp;
				}
			}
		}
		
		return copy;
		
	}
	
	public Member[] sortGenderDesc() {
		Member[] copy=new Member[memberCount]; 
		System.arraycopy(mem, 0, copy, 0, memberCount); 
		
		for(int i=0; i<copy.length;i++) {
			for(int j=0; j<i; j++) {
				if(copy[i].getGender() =='M' && copy[j].getGender()=='F') {
					Member temp=copy[j];
					copy[j]=copy[i];
					copy[i]=temp;
				}
			}
		}
		
		return copy;
		
	}
}
