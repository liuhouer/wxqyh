package com.bruce.wechat.contacts;

import com.bruce.wechat.ParamesAPI.ParamesAPI;
import com.bruce.wechat.ParamesAPI.WeixinUtil;

/**
 * 通讯录成员管理类
 * 
 * @author ivhhs
 * @date 2014.10.16
 */
public class Person {
	// 创建成员地址
	public static String CREATE_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/create?access_token=ACCESS_TOKEN";
	// 更新成员地址
	public static String UPDATA_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/update?access_token=ACCESS_TOKEN";
	// 删滁成员地址
	public static String DELETE_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/delete?access_token=ACCESS_TOKEN&userid=ID";
	// 获取成员地址
	public static String GET_PERSON_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN&userid=ID";
	// 获取部门成员地址
	public static String GET_GROUP_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/simplelist?access_token=ACCESS_TOKEN&department_id=ID&fetch_child=0&status=0";

	/**
	 * 创建成员
	 * 
	 * @param userid
	 *            员工UserID。对应管理端的帐号，企业内必须唯一。长度为1~64个字符
	 * @param name
	 *            成员名称。长度为1~64个字符
	 * @param department
	 *            成员所属部门id列表 格式： "department": [x, y]
	 * @param position
	 *            职位信息
	 * @param mobile
	 *            手机号码。企业内必须唯一，mobile/weixinid/email三者不能同时为空
	 * @param gender
	 *            性别。gender=0表示男，=1表示女。默认gender=0
	 * @param tel
	 *            办公电话。长度为0~64个字符
	 * @param email
	 *            邮箱。长度为0~64个字符。企业内必须唯一
	 * @param weixinid
	 *            微信号。企业内必须唯一
	 * */
	public static String create(String userid, String name, String position, String mobile, String gender, String tel, String email, String weixinid) {
		String postData = "{\"userid\": %s,\"name\": %s,\"department\": [1, 2],\"position\": %s,\"mobile\": %s,\"gender\": %s,\"tel\": %s,\"email\": %s,\"weixinid\": %s}";
		return String.format(postData, userid, name, position, mobile, gender, tel, email, weixinid);
	}

	/**
	 * 更新成员
	 * 
	 * @param userid
	 *            员工UserID。对应管理端的帐号，企业内必须唯一。长度为1~64个字符
	 * @param name
	 *            成员名称。长度为1~64个字符
	 * @param department
	 *            成员所属部门id列表 格式： "department": [x]
	 * @param position
	 *            职位信息
	 * @param mobile
	 *            手机号码。企业内必须唯一，mobile/weixinid/email三者不能同时为空
	 * @param gender
	 *            性别。gender=0表示男，=1表示女。默认gender=0
	 * @param tel
	 *            办公电话。长度为0~64个字符
	 * @param email
	 *            邮箱。长度为0~64个字符。企业内必须唯一
	 * @param weixinid
	 *            微信号。企业内必须唯一
	 * @param enable
	 *            启用/禁用成员。1表示启用成员，0表示禁用成员
	 * */
	public static String update(String userid, String name, String position, String mobile, String gender, String tel, String email, String weixinid, String enable) {
		String postData = "{\"userid\": %s,\"name\": %s,\"department\": [1],\"position\": %s,\"mobile\": %s,\"gender\": %s,\"tel\": %s,\"email\": %s,\"weixinid\": %s,\"enable\": %s}";
		return String.format(postData, userid, name, position, mobile, gender, tel, email, weixinid, enable);
	}

	/**
	 * 删除成员
	 * 
	 * @param userid
	 *            员工UserID。对应管理端的帐号
	 * */
	public static String delete(String userid) {
		String delete_url = DELETE_URL.replace("ID", userid);
		return delete_url;
	}

	/**
	 * 获取成员
	 * 
	 * @param userid
	 *            员工UserID。对应管理端的帐号
	 * */
	public static String getPerson(String userid) {
		String getperson_url = GET_PERSON_URL.replace("ID", userid);
		return getperson_url;
	}

	/**
	 * 获取部门成员
	 * 
	 * @param department_id
	 *            获取的部门id
	 * @param fetch_child
	 *            1/0：是否递归获取子部门下面的成员 （可选）
	 * @param status
	 *            0获取全部员工，1获取已关注成员列表，2获取禁用成员列表，4获取未关注成员列表。status可叠加 （可选）
	 * */
	public static String getGroup(String department_id) {
		String getgroup_url = GET_GROUP_URL.replace("ID", department_id);
		return getgroup_url;
	}

	// 示例
	public static void main(String[] args) {
		/**
		 * 创建成员示例
		 * */
		// 调取凭证
		String access_token = WeixinUtil.getAccessToken(ParamesAPI.corpId, ParamesAPI.secret).getToken();
		// 拼装数据
		String postData = create("员工UserID", "Engineer-JSP", "架构师", "150xxxx8524", "0", "0731-80xxx89", "jspping@qq.com", "oYxxxxxxxxxxxxxxx26336o3");
		// 提交数据，获取结果
		int result = WeixinUtil.PostMessage(access_token, "POST", CREATE_URL, postData);
		// 打印结果
		if (0 == result) {
			System.out.println("操作成功");
		} else {
			System.out.println("操作失败");
		}

	}

}
