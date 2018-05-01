package org.czt.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * 
 * @ClassName: LineChart
 * @Description: 线性图的工具
 * @author czt
 * @date 2018年4月30日
 *
 */
public class LineChart {
	//声明一个Logger对象
	   static Logger log = Logger.getLogger(LineChart.class.getName());
	   public static JFreeChart createChart(List<Object []> list){ 
		  DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
		  SimpleDateFormat sdf = new SimpleDateFormat("dd");
		  for (Object[] objects : list) {
	             String date = sdf.format((Date) objects[0]);
	             Long count=(Long) objects[1];
	             dataset.addValue(count,"numbers",date);
	             log.info("日期"+date+"员工个数"+count);
	      }
	      JFreeChart lineChart = ChartFactory.createLineChart(
	         "numbers increase by date",
	         "time",
	         "Number",
	         dataset,
	         PlotOrientation.VERTICAL,
	         true,true,false);	
	      FontUtils.setTheme();
	      return lineChart;
	   }
}
