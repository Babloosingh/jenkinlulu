package test;

import org.testng.annotations.Test;

import feature.logoutFeature;

public class logoutTest extends logoutFeature{
	@Test(description ="Logout Succesfully")
	public void ValideLogout() {
		gotoLogoutUser();
		
	}

}
