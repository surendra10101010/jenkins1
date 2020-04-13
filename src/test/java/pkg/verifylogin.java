package pkg;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifylogin {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "src/test/resources/resources/chromedriver.exe";
    public WebDriver driver ; 

	  
 @Test
  public void test1() throws InterruptedException {
   //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	  System.out.println("start"); 
	  System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get(baseUrl);
     // String expectedTitle = "Welcome: Mercury Tours";
     // String actualTitle = driver.getTitle();
      //Assert.assertEquals(actualTitle, expectedTitle);
      Thread.sleep(1000);
      driver.close();
      System.out.println("done"); 
  }
	

 
}
