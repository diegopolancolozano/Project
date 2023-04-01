package ui;

import java.util.Scanner;
import model.Controller;
import java.util.Calendar;

public class Main{

	private Scanner reader;
	private Controller controller;

	public Main() {

		reader = new Scanner(System.in);
		controller = new Controller();
	}

	public static void main(String[] args) {

		Main exe = new Main();
		System.out.println("Bienvenido al gestor de proyectos de GreenSQA");
		int option = 0;
		do{
			exe.menu();
			option = exe.reader.nextInt();
			switch (option) {
				case 0:
					System.out.println("saliendo...");
					break;
				
				case 1:
					exe.RegisterProject();
					break;

				case 2:
					exe.searchProjectsAfterADate();
					break;

				case 3:
					exe.searchProjectsBeforeDate();
					break;

				default:
					System.out.println("No valido");
					break;
			}
		}while(option!=0);

	}

	// Incompleste
	public void menu() {
		System.out.println("0. salir");
		System.out.println("1. crear proyecto");
		System.out.println("2. consultar proyectos que finalizan despues de una fecha");
		System.out.println("3. consultar proyectos que finalizan antes de una fecha");
	}

	//Incomplete
	public void RegisterProject() {
		System.out.println("Inserte nombre del proyecto");
		String nameProject = reader.next();
		System.out.println("Inserte nombre del cliente");
		String nameClient = reader.next();
		System.out.println("Inserte tipo de proyecto");
		System.out.println("	0. Desarrollo");
		System.out.println("	1. Mantenimiento");
		System.out.println("	2. Despliegue");
		int typeProject = reader.nextInt();
		System.out.println("Inserte el presuspuesto");
		double budget = reader.nextDouble();

		System.out.println("Inserte fecha de inicio");
		System.out.print("año : ");
		int startYear = reader.nextInt();
		System.out.println("");
		System.out.print("mes : ");
		int startMonth = reader.nextInt();
		System.out.println("");
		System.out.print("dia : ");
		int startDay = reader.nextInt();
		System.out.println("");
		Calendar start = Calendar.getInstance();
		start.set(Calendar.YEAR, startYear);
		start.set(Calendar.MONTH, startMonth);
		start.set(Calendar.DAY_OF_MONTH, startDay);

		System.out.println("Inserte fecha de fin");
		System.out.print("año : ");
		int endYear = reader.nextInt();
		System.out.println("");
		System.out.print("mes : ");
		int endMonth = reader.nextInt();
		System.out.println("");
		System.out.print("dia : ");
		int endDay = reader.nextInt();
		System.out.println("");
		Calendar end = Calendar.getInstance();
		end.set(Calendar.YEAR, endYear);
		end.set(Calendar.MONTH, endMonth);
		end.set(Calendar.DAY_OF_MONTH, endDay); 

		controller.RegisterProject(nameProject, nameClient, start, end, budget);
		
	}

	//Incomplete
	public void searchProjectsAfterADate() {
		System.out.println("Inserte fecha");
		System.out.print("año : ");
		int year = reader.nextInt();
		System.out.println("");
		System.out.print("mes : ");
		int month = reader.nextInt();
		System.out.println("");
		System.out.print("dia : ");
		int day = reader.nextInt();
		System.out.println("");
		Calendar givenDate = Calendar.getInstance();
		givenDate.set(Calendar.YEAR, year);
		givenDate.set(Calendar.MONTH, month);
		givenDate.set(Calendar.DAY_OF_MONTH, day); 

		String msg = controller.searchProjectsAfterDate(givenDate);
		System.out.println("Los proyectos que finalizan despues de esa fecha son:");
		System.out.println(msg);
	}
	
	//Incomplete
	public void searchProjectsBeforeDate() {
		System.out.println("Inserte fecha");
		System.out.print("año : ");
		int year = reader.nextInt();
		System.out.println("");
		System.out.print("mes : ");
		int month = reader.nextInt();
		System.out.println("");
		System.out.print("dia : ");
		int day = reader.nextInt();
		System.out.println("");
		Calendar givenDate = Calendar.getInstance();
		givenDate.set(Calendar.YEAR, year);
		givenDate.set(Calendar.MONTH, month);
		givenDate.set(Calendar.DAY_OF_MONTH, day); 

		String msg = controller.searchProjectsBeforeDate(givenDate);
		System.out.println("Los proyectos que finalizan antes de esa fecha son:");
		System.out.println(msg);
	}
}
