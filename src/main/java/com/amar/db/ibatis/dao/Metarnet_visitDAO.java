package com.amar.db.ibatis.dao;

import java.util.List;
import java.util.Map;

import com.amar.web.model.Metarnet_visit;

public interface Metarnet_visitDAO
{

	public List<Metarnet_visit> findMetarnet_visit( Metarnet_visit metarnet_visit );

	public void deleteMetarnet_visit( Metarnet_visit metarnet_visit );

	public void addMetarnet_visit( Metarnet_visit metarnet_visit );

	public void editMetarnet_visit( Metarnet_visit metarnet_visit );

	public void deleteAllMetarnet_visit();

	@SuppressWarnings( "rawtypes" )
	public List<Map> findMetarnetVisitStatisticsByZhounan();

	public List<Metarnet_visit> findMetarnetVisitOrderByZhounan();

}
