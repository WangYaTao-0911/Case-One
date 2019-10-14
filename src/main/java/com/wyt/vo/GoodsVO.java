package com.wyt.vo;

import com.yt.domains.Goods;

public class GoodsVO extends Goods{

	private String p1;
	private String p2;
	private String t1;
	private String t2;
	private String ass;
	private String dess;
	public String getP1() {
		return p1;
	}
	public void setP1(String p1) {
		this.p1 = p1;
	}
	public String getP2() {
		return p2;
	}
	public void setP2(String p2) {
		this.p2 = p2;
	}
	public String getT1() {
		return t1;
	}
	public void setT1(String t1) {
		this.t1 = t1;
	}
	public String getT2() {
		return t2;
	}
	public void setT2(String t2) {
		this.t2 = t2;
	}
	public String getAss() {
		return ass;
	}
	public void setAss(String ass) {
		this.ass = ass;
	}
	public String getDess() {
		return dess;
	}
	public void setDess(String dess) {
		this.dess = dess;
	}
	public GoodsVO(Integer id, String name, double price, String percent, String p1, String p2, String t1,
			String t2, String ass, String dess) {
		
		this.p1 = p1;
		this.p2 = p2;
		this.t1 = t1;
		this.t2 = t2;
		this.ass = ass;
		this.dess = dess;
	}
	

	

}
