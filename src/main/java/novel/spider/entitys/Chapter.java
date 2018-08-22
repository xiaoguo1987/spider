package novel.spider.entitys;

import java.io.Serializable;

/**
 * 小说的章节实体
 * @author LiuKeFeng
 * @date   2016年10月8日
 */
public class Chapter implements Serializable {
	private static final long serialVersionUID = -7574082095190014403L;
	private String title;
	private String url;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chapter other = (Chapter) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Chapter [title=" + title + ", url=" + url + "]";
	}
	/**
	 * 关注数
	 */
	private int fingnum; 
	/**
	 * 粉丝数
	 */
	private int fersnum;
	/**
	 * 文章数
	 */
	private int  sharenum;
	/**
	 * 字数
	 */
	private int wordsnum;
	/**
	 * 喜欢数
	 */
	private int lovessnum;

	public int getFingnum() {
		return fingnum;
	}
	/**
	 * index 0
	 * @param fingnum
	 */
	public void setFingnum(int fingnum) {
		this.fingnum = fingnum;
	}

	public int getFersnum() {
		return fersnum;
	}
	/**
	 * index 1
	 * @return
	 */
	public void setFersnum(int fersnum) {
		this.fersnum = fersnum;
	}
	public int getSharenum() {
		return sharenum;
	}
	/**
	 * 2
	 * @param sharenum
	 */
	public void setSharenum(int sharenum) {
		this.sharenum = sharenum;
	}
	public int getWordsnum() {
		return wordsnum;
	}
	/**
	 * 3
	 * @param wordsnum
	 */
	public void setWordsnum(int wordsnum) {
		this.wordsnum = wordsnum;
	}
	public int getLovessnum() {
		return lovessnum;
	}
	/**
	 * index 4
	 * @param lovessnum
	 */
	public void setLovessnum(int lovessnum) {
		this.lovessnum = lovessnum;
	}

}
