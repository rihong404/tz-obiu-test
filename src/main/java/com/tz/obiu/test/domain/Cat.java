package com.tz.obiu.test.domain;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cat implements Cloneable{
	
	private String name;
	
	protected String color;
	
	public String hobby;
	
	public Cat clone() throws CloneNotSupportedException {
		
		return (Cat) super.clone();
	}
}
