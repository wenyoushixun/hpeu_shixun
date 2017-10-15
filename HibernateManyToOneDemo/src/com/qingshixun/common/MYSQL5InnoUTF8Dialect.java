package com.qingshixun.common;

import org.hibernate.dialect.MySQLDialect;

public class MYSQL5InnoUTF8Dialect extends MySQLDialect {

	@Override
	public String getTableTypeString(){
		return "COLLATE='utf8_general_ci' ENGINE=InnoDB";
		}
	
}
