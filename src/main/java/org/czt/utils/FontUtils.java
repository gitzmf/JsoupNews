package org.czt.utils;

import java.awt.Font;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.StandardChartTheme;

/*
 * 解决乱码
 */
public class FontUtils {
	/**
	 * 通过设置主题样式来解决乱码
	 * 建议使用这种方法
	 */	
	public static void setTheme(){
	//创建主题样式  
	   StandardChartTheme standardChartTheme=new StandardChartTheme("CN");  
	   //设置标题字体  
	   standardChartTheme.setExtraLargeFont(new Font("隶书",Font.BOLD,20));  
	   //设置图例的字体  
	   standardChartTheme.setRegularFont(new Font("宋书",Font.PLAIN,15));  
	   //设置轴向的字体  
	   standardChartTheme.setLargeFont(new Font("宋书",Font.PLAIN,15));  
	   //应用主题样式  
	   ChartFactory.setChartTheme(standardChartTheme); 
	}
}
