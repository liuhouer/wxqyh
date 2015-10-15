package com.bruce.wechat.msg.Resp;

/**
 * 视频消息
 * 
 * @author ivhhs
 * @date 2014.10.16
 */
public class VideoMessage extends BaseMessage {
	// 视频
	private Video video;

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}
}