package header

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class MonCompte {

	@Keyword
	def GoTo_CustomerZone() {
		KeywordUtil.logInfo("Click sur le lien mon compte dans le header")
		WebUI.click(findTestObject('Cdiscount Front PC/Arche/Header/MonCompte/link_MonCompte'))
	}
}
