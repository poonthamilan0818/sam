package org.college;

public class College {
	public void collegeName() {
		System.out.println("College name:Aksheyaa college of engineering");
	}
	public void collegeCode() {
		System.out.println("College code:4205");
	}
	public void collegeRank() {
		System.out.println("College rank:012");
	}
	public void clgPhnNo() {
		System.out.println("9876543210");
	}
	public static void main(String[] args) {
		College clg=new College();
		clg.collegeName();clg.collegeCode();clg.collegeRank();
		Student std=new Student();
		std.studentName();std.studentId();std.studentDept();
		Hostel hs=new Hostel();
		hs.hostelName();
		Dept dp=new Dept();
		dp.deptName();
		clg.clgPhnNo();
	}

}
