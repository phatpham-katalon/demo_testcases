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

"Step 1: Navigate to * with params (itm campaign, itm medium, itm source, spid)"

TrueTestScripts.navigate("${path_param_1}", ["itm_campaign": var_itm_campaign, "itm_medium": var_itm_medium, "itm_source": var_itm_source, "spid": var_spid])

"Step 2: Click on link ProductDetail -> Navigate to page 'vietnamese folk tales#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_world_folk_tales/link_ProductDetail'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link ProductDetail - Navigate to page vietnamese folk tales.png')

"Step 3: Click on button BuyNow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_vietnamese_folk_tales/button_BuyNow'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on button BuyNow.png')

"Step 4: Click on input PhoneNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_vietnamese_folk_tales/input_PhoneNumber'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on input PhoneNumber.png')

"Step 5: Enter input value in input PhoneNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_vietnamese_folk_tales/input_PhoneNumber'), input_PhoneNumber)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Enter input value in input PhoneNumber.png')

"Step 6: Click on button Continue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_vietnamese_folk_tales/button_Continue'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on button Continue.png')

"Step 7: Click on input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_vietnamese_folk_tales/input_Password'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on input Password.png')

"Step 8: Click on p LoginWithSMS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_vietnamese_folk_tales/p_LoginWithSMS'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on p LoginWithSMS.png')

"Step 9: Enter input value in input VerificationCode1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_vietnamese_folk_tales/input_VerificationCode1'), input_VerificationCode1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Enter input value in input VerificationCode1.png')

"Step 10: Enter input value in input VerificationCode2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_vietnamese_folk_tales/input_VerificationCode2'), input_VerificationCode2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Enter input value in input VerificationCode2.png')

"Step 11: Enter input value in input VerificationCode3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_vietnamese_folk_tales/input_VerificationCode3'), input_VerificationCode3)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Enter input value in input VerificationCode3.png')

"Step 12: Enter input value in input VerificationCode4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_vietnamese_folk_tales/input_VerificationCode4'), input_VerificationCode4)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Enter input value in input VerificationCode4.png')

"Step 13: Enter input value in input VerificationCode5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_vietnamese_folk_tales/input_VerificationCode5'), input_VerificationCode5)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Enter input value in input VerificationCode5.png')

"Step 14: Enter input value in input VerificationCode6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_vietnamese_folk_tales/input_VerificationCode6'), input_VerificationCode6)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Enter input value in input VerificationCode6.png')

"Step 15: Click on button Verify -> Navigate to page 'payment checkout#checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_vietnamese_folk_tales/button_Verify'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on button Verify - Navigate to page payment checkoutcheckoutpayment.png')

"Step 16: Click on label PaymentMethod"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_payment_checkout/label_PaymentMethod'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on label PaymentMethod.png')

"Step 17: Click on div DeliveryMethod"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_payment_checkout/div_DeliveryMethod'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on div DeliveryMethod.png')

"Step 18: Click on div DeliveryMethod"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_payment_checkout/div_DeliveryMethod'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on div DeliveryMethod.png')

"Step 19: Click on button PlaceOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_payment_checkout/button_PlaceOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on button PlaceOrder.png')

"Step 20: Click on link ChangePaymentMethod -> Navigate to page 'repayment payment checkout#checkout/payment/repayment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_payment_checkout/link_ChangePaymentMethod'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on link ChangePaymentMethod - Navigate to page repayment payment checkoutcheckoutpaymentrepayment.png')

"Step 21: Click on link Home -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment/repayment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_repayment_payment_checkout/link_Home'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on link Home - Navigate to page .png')

"Step 22: Click on span Account"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_Account'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on span Account.png')

"Step 23: Click on link AccountInfo -> Navigate to page 'edit account customer#customer/account/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_AccountInfo'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Click on link AccountInfo - Navigate to page edit account customercustomeraccountedit.png')

"Step 24: Click on link OrderHistory -> Navigate to page 'history order sales#sales/order/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'customer/account/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_edit_account_customer/link_OrderHistory'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on link OrderHistory - Navigate to page history order salessalesorderhistory.png')

"Step 25: Click on link ProductReview -> Navigate to page 'review-hub#review-hub'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sales/order/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_history_order_sales/link_ProductReview'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Click on link ProductReview - Navigate to page review-hubreview-hub.png')

"Step 26: Click on span AccountHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'review-hub?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_review_hub/span_AccountHeader'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Click on span AccountHeader.png')

"Step 27: Click on link Notifications -> Navigate to page 'notification customer#customer/notification'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'review-hub?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_review_hub/link_Notifications'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Click on link Notifications - Navigate to page notification customercustomernotification.png')

"Step 28: Click on link ManageOrders -> Navigate to page 'history order sales#sales/order/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'customer/notification?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notification_customer/link_ManageOrders'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Click on link ManageOrders - Navigate to page history order salessalesorderhistory.png')

"Step 29: Click on div orderStatusSections (PaymentSection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sales/order/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_history_order_sales/div_orderStatusSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_history_order_sales/div_orderStatusSections', ['div_orderStatusSections_internalText': div_orderStatusSections_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Click on div orderStatusSections PaymentSection.png')

"Step 30: Click on div OrderList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sales/order/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_history_order_sales/div_OrderList'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Click on div OrderList.png')

"Step 31: Click on link ReceiveFeedback -> Navigate to page 'review customer#customer/review'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sales/order/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_history_order_sales/link_ReceiveFeedback'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 31-Click on link ReceiveFeedback - Navigate to page review customercustomerreview.png')

"Step 32: Click on link ManageOrders -> Navigate to page 'history order sales#sales/order/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'customer/review?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_review_customer/link_ManageOrders'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Click on link ManageOrders - Navigate to page history order salessalesorderhistory.png')

"Step 33: Click on div orderStatusSections (Delivered)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sales/order/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_history_order_sales/div_orderStatusSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_history_order_sales/div_orderStatusSections', ['div_orderStatusSections_internalText': div_orderStatusSections_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Click on div orderStatusSections Delivered.png')

"Step 34: Click on div orderStatusSections (InTransit)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sales/order/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_history_order_sales/div_orderStatusSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_history_order_sales/div_orderStatusSections', ['div_orderStatusSections_internalText': div_orderStatusSections_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 34-Click on div orderStatusSections InTransit.png')

"Step 35: Click on div orderStatusSections (InProcess)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sales/order/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_history_order_sales/div_orderStatusSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_history_order_sales/div_orderStatusSections', ['div_orderStatusSections_internalText': div_orderStatusSections_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 35-Click on div orderStatusSections InProcess.png')

"Step 36: Click on link PromotionDetails -> Navigate to page 'informational#thong-tin/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sales/order/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_history_order_sales/link_PromotionDetails'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 36-Click on link PromotionDetails - Navigate to page informationalthong-tin.png')

"Step 37: Click on link PromotionDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'thong-tin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_informational/link_PromotionDetails'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 37-Click on link PromotionDetails.png')

"Step 38: Click on link FastAndReliable -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'thong-tin/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_informational/link_FastAndReliable'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 38-Click on link FastAndReliable - Navigate to page .png')

"Step 39: Click on link HomeLiving"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_HomeLiving'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 39-Click on link HomeLiving.png')

"Step 40: Click on link HomeLiving -> Navigate to page 'home living#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_HomeLiving'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 40-Click on link HomeLiving - Navigate to page home living.png')

"Step 41: Click on link HomeRepair -> Navigate to page 'home repair#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home_living/link_HomeRepair'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 41-Click on link HomeRepair - Navigate to page home repair.png')

"Step 42: Click on link MultiToolKit -> Navigate to page 'multi tool kits#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home_repair/link_MultiToolKit'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 42-Click on link MultiToolKit - Navigate to page multi tool kits.png')

"Step 43: Click on link ProductPromotion -> Navigate to page 'massage tools#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_multi_tool_kits/link_ProductPromotion'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 43-Click on link ProductPromotion - Navigate to page massage tools.png')

"Step 44: Click on button BuyNow -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_massage_tools/button_BuyNow'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 44-Click on button BuyNow - Navigate to page .png')

"Step 45: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Purchase and Manage Account in Folk Tales Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}