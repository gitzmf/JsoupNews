package org.czt.ClassifyDao;


import org.czt.ClassifyVo.Classify;

/**
 * 
 * @ClassName: INewsDao
 * @Description: 抓取新闻分类的dao层
 * @author czt
 * @date 2018年4月25日
 *
 */
public interface IClassifyDao {
	 
	/*
	 * 按根据classifyname查询Classify
	 */
	public Classify findClassifyByName(Classify classify) throws Exception;
	
	
	/*
	 * 按根据classify_id查询Classify
	 */
	public Classify findClassifyById(Classify classify) throws Exception;
	 
}
