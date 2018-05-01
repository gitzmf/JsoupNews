package org.czt.utils;


import java.util.List;

import org.apache.log4j.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 * 
 * @ClassName: PieChart
 * @Description:饼状图工具类
 * @author czt
 * @date 2018年4月26日
 *
 */
public class PieChart {	
	    static Logger log = Logger.getLogger(PieChart.class.getName());
    	public static JFreeChart createChart(List<Object[]> list){
    	  DefaultPieDataset dataset = new DefaultPieDataset( );
		  for (Object[] objects : list) {
	             String author = (String) objects[0];
	             Long count=(Long) objects[1];
	             dataset.setValue(author, new Double(count) );
	             log.info("作者"+author+"文章个数"+count);
	      } 
	      JFreeChart chart = ChartFactory.createPieChart(      
	         "Author numbers",  // chart title 
	         dataset,        // data    
	         true,           // include legend   
	         true, 
	         false);
            FontUtils.setTheme();
	      return chart;
	    }
}
