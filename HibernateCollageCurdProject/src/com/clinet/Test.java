package com.clinet;

import java.util.Scanner;

import com.MVCServices.SerivesCollage;


public class Test {
	public static void main(String[] args) {
		SerivesCollage cc=new SerivesCollage();
		 Scanner Sc=new Scanner (System.in);
		 System.out.println("Enter 1 Insert Data");
		 System.out.println("Enter 2 Update Data");
		 System.out.println("Enter 3 Delete Data");
		 System.out.println("Enter 4 Select Data");
		 
		 System.out.println("Enter Your Choice Number");
		 int choice =Sc.nextInt();
		 
		 switch(choice) {
		 case 1:
			 cc.insert();
			 break;
			 
		 case 2:
			 cc.update();
			 break;
			 
			 
		 case 3:
			 cc.delete();
			 break;
			 
		 case 4:
			 cc.select();
			 break;
			 
			 default:
				 System.out.println("Invaild Choice Plz Enter Correct Number");
				 break;
				 
			 
			
			 
			 
		 }
	}

}
