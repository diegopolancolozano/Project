package model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Controller {

	private Project[] projects;
	private int createdProject;

	public Controller() {

		projects = new Project[10];
		for(int i=0;i<10;i++){
			this.projects[i]= new Project();
		}

		createdProject = 0;
	
	}
	
	//Incomplete
	public boolean RegisterProject(String nameP, String nameC, Calendar start, Calendar end, double budget) {
		if(this.createdProject<10){
			this.projects[this.createdProject].Project(nameP, nameC, start, end, budget);
			this.createdProject+=1;
			return true;
		}
		return false;
	}

	//Incomplete
	// Date class also has their own before() and after() method
	public String searchProjectsAfterDate(Calendar date) {

		String msg = "";
		for(int i=0;i<createdProject;i++){
			if((projects[i].getFinalDate()).before(date)){
				msg = msg + projects[i].getName();
			}
		}

		return msg;

	}
	
	//Incomplete
	// Date class also has their own before() and after() method
	public String searchProjectsBeforeDate(Calendar date) {

		String msg = "";
		for(int i=0;i<createdProject;i++){
			if((projects[i].getFinalDate()).after(date)){
				msg = msg + projects[i].getName();
			}
		}

		return msg;
	}

	public int getCreatedProject() {
		return createdProject;
	}
}
