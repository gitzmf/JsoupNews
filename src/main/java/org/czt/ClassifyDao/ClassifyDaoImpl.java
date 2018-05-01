package org.czt.ClassifyDao;

import java.util.List;
import org.czt.ClassifyVo.Classify;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class ClassifyDaoImpl extends HibernateDaoSupport implements IClassifyDao {

	@SuppressWarnings("unchecked")
	@Override
	public Classify findClassifyByName(Classify classify) throws Exception {
		// TODO Auto-generated method stub
		String hql = "from Classify where classifyName=?";
		List<Classify> list = (List<Classify>) this.getHibernateTemplate().find(hql,classify.getClassifyName());
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Classify findClassifyById(Classify classify) throws Exception {
		// TODO Auto-generated method stub
		String hql = "from Classify where classify_id=?";
		List<Classify> list = (List<Classify>) this.getHibernateTemplate().find(hql,classify.getClassify_id());
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}
 
}
