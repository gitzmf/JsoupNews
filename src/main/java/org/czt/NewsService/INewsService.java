package org.czt.NewsService;

import java.util.List;

import org.czt.ClassifyVo.Classify;
import org.czt.NewsVo.News;
import org.czt.utils.PageBean;

public interface INewsService {
	/*
	 * 抓取增加新闻
	 */
	public void addNew(News news) throws Exception;
	
	/*
	 * 分页查找所有用户
	 */
	public PageBean<News> findAll(Integer page) throws Exception;
	
	/*
	 * 删除数据
	 */
	public void deleteData() throws Exception;   
	
	/*
	 * 按类型查询
	 */
	public PageBean<News> findTypeAll(Integer page,Classify classify) throws Exception;
	
	/*
	 * 按日期分组统计
	 */
	public List<Object []> findNumberDate() throws Exception;
	
	/*
	 * 按作者分组统计
	 */
	public List<Object[]> findCountByAuthor() throws Exception;
	
	/*
	 * 按类型删除
	 */
	public boolean deleteTypeAll(Classify classify) throws Exception;
	/*
	 * 查询全部
	 */
	public List<News> findAll() throws Exception;
	
}
