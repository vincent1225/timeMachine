/**
 * @(#)ActorAction.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 黑龙江科技大学
 * Create by:	文一梅  2016年11月27日
 */
package com.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.base.BaseAction;
import com.domain.Film;
import com.domain.Recommend;
import com.domain.User;
import com.hadoop.OperateHdfs;
import com.recommend.RecommendHadoop;

@Controller
@Scope("prototype")
public class RecommendAction extends BaseAction<Recommend>{

	private static final long serialVersionUID = -7820801186106231212L;
	
	private List<Film> films = new ArrayList<Film>();
	private List<Recommend> recommends;
	
	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	//如果是游客，则按电影评分推荐
	public String tourist(){
		films = filmService.getFilmOrderBySvgGrade();
		return "left";
	}
	
	//如果是已注册用户，则按喜好推荐
	public String user(){
		
		recommendService.save();
		
		User user = getCurrentUser();
		recommends = recommendService.getRecomByUserId(user.getUserId());
		if(recommends.size()>0){
			for(Recommend recommend:recommends){
				films.add(recommend.getId().getFilm());
			}
		}else{
			tourist();
		}
		return "left";
	}
	
	//启动hadoop推荐模块
	public String run(){
		//导出数据库的评分记录
		filmUserService.exportCsv();
		//启动推荐模块
		RecommendHadoop.run();
		//下载推荐结果到本地
		OperateHdfs.downloadFile();
		//读取推荐结果，并存到数据库
		recommendService.save();
		System.out.println("数据保存成功");
		return "run";
	}
}
