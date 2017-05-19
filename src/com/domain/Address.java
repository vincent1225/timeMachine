package com.domain;

import java.math.BigDecimal;

public class Address implements java.io.Serializable {

	private static final long serialVersionUID = -6103260686697504995L;

	private BigDecimal addrId;
	private User user;			
	private String addrName;	//地址名
	private String rank;		//级别
	private String remark;		//备注
	
	public BigDecimal getAddrId() {
		return addrId;
	}
	public void setAddrId(BigDecimal addrId) {
		this.addrId = addrId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getAddrName() {
		return addrName;
	}
	public void setAddrName(String addrName) {
		this.addrName = addrName;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}