package cds.actions

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class Header_MonCompte {

	@Keyword
	def Connecte() {
		KeywordUtil.logInfo("Click sur le lien mon compte dans le header")
		WebUI.click(findTestObject('Cdiscount Front PC/Arche/Header/MonCompte/link_MonCompte'))
		WebUI.setText(findTestObject('Cdiscount CustomerZone/Authentification/input__loginEmail'), 'toto')
		WebUI.setText(findTestObject('Cdiscount CustomerZone/Authentification/input__loginPassword'), 'titi')
		WebUI.click(findTestObject('Cdiscount CustomerZone/Authentification/button_ValiderLogin'))
	}
}
