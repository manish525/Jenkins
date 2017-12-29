package com.collections.examples;

public class Student implements Comparable{
	
	private String name;
	private Integer rollNo;
	
	Student(String name, Integer rollNo)
	{
		this.name= name;
		this.rollNo = rollNo;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}


	
	
	

	@Override
	public int compareTo(Object o) {
		
		String compareName = ((Student)o).getName();
		
		//return this.name.compareTo(compareName);
		
		return compareName.compareTo(this.name);
		
		//Integer compareRollno = ((Student)o).getRollNo();
		
		//return this.rollNo-compareRollno;
		
		//return compareRollno-this.rollNo;
	}
	
	

}
