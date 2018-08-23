package com.jdromeda.widgets.util;

public class Util {

	private static long idCounter = 0;

	public static synchronized String createID()
	{
	    return String.valueOf(idCounter++);
	}  
}
