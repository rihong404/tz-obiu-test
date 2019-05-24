package com.tz.obiu.test.MediatorPattern;

public class NormalUser extends User {

	public NormalUser(String name, Mediator mediator) {
		super(name, mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	void sendToAll(String msg) {
		// TODO Auto-generated method stub
		mediator.sendToAll(msg);
	}

	@Override
	void senToPerson(String msg, String name) {
		// TODO Auto-generated method stub
		mediator.senToPerson(msg, name);
	}

	@Override
	void accept(String msg) {
		// TODO Auto-generated method stub
		System.out.println(this.name + "收到消息：" + msg);
	}

	@Override
	void join() {
		// TODO Auto-generated method stub
		mediator.join(this);
	}

	@Override
	void leave() {
		// TODO Auto-generated method stub
		mediator.leave(this);
	}

}
