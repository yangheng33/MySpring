package com.amar.db.ibatis.dao;
import java.util.List;
import com.amar.web.model.Project;

public interface ProjectDAO
{

public List<Project> findProject( Project project );

public void deleteProject( Project project );

public void addProject( Project project );

public void editProject( Project project );

}
