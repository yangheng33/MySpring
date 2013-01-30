package com.amar.db.ibatis.dao;
import java.util.List;
import com.amar.web.model.Jobplan;

public interface JobplanDAO
{

public List<Jobplan> findJobplan( Jobplan jobplan );

public void deleteJobplan( Jobplan jobplan );

public void addJobplan( Jobplan jobplan );

public void editJobplan( Jobplan jobplan );

}
