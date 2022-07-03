package com.gl.oops.hrDepartment;
import com.gl.oopsAssignment.superDepartment.superDepartment;

public class hrDepartment extends superDepartment {
	protected String nameOfDepartment = "Hr Department";
	protected String workDetails = "Fill today's worksheet and mark your attendance";
	protected String workDeadLine = "Complete by EOD";
	protected String activityDetails = "team lunch";

	public String departmentName() {
		return nameOfDepartment;
	}

	public String getTodaysWork() {
		return workDetails;
	}

	public String getWorkDeadline() {
		return workDeadLine;
	}

	public String doActivity() {
		return activityDetails;
	}
}
