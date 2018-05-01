package org.czt.ClassifyVo;

import java.util.HashSet;
import java.util.Set;

import org.czt.NewsVo.News;

// default package
// Generated 2018-4-25 13:57:39 by Hibernate Tools 5.1.4.Final

/**
 * 
 * @ClassName: Classify
 * @Description: classify对象的封装
 * @author czt
 * @date 2018年4月26日
 *
 */
public class Classify implements java.io.Serializable {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	    
	private static final long serialVersionUID = 1L;
	private Integer classify_id;
	private String classifyName;
	private String classifyUrl;
	private Set<News> news = new HashSet<News>();
	public Classify() {
	}

	

	public Classify(String classifyName, String classifyUrl, Set<News> news) {
		this.classifyName = classifyName;
		this.classifyUrl = classifyUrl;
		this.news = news;
	}



	public Integer getClassify_id() {
		return classify_id;
	}

	public void setClassify_id(Integer classify_id) {
		this.classify_id = classify_id;
	}

	public String getClassifyName() {
		return this.classifyName;
	}

	public Set<News> getNews() {
		return news;
	}

	public void setNews(Set<News> news) {
		this.news = news;
	}

	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}

	public String getClassifyUrl() {
		return classifyUrl;
	}

	public void setClassifyUrl(String classifyUrl) {
		this.classifyUrl = classifyUrl;
	}
	
	
}
