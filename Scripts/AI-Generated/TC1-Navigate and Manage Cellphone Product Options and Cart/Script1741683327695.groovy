import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on div productItemWrapper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_productItemWrapper'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on div productItemWrapper.png')

"Step 3: Click on div productDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_productDetails'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on div productDetails.png')

"Step 4: Click on link productTitle -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_productTitle'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on link productTitle - Navigate to page productproduct.png')

"Step 5: Click on label colorOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_colorOption'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on label colorOption.png')

"Step 6: Click on div swiperButtonNext"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_swiperButtonNext'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on div swiperButtonNext.png')

"Step 7: Click on div swiperButtonNext"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_swiperButtonNext'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on div swiperButtonNext.png')

"Step 8: Click on div swiperButtonNext"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_swiperButtonNext'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on div swiperButtonNext.png')

"Step 9: Click on label storageOption256GB"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_storageOption256GB'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on label storageOption256GB.png')

"Step 10: Click on label storageOption512GB"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_storageOption512GB'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on label storageOption512GB.png')

"Step 11: Click on button buyProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buyProduct'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on button buyProduct.png')

"Step 12: Click on link placeOrder -> Navigate to page 'cart#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on link placeOrder - Navigate to page cartcart.png')

"Step 13: Click on button increaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_increaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on button increaseQuantity.png')

"Step 14: Click on button decreaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_decreaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on button decreaseQuantity.png')

"Step 15: Click on div quantityInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/div_quantityInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on div quantityInput.png')

"Step 16: Click on div quantityInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/div_quantityInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on div quantityInput.png')

"Step 17: Click on button removeItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_removeItem'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on button removeItem.png')

"Step 18: Click on button removeItem2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_removeItem2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on button removeItem2.png')

"Step 19: Click on link homePage -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_homePage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on link homePage - Navigate to page .png')

"Step 20: Click on button homeAction"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_homeAction'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on button homeAction.png')

"Step 21: Click on link cartSummary -> Navigate to page 'cart#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_cartSummary'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on link cartSummary - Navigate to page cartcart.png')

"Step 22: Click on link homePage -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_homePage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on link homePage - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate and Manage Cellphone Product Options and Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}