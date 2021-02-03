package com.kh.practice.chap01_poly.model.vo;

public class Member {
	
	private String name;//ȸ����
	private int age;//ȸ�� ����
	private char gender;//����
	private int CouponCount=0;//�丮 �п� ���� ����
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getCouponCount() {
		return CouponCount;
	}

	public void setCouponCount(int couponCount) {
		CouponCount = couponCount;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", CouponCount=" + CouponCount + "]";
	}

}
