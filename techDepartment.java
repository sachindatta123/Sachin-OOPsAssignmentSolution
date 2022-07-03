package com.gl.oopsAssignment.techDepartment;
import com.gl.oopsAssignment.superDepartment.superDepartment;

public class techDepartment extends superDepartment {
	protected String nameOfDepartment = "Tech Department";
	protected String workDetails = "Complete coding of module 1";
	protected String workDeadLine = "Complete by EOD";
	protected String  techStackInformation= "Core Java";

	public String departmentName() {
		return nameOfDepartment;
	}

	public String getTodaysWork() {
		return workDetails;
	}

	public String getWorkDeadline() {
		return workDeadLine;
	}

	public String getTechStackInformation() {
		return techStackInformation;
	}

}
