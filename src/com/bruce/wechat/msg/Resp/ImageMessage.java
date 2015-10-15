package com.bruce.wechat.msg.Resp;

/**
 * 图片消息
 * 
 * @author ivhhs
 * @date 2014.10.16
 */
public class ImageMessage extends BaseMessage {
	// 图片
	private Image image;

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
}