package com.netmind.presentation;

import java.util.Scanner;

import com.netmind.business.StudentBl;
import com.netmind.model.Student;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar el objeto e inicializar con
		// el objeto de entrada estándar predefinido
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		StudentBl studentBl = new StudentBl();

		// entrada de una cadena
		String name = scanner.nextLine();
		String surname = scanner.nextLine();

		// Entrada de datos numéricos
		int age = scanner.nextInt();

		// calcular la media de edad
		double average = scanner.nextDouble();

		// Imprima los valores para verificar si la entrada
		// fue obtenida correctamente.

		System.out.println("Nombre: " + name);
		System.out.println("Edad: " + surname);
		System.out.println("Edad: " + age);
		System.out.println("Promedio: " + average);

	}

}
