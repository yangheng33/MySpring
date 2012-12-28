package com.amar.db.mongodb.base;

import java.util.List;

import org.bson.types.ObjectId;



/**
 * 基本的增加，单个查询和删除（根据_id）._id为ObjectId类型
 */
public interface IDAO<T>{
	/**
	 * 添加
	 */
	public void add(T t);
	/**
	 * 已知_id进行更新，操作结果是覆盖，如果_id未指定，会执行添加操作
	 */
	public void update(T t);	
	/**
	 * 根据_id删除,_id类型必须为ObjectId
	 */
	public void delById(ObjectId _id);
 
	/**
	 * 根据_id查找,_id类型必须为ObjectId
	 * @param _id 
	 */
	public T findById(ObjectId _id);
	 
	/**
	 * 返回全部实体
	 */
	public List<T> getAll();
	
	/**
	 * 分页获取
	 */
	public List<T> getByPage(Page page);
	/******************* 同步用 **********************/
	/**
	 * 开始请求
	 */
	public void requestStart();
	/**
	 * 检查更新操作是否成功
	 * @return true 成功 false 失败
	 */
	public boolean checkUpdateStatus();
	/**
	 * 检查删除操作是否成功
	 * @return true 成功 false 失败
	 */
	public boolean checkDeleteStatus();
	/**
	 * 检查添加操作是否成功
	 * @return true 成功 false 失败
	 */
	public boolean checkAddStatus();
	/******************* 同步用 **********************/
}
