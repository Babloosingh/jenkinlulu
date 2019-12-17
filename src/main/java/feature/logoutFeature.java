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
		//ClickOnMyProfile();
		//VariFytextTitle("babloo");	
		//assertEquals(driver.findElementsById(logoutPo.VERIFY_TEXT_TITLE),"babloo");
		//ClickOnBackMyProfile();
		ClickOnLogoutButton();
		
		
	
}

}
