package com.bruce.wechat.msg;

/**
 * mpnews消息封装类
 * 
 * @author ivhhs
 * @date 2014.10.16
 */
public class Articles {
	private String thumb_media_id;// 图文消息缩略图的media_id,
									// 可以在上传多媒体文件接口中获得。此处thumb_media_id即上传接口返回的media_id
	private String author;// 图文消息的作者
	private String content_source_url;// 图文消息点击“阅读原文”之后的页面链接
	private String content;// 图文消息的内容，支持html标签
	private String digest;// 图文消息的描述
	private String show_cover_pic;// 是否显示封面，1为显示，0为不显示

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent_source_url() {
		return content_source_url;
	}

	public void setContent_source_url(String content_source_url) {
		this.content_source_url = content_source_url;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public String getShow_cover_pic() {
		return show_cover_pic;
	}

	public void setShow_cover_pic(String show_cover_pic) {
		this.show_cover_pic = show_cover_pic;
	}

	public String getThumb_media_id() {
		return thumb_media_id;
	}

	public void setThumb_media_id(String thumb_media_id) {
		this.thumb_media_id = thumb_media_id;
	}
}