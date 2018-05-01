package org.czt.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import org.czt.NewsVo.News;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 
 * @ClassName: JsoupUtils
 * @Description: 对网站进行解析和提取信息
 * @author czt
 * @date 2018年4月25日
 *
 */
public class JsoupUtils {
	static Logger log = Logger.getLogger(JsoupUtils.class.getName());
	/**
	 * 
	 * @Title: getNews @Description:得到某一部分具体的新闻 @param @param url @param @param
	 * news @param @return @param @throws Exception 参数 @return News 返回类型 @throws
	 */
	public static News getNews(String url) throws Exception {
		News news = new News();
		Document doc2 = Jsoup.connect(url).get();
		String title = doc2.title();		 
		String keywords = doc2.select("meta[name=keywords]").first().attr("content");		 
		String publishdate = doc2.select("meta[name=publishdate]").get(0).attr("content");		 
		String author = doc2.select("meta[name=author]").get(0).attr("content");		 
		String source = doc2.select("meta[name=source]").get(0).attr("content");
		//日志记录
		log.info("=======新闻内容======");
		log.info("News URL : " + url);
		log.info("News Title : " + title);
		log.info("Meta keyword : " + keywords);
		log.info("Meta publishdate : " + publishdate);
		log.info("Meta author : " + author);
		log.info("Meta source : " + source);
		//封装
		news.setTitle(title);
		news.setKeywords(keywords);
		news.setPublishdate(JsoupUtils.stringToDate(publishdate));
		news.setAuthor(author);
		news.setSource(source);
		return news;
	}

	/**
	 * 
	 * @Title: stringToDate @Description: 字符串格式化为日期 @param @param
	 * publishdate @param @return @param @throws ParseException 参数 @return Date
	 * 返回类型 @throws
	 */
	public static Date stringToDate(String publishdate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(publishdate);
	}

	/**
	 * @throws Exception
	 * 
	 * @Title: getAllhref @Description: 从指定的新闻版块下得到过滤后html结尾的超链接 @param @return
	 * 参数 @return List<String> 返回类型 @throws
	 */
	public static List<String> getAllhref(String url) throws Exception {
		List<String> urls = new ArrayList<String>();
		Document doc = Jsoup.connect(url).get();;
		Elements divs = doc.select("div#fullpage");
		for(Element div : divs) {
			Elements links = div.select("a[href]");
			for (Element link : links) {
				// 过滤掉数字报的部分链接
				if(!link.attr("abs:href").endsWith("html")){
					continue;
				}
				urls.add(link.attr("abs:href"));
			}
		}
		return urls;
	}
}
