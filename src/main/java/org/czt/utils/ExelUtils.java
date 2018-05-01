package org.czt.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.czt.NewsVo.News;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/**
 * @ClassName: ExelUtils
 * @Description:  导出Exel表的工具类
 * @author czt
 * @date 2018年4月30日
 */
public class ExelUtils {
	//声明一个Logger对象
	static Logger log = Logger.getLogger(ExelUtils.class.getName());
	public static void jxlListToExl(List<News> news) throws Exception {
		//目录
		String path = ServletActionContext.getServletContext().getRealPath("/files");
		File diskFile = new File(path);
		if(!diskFile.exists()){
			diskFile.mkdirs();
		}
		
		//产生文件名的方式：日期+四位随机数
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		int random = (int)((Math.random()*9+1)*1000);
		String outPutFileName = sdf.format(new Date())+random+".xls";		
		// 创建文件类型对象:
		File exel = new File(path + "/"+outPutFileName);
		if (!exel.exists()) {
			// 如果指定文件不存在，则新建该文件
			exel.createNewFile();
		}

		WritableWorkbook book = Workbook.createWorkbook(exel);// 创建一个新的写入工作簿
		WritableSheet sheet = book.createSheet("sheet1", 1);
		
		//表头
		List<String> tableHeader = new ArrayList<String>();
		tableHeader.add("sequ");
		tableHeader.add("title");
		tableHeader.add("keywords");
		tableHeader.add("publishdate");
		tableHeader.add("author");
		tableHeader.add("source");
		
		// 第一行写入表头
		for (int i = 0; i < tableHeader.size(); i++) {
			Label lable = new Label(i, 0, tableHeader.get(i));
			sheet.addCell(lable);
		}
	
		// 后续行写入数据
		for (int i = 0; i < news.size(); i++) {
			//得到集合news中中的一个nw
			News nw = news.get(i);
			//得到序号
			Label lable = new Label(0, i + 1, i+1+"");
			//写序号到表格中
			sheet.addCell(lable);
			//写标题
			Label lableTitle = new Label(1, i + 1, nw.getTitle());
			sheet.addCell(lableTitle);
			//写关键字
			Label lableKey = new Label(2, i + 1, nw.getKeywords());
			sheet.addCell(lableKey);
			//写日期
			Label lableDate = new Label(3, i + 1, nw.getPublishdate().toString());
			sheet.addCell(lableDate);
			//写作者
			Label lableAuthor = new Label(4, i + 1, nw.getAuthor());
			sheet.addCell(lableAuthor);
			//写来源
			Label lableSource = new Label(5, i + 1, nw.getSource());
			sheet.addCell(lableSource);
		}

		book.write();
		log.info("======数据库数据导出成功======");
		book.close();// 关闭
	}

}
