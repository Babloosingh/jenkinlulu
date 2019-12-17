package feature;

import Step.logoutStep;
import io.qameta.allure.Step;

public class logoutFeature extends logoutStep{
	@Step ("Go to Logout Pages")
	public void gotoLogoutUser() {
		ClickOnSearchTextfield();
		ClickOnCancelButton();
		ClickOnMeanuButton();
		ClickOnMyRegterd();
		ClickOnLogoutButton();
		
	
}

}
