package com.syntax.class17;

public class Students {
//Create a Class called Students
//Create three  variables  Name , ID  and  numberOfStudents
//Create three objects of the Students Class
//Set the value for  studentName , studentID and increment  the numberOfStudents
	//for each object
//Print out  total number of students
	
	String name;
	String id;
	static  int numberOfStudents;
	
	public static void main(String[] args) {
		
	Students l=new Students();
	
	l.name="Lola";
	l.id="007";
	Students.numberOfStudents++;
	System.out.println(l.name+ " ID number "+l.id+" " +"no."+numberOfStudents);
	
	Students s=new Students();
	
	s.name="Sophy";
	s.id="008";
	Students.numberOfStudents++;
	System.out.println(s.name+ " ID number "+s.id+" "+"no."+numberOfStudents);
	
	Students a=new Students();
	a.name="Alex";
	a.id="009";
	Students.numberOfStudents++;
	System.out.println(a.name+ " ID number "+a.id+" "+"no."+numberOfStudents);
	System.out.println();
	System.out.println("number of students = "+Students.numberOfStudents);
	}

	
	}


