package com.tz.obiu.test.MediatorPattern;

/**
 * @author Administrator
 *定义一个中介对象来封装一系列对象之间的交互，使原有对象之间的耦合松散，且可以独立地改变它们之间的交互。中介者模式又叫调停模式，它是迪米特法则的典型应用。
 */
public class MediatorPatternDemo {
	public static void main(String[] args) {

		Mediator chatPlatform = new ChatPlatform();
		NormalUser a = new NormalUser("A", chatPlatform);
		NormalUser b = new NormalUser("B", chatPlatform);
		NormalUser c = new NormalUser("C", chatPlatform);
		a.join();
		b.join();
		c.join();
		System.out.println("-----------------A群发送消息- - - - - - - - - - - - - - ");
		a.sendToAll("A：大家听得到吗?");
		System.out.println("-----------------A给B私发消息- - - - - - - - - - - - - - ");
		a.senToPerson("A：B,我只想和你说", "B");
		System.out.println("-----------------B给A私发消息- - - - - - - - - - - - - - ");
		b.senToPerson("B:可以，请说", "A");
		System.out.println("-----------------A离开聊天室- - - - - - - - - - - - - - ");
		a.leave();

		System.out.println("-----------------B群发送消息- - - - - - - - - - - - - - -");
		b.sendToAll("B:A能听到吗");

	}
}
