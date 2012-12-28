package com.amar.db.ibatis.dao;

import java.util.List;

import com.amar.app.autocode.TableInfo;


public interface AutocodeDAO
{
	public List<TableInfo> getMysqlTableInfo(String dbname);
	
	public List<TableInfo> getOracleTableInfo();
}
