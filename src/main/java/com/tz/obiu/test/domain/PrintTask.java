package com.tz.obiu.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrintTask{
	
	/**
	 * 批发商Id
	 **/
	public String companyId;
	
	/**
	 * 单据id
	 **/
	public String billId;

	/**
	 * 打印机id
	 **/
	public String deviceIds;

	/**
	 * 单据类型
	 **/
	public String billType;

	/**
	 * 打印份数
	 **/
	public String copies;

}

