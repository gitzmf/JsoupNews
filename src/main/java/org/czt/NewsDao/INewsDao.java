package org.czt.NewsDao;

import java.util.List;
import org.czt.ClassifyVo.Classify;
import org.czt.NewsVo.News;

/**
 * 
 * @ClassName: INewsDao
 * @Description: 抓取新闻的dao层
 * @author czt
 * @date 2018年4月25日
 *
 */
public interface INewsDao {
	/*
	 * 抓取 增加新闻
	 */
	public void addNew(News news) throws Exception;
	
	/*
	 * 按作者查询新闻
	 */
	public List<Object[]> findCountByAuthor() throws Exception;
	
	/*
	 * 查找所有用户的个数
	 */
	public int findAllCount() throws Exception;
	
	/*
	 * 分页查询
	 */
	public List<News> findAllByPage(int begin, int limit)  throws Exception;
	
	/*
	 * 清空数据库
	 */
	public void deleteData()  throws Exception;
    
	/*
	 * 按类型查找数量
	 */
	public int findTypeAllCount(Classify classify) throws Exception;
	/*
	 * 按类型分页查找
	 */
	public List<News> findTypeAllByPage(int begin, int limit, Classify classify) throws Exception;
	
	/*
	 * 查詢各個分組
	 */
	public List<Object []> findNumberDate() throws Exception;
	
	/*
	 * 按类型删除数据
	 */
	public boolean deleteTypeAll(List<News> news) throws Exception;
	
	/*
	 * 按类型查找数据
	 */
	public List<News> findTypeAll(Classify classify) throws Exception;
	
	/*
	 * 查询全部
	 */
	public List<News> findAll() throws Exception;
}
