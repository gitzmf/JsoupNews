package org.czt.ClassifyService;

import org.czt.ClassifyDao.IClassifyDao;
import org.czt.ClassifyVo.Classify;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @ClassName: ClassifyServiceImpl
 * @Description: 业务层
 * @author czt
 * @date 2018年4月26日
 *
 */
@Transactional
public class ClassifyServiceImpl implements IClassifyService {
	private IClassifyDao classifyDao;
	
	public IClassifyDao getClassifyDao() {
		return classifyDao;
	}

	public void setClassifyDao(IClassifyDao classifyDao) {
		this.classifyDao = classifyDao;
	}

	@Override
	public Classify findClassifyByName(Classify classify) throws Exception {
		// TODO Auto-generated method stub
		return classifyDao.findClassifyByName(classify);
	}

	@Override
	public Classify findClassifyById(Classify classify) throws Exception {
		// TODO Auto-generated method stub
		return classifyDao.findClassifyById(classify);
	} 
}	
