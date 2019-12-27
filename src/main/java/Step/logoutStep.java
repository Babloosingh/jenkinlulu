package Step;
import org.openqa.selenium.By;
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
	
	
	@Step(" Click On My Profile")
	public static void ClickOnMyProfile() {
		click("id",logoutPo.MY_PROFILE);
	}
	
	@Step
	public static boolean isTextPresent(String textToIdentify) {
		boolean isPresent = false;
		try {
			if (driver.findElement(By.xpath("//*[@text='" + textToIdentify + "']")).isDisplayed())
				isPresent = true;
			else if (driver.findElement(
					By.xpath("//*[translate(@text,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')='"
							+ textToIdentify.toLowerCase() + "']"))
					.isDisplayed())
			isPresent = true;
			System.out.println("Text_is_Present:- " + textToIdentify);
		} catch (Exception e1) {
			System.out.println("Text_is_Not_Present:- " + textToIdentify);
		}
		return isPresent;
	}	
	
	
	
	
	@Step
	public static boolean isTextPresentlst(String textToIdentify) {
		boolean isPresent = false;
		try {
			if (driver.findElement(By.xpath("//*[@text='" + textToIdentify + "']")).isDisplayed())
				isPresent = true;
			else if (driver.findElement(
					By.xpath("//*[translate(@text,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')='"
							+ textToIdentify.toLowerCase() + "']"))
					.isDisplayed())
			isPresent = true;
			System.out.println("Text_is_Present:- " + textToIdentify);
		} catch (Exception e1) {
			System.out.println("Text_is_Not_Present:- " + textToIdentify);
		}
		return isPresent;
	}	
	
	
	
	// @ End for verify the Name of Users
	
	@Step(" Click On Back My Profile")
	public static void ClickOnBackMyProfile() {
		click("id",logoutPo.MYBACK_PROFILE);

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
