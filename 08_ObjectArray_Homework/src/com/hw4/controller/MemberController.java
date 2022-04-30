package com.hw4.controller;

import com.hw4.model.vo.Member;

public class MemberController {
	public static final int SIZE=10;  // ������ �� 10
	private int memberCount;
	private Member[] mem=new Member[SIZE];
	
	{
		mem[0]=new Member("user01","pass01","������",20,'M',"kim23@naver.com");
		mem[1]=new Member("user02","pass02","�̼���",60,'M',"lee2@naver.com");
		mem[2]=new Member("user03","pass03","������",17,'F',"yoo55@hanmail.net");
		mem[3]=new Member("user04","pass04","�����ҹ�",57,'M',"yeon1@gamil.com");
		mem[4]=new Member("user05","pass05","�Ż��Ӵ�",45,'F',"shin89@naver.com");
		
		memberCount=5;
	}
	
	public int getMemberCount() { 
		return this.memberCount;
	}
	
	public Member[] getMem() {
		return this.mem;
	}
	
	public Member checkId(String userId) { // ��ȯ�ϴ� type�� member Ÿ���̴�
		Member m=null; // ������ ��ü�� ��������� m�� ������ �Ϸ��� �غ� �� ����. null�̶�� �ϴ� ���� m�̶�� ������ ���� �ּҰ��� �ȵ��ֱ� ������ null�̶�� �ɷ� �ʱ�ȭ�� ���ִ� ����.
					   // 
		for(int i=0;i<memberCount;i++) {
			if(mem[i].getUserId().equals(userId)) { 
				m=mem[i];  
			}
		}
		return m; //member�� �ǹ��Ѵ� member ��ü�� ��ȯ�Ѵ�..?  
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
		memberCount--;  // ������ �ϳ��� ���ܼ� �������� ������� �Ǵϱ� �����ִ°ǰ�???
	}
	
	public Member[] sortIdAsc() {
		Member[] copy=new Member[memberCount]; // copy��� �迭�� ����ڴٰ� ������ ���� ��¥ ����� �� �ƴ�.
		System.arraycopy(mem, 0, copy, 0, memberCount);  //�̰� �����Ѱ���!
		
		for(int i=0; i<copy.length;i++) {
			for(int j=0; j<i; j++) { // ���� i�� 10�̸� j�� 9����. j�� i������ �ϳ� �۾ƾ� ��.(�񱳸� �ϱ� ����)
				if(copy[i].getUserId().compareTo(copy[j].getUserId()) <0) {// ���ʰ� �������� ���ؼ� ������ ���� �� ũ�� -�� ��Ÿ����. //���ڴ� ���ڷ� ó���Ǳ� ������ �ƽ�Ű�ڵ�
					Member temp=copy[j];    //�������� ũ�⸦ ���� �ִ� ��: ���� ���?�����Լ�?
					copy[j]=copy[i];
					copy[i]=temp;
				}
			}
		}
		
		return copy;
	}
	
	
	public Member[] sortIdDesc() {
		Member[] copy=new Member[memberCount]; // copy��� �迭�� ����ڴٰ� ������ ���� ��¥ ����� �� �ƴ�.
		System.arraycopy(mem, 0, copy, 0, memberCount);  //�̰� �����Ѱ���!
		
		for(int i=0; i<copy.length;i++) {
			for(int j=0; j<i; j++) { // ���� i�� 10�̸� j�� 9����. j�� i������ �ϳ� �۾ƾ� ��.(�񱳸� �ϱ� ����)
				if(copy[i].getUserId().compareTo(copy[j].getUserId()) >0) {// ���ʰ� �������� ���ؼ� ������ ���� �� ũ�� -(����)�� ��Ÿ����, �����ʰ��� �� ������ +(���)�� ��Ÿ����. //���ڴ� ���ڷ� ó���Ǳ� ������ �ƽ�Ű�ڵ�
					Member temp=copy[j];    //�������� ũ�⸦ ���� �ִ� ��: ���� ���?�����Լ�?
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
