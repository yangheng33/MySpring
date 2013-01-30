package com.amar.db.ibatis.dao;
import java.util.List;
import com.amar.web.model.Jobplanlog;

public interface JobplanlogDAO
{

public List<Jobplanlog> findJobplanlog( Jobplanlog jobplanlog );

public void deleteJobplanlog( Jobplanlog jobplanlog );

public void addJobplanlog( Jobplanlog jobplanlog );

public void editJobplanlog( Jobplanlog jobplanlog );

}
