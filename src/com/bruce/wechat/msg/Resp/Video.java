package com.bruce.wechat.msg.Resp;

/**
 * 视频
 * 
 * @author ivhhs
 * @date 2014.10.16
 */
public class Video {
	// 媒体文件id
	private String mediaId;
	// 缩略图的媒体id
	private String thumbMediaId;

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}
}