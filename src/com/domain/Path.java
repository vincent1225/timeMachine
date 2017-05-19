package com.domain;
/**
 * 电影路径表
 */
import java.math.BigDecimal;

public class Path implements java.io.Serializable {

	private static final long serialVersionUID = -5902747321300503956L;
	
	private BigDecimal pathId;
	private Film film;
	private String pathURL;	//电影路径
	private String remark;	//备注
	
	public BigDecimal getPathId() {
		return pathId;
	}
	public void setPathId(BigDecimal pathId) {
		this.pathId = pathId;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public String getPathURL() {
		return pathURL;
	}
	public void setPathURL(String pathURL) {
		this.pathURL = pathURL;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}