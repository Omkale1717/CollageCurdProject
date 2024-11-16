package com.client;

import java.util.Scanner;

import com.service.ServiceDaoStudent;

public class Test {
	public static void main(String[] args) {
		ServiceDaoStudent sc = new ServiceDaoStudent();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter =1= For ---InserData---");
		System.out.println("Enter =2= For ---Update Data---");
		System.out.println("Enter =3= for ---deleteData---");
		System.out.println("Enter =4= For ---SelectData---");

		int choice = sc1.nextInt();

		switch (choice) {
		case 1:
			sc.insert();
			break;

		case 2:
			sc.update();
			break;

		case 3:
			sc.Delete();
			break;

		case 4:
			sc.select();
			break;

		default:
			System.out.println("invalid choice");

		}
	}

}
