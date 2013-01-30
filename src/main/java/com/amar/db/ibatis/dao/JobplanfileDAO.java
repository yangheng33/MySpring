package com.amar.db.ibatis.dao;
import java.util.List;
import com.amar.web.model.Jobplanfile;

public interface JobplanfileDAO
{

public List<Jobplanfile> findJobplanfile( Jobplanfile jobplanfile );

public void deleteJobplanfile( Jobplanfile jobplanfile );

public void addJobplanfile( Jobplanfile jobplanfile );

public void editJobplanfile( Jobplanfile jobplanfile );

}
