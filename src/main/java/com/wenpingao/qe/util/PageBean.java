package com.wenpingao.qe.util;

import java.util.List;

public class PageBean<E> {
	private int pi;// 当前页pageIndex
	private int dc;// 总记录数dataCount
	private int ps;// 每页记录数pageSize
	private List<E> beanList;// 当前页记录数据
	private String url;//URL后面的条件
	public int getPi() {
		return pi;
	}

	public void setPi(int pi) {
		this.pi = pi;
	}

	public int getPc() {
		int pc = dc / ps;
		//如果总的记录数/总的页面数 == 0,则返回总的页面数,如果不等于0说明还有记录,则返回总的页面数+1
		return dc % pc == 0 ? pc + 1: pc ;
	}
	
	public int getDc() {
		return dc;
	}

	public void setDc(int dc) {
		this.dc = dc;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public List<E> getBeanList() {
		return beanList;
	}

	public void setBeanList(List<E> beanList) {
		this.beanList = beanList;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
