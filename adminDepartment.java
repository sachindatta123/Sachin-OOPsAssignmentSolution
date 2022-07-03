package com.gl.oopsAssignment.adminDepartment;
import com.gl.oopsAssignment.superDepartment.superDepartment;

public class adminDepartment extends superDepartment {
	protected String nameOfDepartment = "Admin Department";
	protected String workDetails = "Complete your Documents Submission";
	protected String workDeadLine = "Complete by EOD";

	public String departName() {
		return nameOfDepartment;
	}

	public String getTodaysWork() {
		return workDetails;
	}

	public String getWorkDeadline() {
		return workDeadLine;
	}
}
