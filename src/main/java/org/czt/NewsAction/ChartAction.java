package org.czt.NewsAction;

import java.util.List;
import org.apache.log4j.Logger;
import org.czt.NewsService.INewsService;
import org.czt.utils.LineChart;
import org.czt.utils.PieChart;
import org.jfree.chart.JFreeChart;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @ClassName: ChartAction
 * @Description: 产生线性图和饼状图的action
 * @author zmf
 * @date 2018年4月30日
 *
 */
public class ChartAction extends ActionSupport {
	static Logger log = Logger.getLogger(ChartAction.class.getName());
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	    
	private static final long serialVersionUID = 1L;
	/**  
     * 定 义JFreeChart对象 大家请注意在这里JFreeChart对象名只能为chart   
     * 不能是别的   
     * 关于这点  
     * 大家可以上struts2网站上面查看一下  
     *   
     * http://struts.apache.org/2.x/docs/jfreechart-plugin.html  
     */   
    private  JFreeChart chart;  
  
    public  JFreeChart getChart() {  
        return  chart;  
    }  
    
    private INewsService newsService;
    
    public INewsService getNewsService() {
		return newsService;
	}
	public void setNewsService(INewsService newsService) {
		this.newsService = newsService;
	}


	public   void  setChart(JFreeChart chart) {  
        this .chart = chart;  
    }  
	
	//饼状图
    public  String pieChart()  throws  Exception {  
        // 调用方法   
    	log.info("=================饼状图绘制====================");
    	List<Object []> list = newsService.findCountByAuthor();
        this.chart = PieChart.createChart(list);  
        return  SUCCESS;  
    }  
    
    //线性图
    public  String lineChart()  throws  Exception {  
        // 调用方法   
    	log.info("=================线形图绘制====================");
        List<Object []> list = newsService.findNumberDate();
        this.chart = LineChart.createChart(list);  
        return  SUCCESS;  
    }  
    //跳转
    public  String forword(){
    	return "chart";
    }
}
