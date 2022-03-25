package com.wipro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

	public List<Student> getAllStudents() {

		Student student1 = new Student("Sreenivasulu", 4, 4.5, "Male", Arrays.asList("palying", "swimming"));
		Student student2 = new Student("Narendra", 5, 4.5, "Male", Arrays.asList("palying", "gymnastics"));
		Student student3 = new Student("Sisindri", 3, 2.5, "Male", Arrays.asList("palying", "swimming"));
		Student student4 = new Student("Hari", 2, 2.5, "Male", Arrays.asList("palying", "swimming"));

		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);

		return students;

	}

}
