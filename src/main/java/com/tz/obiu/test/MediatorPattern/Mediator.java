package com.tz.obiu.test.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
	List<User> list = new ArrayList<>();// 所有在聊天室里的人存这

	abstract void sendToAll(String msg);// 群发

	abstract void senToPerson(String msg, String name);// 给某个人发送消息

	abstract void join(User user);// 用户加入聊天室

	abstract void leave(User user);// 用户离开聊天室

}
