package customerZone

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class Login {

	@Keyword
	def ConnecterCustomerZone(String email, String pwd) {
		KeywordUtil.logInfo("Authentification Customer Zone")
		WebUI.setText(findTestObject('Cdiscount CustomerZone/Authentification/Identifiez Vous/input__loginEmail'), email)
		WebUI.setText(findTestObject('Cdiscount CustomerZone/Authentification/Identifiez Vous/input__loginPassword'), pwd)
		WebUI.click(findTestObject('Cdiscount CustomerZone/Authentification/Identifiez Vous/button_ValiderLogin'))
	}
}
