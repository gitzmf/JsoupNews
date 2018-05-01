package org.czt.ClassifyService;

import org.czt.ClassifyVo.Classify;


public interface IClassifyService {
	/* 
	 * 按根据classifyname查询Classify
	 */
	public Classify findClassifyByName(Classify classify) throws Exception;	
	/* 
	 * 按根据classify_id查询Classify
	 */
	public Classify findClassifyById(Classify classify) throws Exception;
}
