import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetStarted {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\shalu\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
//		project name - 28Nov , 
		
		//WebDriver driver = new ChromeDriver(options);
		//driver.get("https://timessouthnov06723-mediology-in.demo.sortd.mobi");
//		driver.manage().window().maximize();
	
//		Open url in Mobile View in chrome:-
//		
//		Map<String, String> mobileEmulation = new HashMap<>();
//		mobileEmulation.put("deviceName", "Galaxy S5");

		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("mobileEmulation", mobileEmulation);
		ChromeDriver driver = new ChromeDriver(options);
		
		Robot robot = new Robot();
	      //Press key Ctrl+Shift+i
	      robot.keyPress(KeyEvent.VK_CONTROL);
	      robot.keyPress(KeyEvent.VK_SHIFT);
	      robot.keyPress(KeyEvent.VK_I);

	      //Release key Ctrl+Shift+i
	      robot.keyRelease(KeyEvent.VK_I);
	      robot.keyRelease(KeyEvent.VK_SHIFT);
	      robot.keyRelease(KeyEvent.VK_CONTROL);
	      Thread.sleep(3000);
	      
	      Robot robot1 = new Robot();
	      //Press key Ctrl+Shift+i
	      robot1.keyPress(KeyEvent.VK_CONTROL);
	      robot1.keyPress(KeyEvent.VK_SHIFT);
	      robot1.keyPress(KeyEvent.VK_M);

	      //Release key Ctrl+Shift+i
	      robot1.keyRelease(KeyEvent.VK_M);
	      robot1.keyRelease(KeyEvent.VK_SHIFT);
	      robot1.keyRelease(KeyEvent.VK_CONTROL);
		
		
		driver.get("https://timessouthnov06723-mediology-in.demo.sortd.mobi");
		driver.manage().window().maximize();
		
		
		
//		Automate Header:=
		
//		 identify image
	      WebElement i = driver.findElement
	    	      (By.xpath("(//img[@alt='logo'])"));
	    	      // Javascript executor to check image
	    	      Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

	    	      //verify if status is true
	    	      if (p) {
	    	         System.out.println("Logo present");
	    	      } else {
	    	         System.out.println("Logo not present");
	    	         
	    	      }
	    	      
	    	      driver.findElement(By.xpath("//a[@id='topbar_icon2']")).click();
	    	      Thread.sleep(300);
	    	      driver.navigate().back();
	    	      driver.findElement(By.xpath("//a[@id='topbar_icon1']")).click();
	    	      Thread.sleep(300);
	    	      driver.navigate().back();
	    	     
	    	     driver.findElement(By.xpath("//div[@id='menu_icons_head_button']")).click();
	    	     Thread.sleep(2000);

//				Close side menu :- 
	    	     
//	    	   driver.findElement(By.id("close_vertical_menu")).click();
//	    	   JavascriptExecutor js1 = (JavascriptExecutor)driver;
//	    	   Thread.sleep(2000); 
//    	     js1.executeScript("window.scrollTo(0, -document.body.scrollHeight);");  
	    	     
	    	     driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Test");
	    	     driver.findElement(By.className("search_button")).click();
	    	     Thread.sleep(5000);
	    	     driver.findElement(By.id("topbar_logo")).click();
	    	     
//	    	     HOME PAGE :=
	    	     driver.findElement(By.className("header_bar_category")).isDisplayed();
	    	     
//	    	     WebElement i1 = driver.findElement
//	   	    	      (By.className("header_bar_category"));
//	   	    	      // Javascript executor to check image
//	   	    	      boolean T = (boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i1);
//
//	   	    	      //verify if status is true
//	   	    	      if (T) {
//	   	    	         System.out.println("Top Menu is visible");
//	   	    	      } else {
//	   	    	         System.out.println("Top Menu is not visible");
//	   	    	         
//	   	    	      }
//	    	     
	    	     driver.findElement(By.className("common_width")).isDisplayed();
	    	     Thread.sleep(2000);
	    	     JavascriptExecutor js1 = (JavascriptExecutor)driver;
		    	   Thread.sleep(2000); 
	    	     js1.executeScript("window.scrollTo(0, document.body.scrollHeight);"); 
	    	     
	    	     driver.findElement(By.className("main-footer")).isDisplayed();
	    	     
	    	     
		
		
		
	}

}