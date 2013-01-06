package com.amar.db.ibatis.dao;
import java.util.List;
import com.amar.web.model.Remindplan;

public interface RemindplanDAO
{

public List<Remindplan> findRemindplan( Remindplan remindplan );

public void deleteRemindplan( Remindplan remindplan );

public void addRemindplan( Remindplan remindplan );

public void editRemindplan( Remindplan remindplan );

}
