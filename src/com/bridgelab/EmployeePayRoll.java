package com.bridgelab;

import java.util.Random;

public class EmployeePayRoll {
	public static int Attendance(int a) {
		Random ran = new Random();
		a = ran.nextInt(2);
		return a;
	}
	public static  int PartTime(int a) {
	 
		Random random =new Random();
		a=random.nextInt(2);
		return (a);

	}

	public static void Check(int a, int b) {
	
        int num = Attendance(a);
		int num1 = PartTime(a);
		if (num == 1 && num1 == 1) {
			System.out.println("employee is present");
			System.out.println("Daily wage of employee is " + (20 * 8));
		} else if (num == 1 && num1 == 0) {
			System.out.println("employee is part time");
			System.out.println("employee part time wage is " + (20 * 4));
		} else if(num==0 && num1==0) {
			System.out.println("employee is part time");
			System.out.println("employee part time wage is " + (20 *8)/2);
			
		}else {

			System.out.println("employee is absent");
			switch(num) {
			case 1: System.out.println("Employee Present");
			       System.out.println("Wage of Employee is "+(20*8));
			       break;
			case 0:System.out.println("Employe are Absent");
			       System.out.println("Wage of Employee is "+0);
			}

			

		}}
	

	public static void main(String[] args) {
		System.out.println("welcome to employee wage program ");
		Check(Attendance(0), 0);
        Check(Attendance(1),1);
	}
}
