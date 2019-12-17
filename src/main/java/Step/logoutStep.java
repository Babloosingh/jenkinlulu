package Step;

import AndroidSetup.AndroidSetup;
import io.qameta.allure.Step;
import po.logoutPo;

public class logoutStep extends AndroidSetup {
	@Step(" click on searc text field")
	public static void ClickOnSearchTextfield() {
		click("xpath",logoutPo.SEARCH_TEXTFIELD);

	}
	
	@Step("Click On Cancel Button")
	public static void ClickOnCancelButton() {
		click("id",logoutPo.CANCEL_BUTTON);

	}
	
	
	@Step(" click on Meanu Button")
	public static void ClickOnMeanuButton() {
		click("xpath",logoutPo.MEANU_BUTTON);

	}
	
	
	@Step(" click on Registred")
	public static void ClickOnMyRegterd() {
		click("id",logoutPo.MY_REGISTER);

	}
	
	
	@Step(" click on LogoutButton")
	public static void ClickOnLogoutButton() {
		click("id",logoutPo.LOGOUT_BUTTON);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	
	
	
	
	
	
	

}
