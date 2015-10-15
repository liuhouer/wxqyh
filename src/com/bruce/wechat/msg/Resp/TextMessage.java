package com.bruce.wechat.msg.Resp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 文本消息
 * 
 * @author ivhhs
 * @date 2014.10.16
 */
public class TextMessage extends BaseMessage {
	// 回复的消息内容
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 关注推送测试
	 * 
	 * @return
	 */
	public static String getMainMenu() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\ue409，我是学霸测试机器人，请回复数字选择服务").append("\n\n");
		buffer.append("\ue21c  砸别人家玻璃").append("\n");
		buffer.append("\ue21d  抢小孩子的糖").append("\n");
		buffer.append("\ue21e  勾引别人老婆").append("\n");
		buffer.append("\ue21f  骂别人是傻逼").append("\n\n");
		buffer.append("回复“?”返回菜单");
		return buffer.toString();
	}

	public static String getMenu1() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\ue402别人家玻璃你也砸？").append("\n");
		buffer.append("看什么看？").append("\n");
		buffer.append("还看？").append("\n");
		buffer.append("我已经举报你了！\ue152").append("\n");
		buffer.append("你准备被打屁屁吧！").append("\n\n");
		buffer.append("回复“?”返回菜单");
		return buffer.toString();
	}

	public static String getMenu2() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\ue108小孩子的东西你也抢？").append("\n");
		buffer.append("你什么素质？").append("\n");
		buffer.append("什么行为？").append("\n");
		buffer.append("下次要是还这样！").append("\n");
		buffer.append("别忘了叫上我！\ue404").append("\n\n");
		buffer.append("回复“?”返回菜单");
		return buffer.toString();
	}

	public static String getMenu3() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\ue40e啧啧啧，你什么思想？").append("\n");
		buffer.append("怎么回复这个菜单？").append("\n");
		buffer.append("吊丝气质暴露无疑！").append("\n");
		buffer.append("虽然这种行为很可耻！").append("\n");
		buffer.append("但是如果可以。。。我也想！\ue056").append("\n\n");
		buffer.append("回复“?”返回菜单");
		return buffer.toString();
	}

	public static String getMenu4() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\ue413别人又没惹你！").append("\n");
		buffer.append("你那么喜欢骂人？").append("\n");
		buffer.append("你骂过很多人吗？").append("\n");
		buffer.append("妈蛋！我经常被骂。。。").append("\n");
		buffer.append("哎，o(︶︿︶)o ！\ue406").append("\n\n");
		buffer.append("回复“?”返回菜单");
		return buffer.toString();
	}

	/**
	 * 歌曲点播使用指南
	 * 
	 * @return
	 */
	public static String getMusic() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\ue03e学霸歌曲点播操作指南").append("\n\n");
		buffer.append("回复：歌曲+歌名").append("\n");
		buffer.append("例如：歌曲离歌").append("\n");
		buffer.append("或者：歌曲离歌@信乐团").append("\n\n");
		buffer.append("回复“?”显示主菜单");
		return buffer.toString();
	}

	/**
	 * Q译通使用指南
	 * 
	 * @return
	 */
	public static String getTranslateUsage() {
		StringBuffer buffer = new StringBuffer();
		// buffer.append(XiaoqUtil.emoji(0xe148)).append("Q译通使用指南").append("\n\n");
		buffer.append("\ue00c学霸翻译使用指南").append("\n\n");
		buffer.append("译通为用户提供专业的多语言翻译服务，目前支持以下翻译方向：").append("\n");
		buffer.append("\ue513   中 -> 英\ue510").append("\n");
		buffer.append("\ue510   英 -> 中\ue513").append("\n");
		buffer.append("\ue50b   日 -> 中\ue513").append("\n\n");
		buffer.append("\ue231使用示例：").append("\n");
		buffer.append("    翻译我是工程师").append("\n");
		buffer.append("    翻译engineer").append("\n");
		buffer.append("    翻译さようなら").append("\n\n");
		buffer.append("回复“?”显示主菜单");
		return buffer.toString();
	}

	/**
	 * 人脸检测帮助菜单
	 */
	public static String getPersonFace() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\ue001学霸人脸检测使用指南").append("\n\n");
		buffer.append("\ue008发送一张清晰的照片，就能帮你分析出种族、年龄、性别等信息").append("\n");
		buffer.append("快来试试你是不是长得太着急\ue004").append("\n");
		buffer.append("回复“?”返回菜单");
		return buffer.toString();
	}

	// respContent = "<a href=\"http://www.baidu.com/\">协成官网</a>";
	public static String getGamesMenu() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\ue00a我是学霸测试机器人，请选择你要玩的游戏").append("\n");
		buffer.append("<a href=\"http://www.yi588.com/h5Game/plappybird/index.html\">像素鸟</a>").append("\n");
		buffer.append("<a href=\"http://www.yi588.com/h5Game/2048/index.html\">2048</a>").append("\n");
		buffer.append("<a href=\"http://www.yi588.com/h5Game/memory-play/index.html\">考记忆力</a>").append("\n");
		buffer.append("<a href=\"http://www.yi588.com/h5Game/doudizhu/index.html\">斗地主</a>").append("\n\n");
		buffer.append("回复“?”返回菜单");
		return buffer.toString();
	}

	/**
	 * 判断是否是QQ表情
	 * 
	 * @param content
	 * @return
	 */
	public static boolean getQQFace(String content) {
		boolean result = false;

		// 判断QQ表情的正则表达式
		String qqfaceRegex = "/::\\)|/::~|/::B|/::\\||/:8-\\)|/::<|/::\\$|/::X|/::Z|/::'\\(|/::-\\||/::@|/::P|/::D|/::O|/::\\(|/::\\+|/:--b|/::Q|/::T|/:,@P|/:,@-D|/::d|/:,@o|/::g|/:\\|-\\)|/::!|/::L|/::>|/::,@|/:,@f|/::-S|/:\\?|/:,@x|/:,@@|/::8|/:,@!|/:!!!|/:xx|/:bye|/:wipe|/:dig|/:handclap|/:&-\\(|/:B-\\)|/:<@|/:@>|/::-O|/:>-\\||/:P-\\(|/::'\\||/:X-\\)|/::\\*|/:@x|/:8\\*|/:pd|/:<W>|/:beer|/:basketb|/:oo|/:coffee|/:eat|/:pig|/:rose|/:fade|/:showlove|/:heart|/:break|/:cake|/:li|/:bome|/:kn|/:footb|/:ladybug|/:shit|/:moon|/:sun|/:gift|/:hug|/:strong|/:weak|/:share|/:v|/:@\\)|/:jj|/:@@|/:bad|/:lvu|/:no|/:ok|/:love|/:<L>|/:jump|/:shake|/:<O>|/:circle|/:kotow|/:turn|/:skip|/:oY|/:#-0|/:hiphot|/:kiss|/:<&|/:&>";
		Pattern p = Pattern.compile(qqfaceRegex);
		Matcher m = p.matcher(content);
		if (m.matches()) {
			result = true;
		}
		return result;
	}

	/**
	 * emoji表情转换(hex -> utf-16)
	 * 
	 * @param hexEmoji
	 * @return U+替换为0x（零X）
	 */
	public static String emoji(int hexEmoji) {
		return String.valueOf(Character.toChars(hexEmoji));
	}

	/**
	 * 随机笑话测试
	 */
	public static String weixinJoke() {
		String result = "\ue40d没有加载到笑话数据耶";
		Random ran = new Random();
		String content = null;
		String[] _result;
		File file = new File("/mnt/win_d/WebRoot/app/upload/userimages/Joke.txt");
		// File file = new File("http://112.124.111.3/weixinClient/Joke.txt");
		try {
			//
			if (file.isFile() && file.exists()) {
				InputStreamReader input = new InputStreamReader(new FileInputStream(file), "utf-8");
				BufferedReader reader = new BufferedReader(input);
				String line;
				while ((line = reader.readLine()) != null) {
					content += line;
				}
				_result = content.split("@");
				int count = ran.nextInt(10);
				result = _result[count];
				if (result.startsWith("null")) {
					result = result.replace("null", "").trim();
				}
				reader.close();
			}
			//
		} catch (Exception e) {
		}
		return result;
	}

	public static String getLocation() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\ue036  学霸周边使用说明").append("\n\n");
		buffer.append("1）发送地理位置").append("\n");
		buffer.append("点击窗口底部的“+”按钮，选择“位置”，点“发送”").append("\n\n");
		buffer.append("2）指定关键词搜索").append("\n");
		buffer.append("格式：周边+关键词，例如:\n周边ATM\ue154\n周边KTV\ue03c\n周边厕所\ue309\n");
		return buffer.toString();
	}

	public static String RobotService() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\ue052  学霸半智能机器人为您服务，咱们开始聊天吧").append("\n\n");
		buffer.append("\ue231  讲个笑话").append("\n");
		buffer.append("\ue231  历史今天").append("\n");
		buffer.append("\ue231  周边").append("\n");
		buffer.append("回复“?”显示主菜单");
		return buffer.toString();
	}

	public static String GetBusService() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\ue159  学霸公交查询为您服务，按如下提示回复查询").append("\n\n");
		buffer.append("\ue234  学霸公交线路查询:").append("\n");
		buffer.append("  输入:城市-线路名").append("\n");
		buffer.append("  提示:长沙-159").append("\n\n");
		buffer.append("\ue234  学霸公交换乘查询:").append("\n");
		buffer.append("  输入:城市，起点-终点").append("\n");
		buffer.append("  提示:长沙，樟树屋-世界之窗").append("\n");
		buffer.append("回复“?”显示主菜单");
		return buffer.toString();
	}

	public static String GetWeatherService() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\ue049  学霸天气查询为您服务，按如下提示回复查询").append("\n\n");
		buffer.append("  输入:城市天气").append("\n");
		buffer.append("  提示:长沙天气").append("\n\n");
		buffer.append("回复“?”显示主菜单");
		return buffer.toString();
	}

	public static String GetTrainService() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\ue039  学霸火车查询为您服务，按如下提示回复查询").append("\n\n");
		buffer.append("\ue231火车车次查询:").append("\n");
		buffer.append("  输入:火车车次").append("\n");
		buffer.append("  提示:火车T289").append("\n\n");
		buffer.append("\ue231火车车票查询:").append("\n");
		buffer.append("  输入:发站到终站,查询哪天的票").append("\n");
		buffer.append("  提示:长沙到深圳,2014-07-30").append("\n\n");
		buffer.append("回复“?”显示主菜单");
		return buffer.toString();
	}

	public static String GetExpressService() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\ue42f  学霸快递查询为您服务，按如下提示回复查询").append("\n\n");
		buffer.append("  输入:快递名称-单号").append("\n");
		buffer.append("  提示:顺丰-575677355677").append("\n\n");
		buffer.append("回复“?”显示主菜单");
		return buffer.toString();
	}

	public static void main(String[] args) {
		System.out.println(weixinJoke());
	}
}
