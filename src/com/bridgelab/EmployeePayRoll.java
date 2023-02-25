package com.bridgelab;

import java.util.Random;

public class EmployeePayRoll {
	public static int Attendance(int a) {
		Random ran = new Random();
		a = ran.nextInt(2);
		return a;
	}

	public static void Check(int a, int b) {

		int num = Attendance(a);
		int num1 = Attendance(b);
		if (num == 1 && num1 == 1) {
			System.out.println("employee is present");
			System.out.println("Daily wage of employee is " + (20 * 8));
		} else if (num == 1 && num1 == 0) {
			System.out.println("employee is part time");
			System.out.println("employee part time wage is " + (20 * 4));
		} else {
			System.out.println("Employe are Absent");
		}

		switch (num) {
		case 1:
			System.out.println("Employee Present");
			System.out.println("Wage of Employee is " + (20 * 8));
			break;
		case 0:
			System.out.println("Employe are Absent");
			System.out.println("Wage of Employee is " + 0);
		}

	}

	public static void main(String[] args) {
		System.out.println("welcome to employee wage program ");
		Check(Attendance(0), 1);
		int TotalWorkDay=20;
		int DailyWage=20*8;
		int MonthlyWage=TotalWorkDay*DailyWage;
		System.out.println("month wage for total workinday is 20 ::: "+MonthlyWage);

	}
}
