package com.domain;

import java.util.Date;

public class FilmUser implements java.io.Serializable {

	private static final long serialVersionUID = -560394004862018404L;

	private FilmUserId id;
	private Short score;			//评分
	private String userComment;		//评论	
	private Date commentTime;		//评论时间
	private String watchTime;		//观看时长
	
	public FilmUserId getId() {
		return id;
	}
	public void setId(FilmUserId id) {
		this.id = id;
	}
	public Short getScore() {
		return score;
	}
	public void setScore(Short score) {
		this.score = score;
	}
	public String getUserComment() {
		return userComment;
	}
	public void setUserComment(String userComment) {
		this.userComment = userComment;
	}
	public Date getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	public String getWatchTime() {
		return watchTime;
	}
	public void setWatchTime(String watchTime) {
		this.watchTime = watchTime;
	}
}