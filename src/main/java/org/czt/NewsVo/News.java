package org.czt.NewsVo;

// default package
// Generated 2018-4-25 13:57:39 by Hibernate Tools 5.1.4.Final

import java.util.Date;

import org.czt.ClassifyVo.Classify;


/**
 * 
 * @ClassName: News
 * @Description: 新闻的工具类
 * @author czt
 * @date 2018年4月30日
 *
 */
public class News implements java.io.Serializable {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	    
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String title;
	private String author;
	private String keywords;
	private Date publishdate;
	private String source;
	private Integer criticism;
	private Classify classify_id;
	
	public News() {
	}

	

	public News(String title, String author, String keywords, Date publishdate, String source,
			Integer criticism, Classify classify_id) {
		this.title = title;
		this.author = author;
		this.keywords = keywords;
		this.publishdate = publishdate;
		this.source = source;
		this.criticism = criticism;
		this.classify_id = classify_id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPublishdate() {
		return this.publishdate;
	}

	public void setPublishdate(Date publishdate) {
		this.publishdate = publishdate;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Integer getCriticism() {
		return this.criticism;
	}

	public void setCriticism(Integer criticism) {
		this.criticism = criticism;
	}

	public Classify getClassify_id() {
		return classify_id;
	}

	public void setClassify_id(Classify classify_id) {
		this.classify_id = classify_id;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}	 
	
}
