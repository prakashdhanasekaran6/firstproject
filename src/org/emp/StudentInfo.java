package org.emp;

import java.util.Scanner;

public class StudentInfo {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	
	int Id = s.nextInt();
	System.out.println("student id is:"+Id);
	
	String name = s.next();
	System.out.println("student name is:"+name);
	
	int mark1 = s.nextInt();
	System.out.println("mark1 is:"+mark1);
	
	int mark2 = s.nextInt();
	System.out.println("mark2 is:"+mark2);
	
	int mark3 = s.nextInt();
	System.out.println("mark3 is:"+mark3);
	
	int mark4 = s.nextInt();
	System.out.println("mark4 is:"+mark4);
	
	int mark5 = s.nextInt();
	System.out.println("mark5 is:"+mark5);
	
	int Total = s.nextInt();
	System.out.println("student total mark is:"+Total);
  
	
}
}
