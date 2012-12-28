package com.amar.db.mongodb.dao;

import java.util.List;

import com.amar.db.mongodb.base.Page;
import com.amar.web.model.CountTest;

public interface MapReduceTestDAO
{
	public List<CountTest> getCountTestMaxValue( int MaxN );
	
	public List<CountTest> getAllByPage( Page page ,String ordername );
	
	public long total();
	
	public long total_group();
}
