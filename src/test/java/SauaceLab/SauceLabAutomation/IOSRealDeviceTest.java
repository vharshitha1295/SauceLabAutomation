package SauaceLab.SauceLabAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;

public class IOSRealDeviceTest {
  @Test
  public void realDeviceIOS() throws MalformedURLException, InterruptedException {
	  MutableCapabilities caps = new MutableCapabilities();
	  caps.setCapability("platformName", "iOS");
	  caps.setCapability("appium:app", "storage:filename=iOS.RealDevice.SauceLabs.Mobile.Sample.app.2.7.1.ipa");  // The filename of the mobile app
	  caps.setCapability("appium:deviceName", "iPhone.*");
	  caps.setCapability("appium:automationName", "XCUITest");
	  MutableCapabilities sauceOptions = new MutableCapabilities();
	  //add keys here
	  sauceOptions.setCapability("build", "build-001");
	  sauceOptions.setCapability("name", "RealDeviceIOSTest");
	  caps.setCapability("sauce:options", sauceOptions);

	  URL url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
	  IOSDriver driver = new IOSDriver(url, caps);
	  Thread.sleep(5000);
	  driver.quit();
  }
}
