package com.collections.examples;

import java.util.Comparator;

public class StudentComparator {

	Integer rollNo;
	String studentName;
	Integer age;
	
	public StudentComparator(Integer rollNo, String studentName,Integer age) {
		
		this.age= age;
		this.rollNo= rollNo;
		this.studentName= studentName;
		
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	public static Comparator<StudentComparator> studentNameComparator = new Comparator<StudentComparator>() {
		
		@Override
		public int compare(StudentComparator o1, StudentComparator o2) {
			String studentName1 = o1.getStudentName().toUpperCase();
			String studentName2 = o1.getStudentName().toUpperCase();
			
			return studentName1.compareTo(studentName2);
		}
	};
	
	
	public static Comparator<StudentComparator> studentRollNoComparator = new Comparator<StudentComparator>() {
		
		@Override
		public int compare(StudentComparator o1, StudentComparator o2) {
			
			Integer StudentRollNo1 = o1.getRollNo();
			Integer StudentRollNo2 = o2.getRollNo();
			
			return StudentRollNo1-StudentRollNo2;
		}
	};
	
	
}
