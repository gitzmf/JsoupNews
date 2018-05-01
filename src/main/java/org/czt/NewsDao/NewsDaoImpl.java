package org.czt.NewsDao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import org.czt.ClassifyVo.Classify;
import org.czt.NewsVo.News;
import org.czt.utils.PageHibernateCallback;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class NewsDaoImpl extends HibernateDaoSupport implements INewsDao {
	
	static Logger log = Logger.getLogger(NewsDaoImpl.class.getName());
	
	@Override
	public void addNew(News news) throws Exception {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(news);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object []> findCountByAuthor() throws Exception {
		// TODO Auto-generated method stub
		 String hql = "select author,count(author) from News group by author";
		 List<Object[]> list = (List<Object[]>) this.getHibernateTemplate().find(hql);
         return list;
	}
	
	@Override
	public int findAllCount() throws Exception{
		// TODO Auto-generated method stub
		String hql = "select count(*) from News";
		@SuppressWarnings("unchecked")
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
		if(list != null && list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}
	
	@Override
	public List<News> findAllByPage(int begin, int limit) throws Exception{
		// TODO Auto-generated method stub
		String hql = "from News";
		// 分页另一种写法:
		List<News> list = this.getHibernateTemplate().execute(new PageHibernateCallback<News>(hql,null, begin, limit));
		if(list != null && list.size() > 0){
			return list;
		}
		return null;
	}
    	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void deleteData() throws Exception{
		// TODO Auto-generated method stub
		this.getHibernateTemplate().execute(new HibernateCallback(){          
			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				 String sql = "delete News";
	             return session.createQuery(sql).executeUpdate();	             
			}
    	});
	}

	@Override
	public int findTypeAllCount(Classify classify) throws Exception{
		// TODO Auto-generated method stub
		String hql = "select count(*) from News where classify_id.classify_id=?";
		@SuppressWarnings("unchecked")
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql,classify.getClassify_id());
		if(list != null && list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<News> findTypeAllByPage(int begin, int limit, Classify classify) throws Exception{
		// TODO Auto-generated method stub
		String hql = "from News where classify_id.classify_id=?";
		// 分页另一种写法:
		Object params [] = {classify.getClassify_id()};
		List<News> list = this.getHibernateTemplate().execute(new PageHibernateCallback<News>(hql,params, begin, limit));
		if(list != null && list.size() > 0){
			return list;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findNumberDate() throws Exception{
		// TODO Auto-generated method stub
		 String hql = "select publishdate,count(publishdate) from News group by publishdate";
		 List<Object[]> list = (List<Object[]>) this.getHibernateTemplate().find(hql);
         SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
         for (Object[] objects : list) {
             Date publishdate=(Date) objects[0];
             String date = sdf.format(publishdate);
             Long count=(Long) objects[1];
            log.info("日期"+date+"个员工"+count);
         }     
         return list;
	}

	@Override
	public boolean deleteTypeAll(List<News> news) throws Exception {
		// TODO Auto-generated method stub
		if(news==null||news.size()==0){
			return true;
		}
		for(News test : news){
			this.getHibernateTemplate().delete(test);
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<News> findTypeAll(Classify classify) throws Exception {
		// TODO Auto-generated method stub
		String hql = "from News where classify_id.classify_id=?";
		// 分页另一种写法:
		List<News> list = (List<News>) this.getHibernateTemplate().find(hql, classify.getClassify_id());
		if(list != null && list.size() > 0){
			return list;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<News> findAll() throws Exception {
		// TODO Auto-generated method stub
		String hql = "from News";
		// 分页另一种写法:
		List<News> list = (List<News>) this.getHibernateTemplate().find(hql);
		if(list != null && list.size() > 0){
			return list;
		}
		return null;
	}
}
