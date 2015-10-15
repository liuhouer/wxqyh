package com.bruce.wechat.msg.Resp;

/**
 * 语音消息
 * 
 * @author ivhhs
 * @date 2014.10.16
 */
public class VoiceMessage extends BaseMessage {
	// 语音
	private Voice voice;

	public Voice getVoice() {
		return voice;
	}

	public void setVoice(Voice voice) {
		this.voice = voice;
	}
}