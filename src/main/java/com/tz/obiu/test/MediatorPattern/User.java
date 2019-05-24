package com.tz.obiu.test.MediatorPattern;

public abstract class User {
	protected Mediator mediator;
	String name;

	// 在创建对象的时候就把他的中间者传入，他要发送都是通过这个中介者来做的。
	public User(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}

	abstract void sendToAll(String msg);// 给所有人发消息

	abstract void senToPerson(String msg, String name);// 给某个人发送消息

	abstract void accept(String msg);// 接受消息

	abstract void join();// 加入聊天室

	abstract void leave();// 离开聊天室
}
