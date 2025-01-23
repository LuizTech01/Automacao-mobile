import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\luizf\\OneDrive\\Documents\\Automacao-mobile\\product_registration.apk', true)

Mobile.tap(findTestObject('Aumenta amount obj/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Aumenta amount obj/android.widget.Button - NEW'), 0)

Mobile.setText(findTestObject('Aumenta amount obj/android.widget.EditText'), '1', 0)

Mobile.setText(findTestObject('Aumenta amount obj/android.widget.EditText (1)'), 'Caneta azul', 0)

Mobile.setText(findTestObject('Aumenta amount obj/android.widget.EditText (2)'), 'Caixa com 12', 0)

Mobile.setText(findTestObject('Aumenta amount obj/android.widget.EditText (3)'), '100', 0)

Mobile.setText(findTestObject('Aumenta amount obj/android.widget.EditText (4)'), '1.5', 0)

Mobile.setText(findTestObject('Aumenta amount obj/android.widget.EditText (5)'), '456789', 0)

Mobile.tap(findTestObject('Aumenta amount obj/android.widget.Button - SAVE'), 0)

Mobile.tap(findTestObject('Aumenta amount obj/android.widget.Button - AMOUNT'), 0)

Mobile.setText(findTestObject('Aumenta amount obj/android.widget.EditText (6)'), '50', 0)

Mobile.setText(findTestObject('Aumenta amount obj/android.widget.EditText (7)'), 'Reabastecimento apos nova remessa recebida', 
    0)

Mobile.setText(findTestObject('Aumenta amount obj/android.widget.EditText (8)'), 'NF-12345', 0)

Mobile.tap(findTestObject('Aumenta amount obj/android.widget.Button - SAVE (1)'), 0)

WebUI.delay(6)

Mobile.closeApplication()

