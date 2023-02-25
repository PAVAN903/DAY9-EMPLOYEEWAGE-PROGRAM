package com.bridgelab;

import java.util.Random;

public class EmployeePayRoll {
	public static int Attendance(int a) {
		Random ran=new Random();
		a=ran.nextInt(2);
		return a;
	}
	public static void Check(int a) {
		int num=Attendance(a);
		if(Attendance(1)==1) {
			System.out.println("employee is present");
		}else {
			System.out.println("employee is absent");
		}
	}

	public static void main(String[] args) {
		System.out.println("welcome to employee wage program ");
		Check(Attendance(0));

	}

}
