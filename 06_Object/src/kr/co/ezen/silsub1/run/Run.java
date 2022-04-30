package kr.co.ezen.silsub1.run;

import kr.co.ezen.silsub1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member mem=new Member();
		
		mem.setMemberId("user01");
		mem.setMemberPwd("pass01");
		mem.setMemberName("ȫ�浿");
		mem.setAge(19);
		mem.setGender('M');
		mem.setPhone("010-1111-2222");
		mem.setEmail("user01@gmail.com");
		
		System.out.println(mem.getMemberId());
		System.out.println(mem.getMemberPwd());
		System.out.println(mem.getMemberName());
		System.out.println(mem.getAge());
		System.out.println(mem.getGender());
		System.out.println(mem.getPhone());
		System.out.println(mem.getEmail());
		
		

	}

}
