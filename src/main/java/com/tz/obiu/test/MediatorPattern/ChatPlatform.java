package com.tz.obiu.test.MediatorPattern;

public class ChatPlatform extends Mediator {

	@Override
	void sendToAll(String msg) {
		// TODO Auto-generated method stub
		for (User u : list) {
			u.accept(msg);
		}
	}

	@Override
	void senToPerson(String msg, String name) {
		// TODO Auto-generated method stub
		for (User u : list) {

			if (u.name.equals(name))
				u.accept(msg);
		}
	}

	@Override
	void join(User user) {
		// TODO Auto-generated method stub
		list.add(user);
	}

	@Override
	void leave(User user) {
		// TODO Auto-generated method stub
		list.remove(user);
	}

}
