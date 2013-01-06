package com.amar.db.ibatis.dao;
import java.util.List;
import com.amar.web.model.Remindlog;

public interface RemindlogDAO
{

public List<Remindlog> findRemindlog( Remindlog remindlog );

public void deleteRemindlog( Remindlog remindlog );

public void addRemindlog( Remindlog remindlog );

public void editRemindlog( Remindlog remindlog );

}
