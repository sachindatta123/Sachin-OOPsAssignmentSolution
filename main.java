package com.gl.oopsAssignment.driver;
import com.gl.oops.hrDepartment.hrDepartment;
import com.gl.oopsAssignment.adminDepartment.adminDepartment;
import com.gl.oopsAssignment.techDepartment.techDepartment;

public class main {
	public static void main(String[] args) {
		adminDepartment obj1 = new adminDepartment();
		hrDepartment obj2 = new hrDepartment();
		techDepartment obj3 = new techDepartment();
		System.out.println("Welcome to " + obj1.departName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to " + obj2.departmentName());
		System.out.println(obj2.doActivity());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to " + obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
		System.out.println(obj3.isTodayAHoliday());
	}
}
