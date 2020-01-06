package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class Testutil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT=20;
	public  static long IMPLICITLY_TIMEOUT=10;
	
	public static void THREAD(int seconds) throws Throwable
	{
		Thread.sleep(seconds);
	}
}
