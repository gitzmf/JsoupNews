package org.czt.NewsService;

import java.util.List;

import org.czt.ClassifyVo.Classify;
import org.czt.NewsDao.INewsDao;
import org.czt.NewsVo.News;
import org.czt.utils.PageBean;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class NewsServiceImpl implements INewsService {
	private INewsDao newsDao;

	public INewsDao getNewsDao() {
		return newsDao;
	}

	public void setNewsDao(INewsDao newsDao) {
		this.newsDao = newsDao;
	}

	@Override
	public void addNew(News news) throws Exception {
		// TODO Auto-generated method stub
		newsDao.addNew(news);
	}

	@Override
	public PageBean<News> findAll(Integer page) throws Exception {
		// TODO Auto-generated method stub
		PageBean<News> pageBean = new PageBean<News>();
		//设置页数
		pageBean.setPage(page);
		//设置每一页可以显示的新闻数
		int limit = 10;
		pageBean.setLimit(limit);
		//设置具体的某一分类新闻的总记录数
		int totalCount = newsDao.findAllCount();
		pageBean.setTotalCount(totalCount);
		//设置总页数
		int totalPage = 0;
		if(totalCount % limit == 0){
			totalPage = totalCount / limit;
		}else{
			totalPage = totalCount /limit + 1;
		}
		pageBean.setTotalPage(totalPage);
		//设置具体页数的新闻集合
		int begin = (page - 1)*limit;
		List<News> products = newsDao.findAllByPage(begin,limit);
		pageBean.setList(products);
		return pageBean;
	}

	@Override
	public void deleteData() throws Exception{
		// TODO Auto-generated method stub
		newsDao.deleteData();
	}

	@Override
	public PageBean<News> findTypeAll(Integer page, Classify classify) throws Exception{
		// TODO Auto-generated method stub
		PageBean<News> pageBean = new PageBean<News>();
		//设置页数
		pageBean.setPage(page);
		//设置每一页可以显示的新闻数
		int limit = 10;
		pageBean.setLimit(limit);
		//设置具体的某一分类新闻的总记录数
		int totalCount = newsDao.findTypeAllCount(classify);
		pageBean.setTotalCount(totalCount);
		//设置总页数
		int totalPage = 0;
		if(totalCount % limit == 0){
			totalPage = totalCount / limit;
		}else{
			totalPage = totalCount /limit + 1;
		}
		pageBean.setTotalPage(totalPage);
		//设置具体页数的新闻集合
		int begin = (page - 1)*limit;
		List<News> products = newsDao.findTypeAllByPage(begin,limit,classify);
		pageBean.setList(products);
		return pageBean;
	}

	@Override
	public List<Object[]> findNumberDate() throws Exception{
		// TODO Auto-generated method stub
		return newsDao.findNumberDate();
	}

	@Override
	public List<Object[]> findCountByAuthor() throws Exception {
		// TODO Auto-generated method stub
		return newsDao.findCountByAuthor();
	}

	@Override
	public boolean deleteTypeAll(Classify classify) throws Exception {
		// TODO Auto-generated method stub
		List<News> news = newsDao.findTypeAll(classify);
		return newsDao.deleteTypeAll(news);
	}

	@Override
	public List<News> findAll() throws Exception {
		// TODO Auto-generated method stub
		return newsDao.findAll();
	}

}	
