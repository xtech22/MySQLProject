package projects2.service;

import projects2.dao.Project2Dao;
import projects2.entity.Project;

public class ProjectService {
	
	private Project2Dao project2Dao = new Project2Dao();

	public Project addProject(Project project) {

		return project2Dao.insertProject(project);
		
	}
	
}
