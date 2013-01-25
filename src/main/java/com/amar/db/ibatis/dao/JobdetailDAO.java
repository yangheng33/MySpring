package com.amar.db.ibatis.dao;
import java.util.List;
import com.amar.web.model.Jobdetail;

public interface JobdetailDAO
{

public List<Jobdetail> findJobdetail( Jobdetail jobdetail );

public void deleteJobdetail( Jobdetail jobdetail );

public void addJobdetail( Jobdetail jobdetail );

public void editJobdetail( Jobdetail jobdetail );

}
