package com.hrms.testscript;

import org.testng.annotations.Test;

import com.hrms.lib.General;
@Test
public class TC001 {

	public static void main(String[] args) {
		General g = new General();
		g.openapplication();
		g.login();
		g.logout();
		g.close();
	}

}
