package com.netmind.presentation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.netmind.business.StudentBl;
import com.netmind.model.Student;

public class StudentConsole {

	public static void selectOperation() {
		Scanner scanner = new Scanner(System.in);
		StudentBl studentBl = new StudentBl();

		int option;

		do {
			showPrincipalMenu();
			option = Integer.parseInt(scanner.nextLine());

			switch (option) {
			case 1:
				Student student = new Student();
				addNewStudent(student, scanner);
				studentBl.add(student);
				break;
			case 2:
				System.out.println("Older student:");
				break;

			case 3:
				System.out.println("Student age average:");
				break;

			case 4:
				System.out.println("Exit");
				System.exit(0);

				break;

			}
		} while (option != 3);
		scanner.close();
	}

	private static void showPrincipalMenu() {
		System.out.println("Select an option");
		System.out.println("1.Add a new student");
		System.out.println("2. Older student");
		System.out.println("3. Average age");
		System.out.println("4. Exit");

	}

	private static void addNewStudent(Student student, Scanner scanner) {
		System.out.println("1.Add a new student");
		System.out.println("Add name: ");
		student.setName(scanner.nextLine());

		System.out.println("Add surname: ");
		student.setSurname(scanner.nextLine());
		System.out.println(
				"Helo " + student.getName() + " " + student.getSurname() + "!");

		System.out.println("Your Age: ");
		// String age = scanner.nextLine();

		System.out.println("Add data of birth: ");
		try {
			student.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy")
					.parse(scanner.nextLine()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
