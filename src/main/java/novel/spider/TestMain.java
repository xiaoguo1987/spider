package novel.spider;

import novel.spider.configuration.Configuration;
import novel.spider.entitys.Chapter;
import novel.spider.impl.BxwxChapterSpider;
import novel.spider.impl.JanShuNovelDownload;
import novel.spider.impl.NovelDownload;
import novel.spider.interfaces.IChapterSpider;
import novel.spider.interfaces.INovelDownload;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName: TestMain
 * @description: TODO
 * @author: jianming.guo
 * @service
 * @version:V1.0.0
 * @date: 2019-07-13 21 36
 **/
public class TestMain {

	public static void main(String[] arg) {

		INovelDownload download = new NovelDownload();
		//JanShuNovelDownload download = new JanShuNovelDownload();
		Configuration config = new Configuration();
		String path = "C:/Users/xiaoguo/Documents/githubStudent/xiaoshuo-java/";
		//String url= "https://www.biquke.com/bq/43/43961/";
		String url = "http://www.biquge.cm/11/11856/";
		config.setPath(path);
		config.setSize(40);
		config.setTryTimes(3);
		System.out.println("下载好了，文件保存在：" + download.download(url, config) + "这里，赶紧去看看吧！");

		try {
			IChapterSpider spider = new BxwxChapterSpider();
			//List<Chapter> chapters = spider.getsChapter("http://www.qiuwu.net/html/267/267205/");
			List<Chapter> chapters = spider.getsChapter("http://www.biquge.cm/11/11856/");
			for (Chapter chapter : chapters) {
				System.out.println(chapter);
			}
		} catch (Exception e) {
			System.out.println("down fail:e=" +e.getMessage());
		}
	}
}
