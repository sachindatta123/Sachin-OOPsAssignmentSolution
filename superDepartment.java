package com.gl.oopsAssignment.superDepartment;
public class superDepartment {
	protected String nameOfDepartment = "Super Department";
	protected String workDetails = "No work as of now";
	protected String workDeadLine = "Nil";
	protected String isAHoliday = "Today is not a holiday";

	public String departmentName() {
		return nameOfDepartment;
	}

	public String getTodaysWork() {
		return workDetails;
	}

	public String getWorkDeadline() {
		return workDeadLine;
	}

	public String isTodayAHoliday() {
		return isAHoliday;
	}
}

