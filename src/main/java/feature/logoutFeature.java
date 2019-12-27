package feature;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import Step.logoutStep;
import io.qameta.allure.Step;
import po.logoutPo;

public class logoutFeature extends logoutStep{
	@Step ("Go to Logout Pages")
	public void gotoLogoutUser() {
		ClickOnSearchTextfield();
		ClickOnCancelButton();
		ClickOnMeanuButton();
		ClickOnMyRegterd();
		//@ for verify Name below		
		ClickOnMyProfile();
		assert logoutStep.isTextPresent("babloosingh");	
		assert logoutStep.isTextPresentlst("singh");
		ClickOnBackMyProfile();
		ClickOnLogoutButton();
		
		
		
		
		
	
}

}
