package org.czt.NewsAction;

import java.util.List;
import org.apache.log4j.Logger;
import org.czt.ClassifyService.IClassifyService;
import org.czt.ClassifyVo.Classify;
import org.czt.NewsService.INewsService;
import org.czt.NewsVo.News;
import org.czt.utils.ExelUtils;
import org.czt.utils.JsoupUtils;
import org.czt.utils.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 
 * @ClassName: NewsAction
 * @Description: 新闻的action
 * @author czt
 * @date 2018年4月26日
 *
 */
public class NewsAction extends ActionSupport implements ModelDriven<Classify> {
	static Logger log = Logger.getLogger(NewsAction.class.getName());
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */

	private static final long serialVersionUID = 1L;
	//newService业务层对象
	private INewsService newsService;

	public INewsService getNewsService() {
		return newsService;
	}

	public void setNewsService(INewsService newsService) {
		this.newsService = newsService;
	}
	
	//classifyService业务层对象
	private IClassifyService classifyService;
	
	public IClassifyService getClassifyService() {
		return classifyService;
	}

	public void setClassifyService(IClassifyService classifyService) {
		this.classifyService = classifyService;
	}

	// 接受page参数
	private Integer page;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}
	
	//classify对象
	private Classify classify = new Classify();

	@Override
	public Classify getModel() {
		// TODO Auto-generated method stub
		return this.classify;
	}

	// 带分页查询所有新闻
	public String findAllByPage() {
		try {
			log.info("=================查询全部====================");
			PageBean<News> pageBean = newsService.findAll(page);
			ActionContext.getContext().getValueStack().set("pageBean", pageBean);
			return "All";
		} catch (Exception e) {
			// TODO: handle exception
			this.addActionMessage("请尝试重新操作");
			return "ex";
		}
	}

	// 带分页查询有类型新闻的方法
	public String findTypeByPage() {
		try {
			Classify classifyNew = classifyService.findClassifyById(classify);
			PageBean<News> pageBean = newsService.findTypeAll(page, classifyNew);
			ActionContext.getContext().getValueStack().set("pageBean", pageBean);
			return "findAll";
		} catch (Exception e) {
			// TODO: handle exception
			this.addActionMessage("请尝试重新操作");
			return "ex";
		}
	}

	// 新闻采集
	public String addNews() {
		try {
			Classify classifyNew = classifyService.findClassifyByName(classify);
			newsService.deleteTypeAll(classifyNew);
			classify.setClassify_id(classifyNew.getClassify_id());
			classify.setClassifyName(classifyNew.getClassifyName());
			classify.setClassifyUrl(classifyNew.getClassifyUrl());
			List<String> urls = JsoupUtils.getAllhref(classifyNew.getClassifyUrl());
			log.info("=================抓取新闻====================");
			for (String url : urls) {
				News news = JsoupUtils.getNews(url);
				news.setCriticism(0);
				news.setClassify_id(classifyNew);
				newsService.addNew(news);
			}
			log.info("=================抓取结束====================");
			return findTypeByPage();
		} catch (Exception e) {
			// TODO: handle exception
			this.addActionMessage("请检查网路是否连接或尝试重新操作");
			return "ex";
		}
	}
	
	//数据导出
	public String exportExel() {
		 try {
			List<News> news = newsService.findAll();
			if(news!=null&&news.size()!=0){
				ExelUtils.jxlListToExl(news);
			}
			this.addActionMessage("数据导出成功");
			return "ex";
		  }catch (Exception e) {
			// TODO Auto-generated catch block
			this.addActionMessage("请尝试重新操作");
			return "ex";
		  }
	}
	// 清空数据库
	public String deleteNews() {
		try {
			newsService.deleteData();
			log.info("================清空数据成功=====================");
			this.addActionMessage("清空数据成功");
			return "ex";
		} catch (Exception e) {
			// TODO: handle exception
			this.addActionMessage("请尝试重新操作");
			return "ex";
		}
	}
}
