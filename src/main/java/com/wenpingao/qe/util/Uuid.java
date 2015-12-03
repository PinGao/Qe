package com.wenpingao.qe.util;

import java.util.UUID;

public class Uuid {
	public static String getUuid(){
		String str = (UUID.randomUUID().toString()).toLowerCase();
		String[] strs = str.split("-");
		StringBuffer sBuffer = new StringBuffer();
		for (String string : strs) {
			sBuffer.append(string);
		}
		return sBuffer.toString();
	}
}
