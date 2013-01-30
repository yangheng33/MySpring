package com.amar.db.ibatis.dao;
import java.util.List;
import com.amar.web.model.Jobplanreply;

public interface JobplanreplyDAO
{

public List<Jobplanreply> findJobplanreply( Jobplanreply jobplanreply );

public void deleteJobplanreply( Jobplanreply jobplanreply );

public void addJobplanreply( Jobplanreply jobplanreply );

public void editJobplanreply( Jobplanreply jobplanreply );

}
