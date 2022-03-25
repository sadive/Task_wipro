package com.wipro;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsumerAndSupplierAndPredicateExample {

	StudentDatabase studentDatabase = new StudentDatabase();
	List<Student> students = studentDatabase.getAllStudents();

	/*
	 * to print the student details by using consumer function
	 */
	public void consumerExample() {

		students.stream().forEach(st -> System.out.println(st));
	}

	/*
	 * to print the first student details by using supplier function
	 */

	public Student supplierExample() {

		return students.stream().findFirst().get();
	}

	/*
	 * to print the student details whose grade is greater than 3 using predicate
	 * function
	 */

	public List<Student> getAllStudentsBasedOnGradeLevel() {

		List<Student> student = students.stream().filter(st -> 3 < st.getGardeLevel()).collect(Collectors.toList());

		return student;

	}

	/*
	 * to print the student details whose gpa is greater than 3.5 using predicate
	 * function
	 */

	public Map<String, Student> getAllStudentsBasedOnGpa() {

		Map<String, Student> studentMap = students.stream().filter(st -> 3.5 < st.getGpa())
				.collect(Collectors.toMap(Student::getName, st1 -> st1));
		return studentMap;
	}

}
