package com.amar.db.ibatis.dao;
import java.util.List;
import com.amar.web.model.Diary;

public interface DiaryDAO
{

public List<Diary> findDiary( Diary diary );

public void deleteDiary( Diary diary );

public void addDiary( Diary diary );

public void editDiary( Diary diary );

}
