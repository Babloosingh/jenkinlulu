package feature;

import Step.locationDeliveryStep;
import io.qameta.allure.Step;

public class locationDeliveryFeature extends locationDeliveryStep{
	@Step("Open to Delivery Locations")
	public void GoToDeliveryMap() {
		ClickOnHomeMapButton();
		ClickOnDeliveryLocation();
//		SelectCountry();
//		SelectCity();
		SelecsaveButton();
		ClickOnHomemapButton();
		SelecDeliveryMode();
		SaveDeliveryMode();
		clckOnDeliveryslot();
		ChooseDay();
		ChooseTme();
		ClicOnsavebuttonallslote();
		ClicOnLangauage();
		SelectUrdu();
		SelectEnglish();
		SelectSaveLangauge();
		ClickOnBackButton();
	}

}
