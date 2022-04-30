package kr.co.ezen.silsub1.model.vo;

public class Member {//여기에 한 정보가 들어있는 거임.
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() {
		
	}
	
	

	public synchronized String getMemberId() {
		return memberId;
	}

	public synchronized void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public synchronized String getMemberPwd() {
		return memberPwd;
	}

	public synchronized void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public synchronized String getMemberName() {
		return memberName;
	}

	public synchronized void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public synchronized int getAge() {
		return age;
	}

	public synchronized void setAge(int age) {
		this.age = age;
	}

	public synchronized char getGender() {
		return gender;
	}

	public synchronized void setGender(char gender) {
		this.gender = gender;
	}

	public synchronized String getPhone() {
		return phone;
	}

	public synchronized void setPhone(String phone) {
		this.phone = phone;
	}

	public synchronized String getEmail() {
		return email;
	}

	public synchronized void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
