package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("���� : ");
		char gender = sc.next().charAt(0);
		lc.insertMember(new Member(name, age, gender));
		while (true) {
			System.out.println();
			System.out.println("==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
			int cho = sc.nextInt();
			switch (cho) {
				case 1: lc.myinfo(); break;
				case 2: selectAll(); break;
				case 3: searchBook(); break;
				case 4: rentBook(); break;
				case 9: System.out.println("���α׷��� �����մϴ�."); return;
			}
		}
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		for (int i=0 ; i<bList.length ; i++) {
			System.out.println(i+"�� ���� : "+bList[i].toString());
		}
	}
	
	public void searchBook() {
		System.out.print("�˻��� ���� Ű���� : ");
		sc.nextLine();
		String keyword = sc.nextLine();
		Book[] searchList = lc.searchBook(keyword);
		for(int i=0 ; i<searchList.length ; i++) {
			if (searchList[i]!=null) {
				System.out.println(searchList[i].toString());
			}
		}
	}
	
	public void rentBook() {
		selectAll();
		System.out.print("�뿩�� ���� ��ȣ ���� : ");
		int cho = sc.nextInt();
		int result = lc.rentBook(cho);
		switch (result) {
			case 0: System.out.println("���������� �뿩�Ǿ����ϴ�."); break;
			case 1: System.out.println("���� �������� �뿩 �Ұ����Դϴ�."); break;
			case 2: System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���.");
		}
	}

}
