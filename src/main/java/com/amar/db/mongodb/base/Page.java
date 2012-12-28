package com.amar.db.mongodb.base;

public class Page {
	
	//每页大小
	private int pageSize;
	//第几页
	private int pageIndex;
	//总页数
	private int totalPage;
	//总记录数
	private int totalCount;

	public Page(int pageSize, int pageIndex) {
		super();
		if(pageSize < 0) pageSize = 1;
		this.pageSize = pageSize;
		if(pageIndex <= 0) pageIndex = 1;
		this.pageIndex = pageIndex;
	}
	public Page(int pageIndex) { 
		this();
		this.pageIndex = pageIndex;
	}
	public Page() { 
		this.pageSize = 10;
		this.pageIndex = 1;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getTotalPage() {
		return totalPage;
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		this.totalPage = (this.totalCount + this.pageSize  -1)/this.pageSize;
	}
	
	
	
	
}
