package com.yuanzijian.itcast.libarary.main;

import java.util.Scanner;

import com.yuanzijian.itcast.libarary.dao.UserDao;

public class LibararyMain {
	
	public static void main(String[] args) {
		System.out.println("****************************************");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*    1208java������ͼ���                                           *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("****************************************");
		Scanner  scanner = new Scanner(System.in);
		UserDao userDao = new UserDao();

		while(true){
			System.out.println("��ѡ���ܣ�A(�û���½)    B(ע���û�)      Q(�˳�ϵͳ)");
			String option = scanner.next();
			
			if("a".equalsIgnoreCase(option)){
				
				
			}else if("b".equalsIgnoreCase(option)){
				//ע��
				userDao.reg();
				
			}else if("Q".equalsIgnoreCase(option)){
				System.exit(0);
			}else{
				System.out.println("���������������������...");
				
			}
		
		}
		
		
	}

}
