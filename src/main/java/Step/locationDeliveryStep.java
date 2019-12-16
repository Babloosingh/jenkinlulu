package Step;

import AndroidSetup.AndroidSetup;
import io.qameta.allure.Step;
import po.locationDeliveryPo;

public class locationDeliveryStep extends AndroidSetup{
	
	@Step("Click On Home Map Button")
	public static void ClickOnHomeMapButton() {
		click("xpath",locationDeliveryPo.DELIVERYMAP_HOMEBUTTON);
	}
	
	@Step("Click On Delivery Location")
	public static void ClickOnDeliveryLocation() {
		click("id",locationDeliveryPo.DELIVERY_LOCATION);
	}
//	@Step("Click On slect country")
//	public static void SelectCountry() {
//		click("xpath",locationDeliveryPo.SELECT_COUNTRY);
//	}
	
//	@Step("Click On slect city")
//	public static void SelectCity() {
//		click("xpath",locationDeliveryPo.SELECT_CITY);
//	}
	
	@Step("Click On save button")
	public static void SelecsaveButton() {
		click("id",locationDeliveryPo.SAVE_BUTTON);
	}
	
	@Step("Go to On Home map")
	public static void ClickOnHomemapButton() {
		click("xpath",locationDeliveryPo.DELIVERYMAP_HOMEBUTTON);
	}

	
	@Step("Selec Delivery Mode ")
	public static void SelecDeliveryMode() {
		click("id",locationDeliveryPo.DELIVERY_MODE);
	}
	
	
	@Step("save Delivery Mode ")
	public static void SaveDeliveryMode() {
		click("id",locationDeliveryPo.SAVE_DELIVERYMODE);
	}
	
	@Step("Selec Delivery slot ")
	public static void clckOnDeliveryslot() {
		click("id",locationDeliveryPo.DELIVERY_SLOT);
	}
	@Step("Choose to day ")
	public static void ChooseDay() {
		click("xpath",locationDeliveryPo.SATURDAY_21DECEMBER);
	}
	
	@Step("Choose to day ")
	public static void ChooseTme() {
		click("xpath",locationDeliveryPo.TIME_SLOTE);
	}
	@Step("Save to All slot ")
	public static void ClicOnsavebuttonallslote() {
		click("id",locationDeliveryPo.SAVE_ALLSLOTE);
	}

	
	@Step("Click On Langauage ")
	public static void ClicOnLangauage() {
		click("id",locationDeliveryPo.LANGAUAGE_SELECT);
	}
	
	@Step("Click On Urdu ")
	public static void SelectUrdu() {
		click("id",locationDeliveryPo.URUDU_SELECT);
	}
	
	@Step("Click On English ")
	public static void SelectEnglish() {
		click("id",locationDeliveryPo.ENGLISH_SELECT);
	}
	@Step("Click On Save Language")
	public static void SelectSaveLangauge() {
		click("id",locationDeliveryPo.SAVE_LANGAUAGE);
	}	
	@Step("Click On Back Button")
	public static void ClickOnBackButton() {
		click("id",locationDeliveryPo.BACK_BUTTON);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
}
