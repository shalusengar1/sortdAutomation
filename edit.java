import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class edit {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shalu\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://publisherv6.readwhere.com/home/dashboard");
		
		int size=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total frames in page- "+size);
		Thread.sleep(3000);
		//driver.switchTo().frame("FB_UI_Dialog");
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.className("FB_UI_Dialog")));
		Thread.sleep(1000);
		driver.findElement(By.id("resend")).sendKeys("kumar.gaurav@mediologysoftware.com");
		driver.findElement(By.id("signinform-password")).sendKeys("123456");
		driver.findElement(By.xpath("//form[@id='w1']//div//button[@type='submit']")).click();
		//Thread.sleep(4000);
		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("(//span[@class='fl-w'])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@class='head-link tour-btn'])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Use Guide')])")).click();
		
		driver.findElement(By.xpath("//i[@class='ri-file-copy-2-line']")).click();
		
//		driver.findElement(By.xpath("//span[normalize-space()='Publishing']")).click();
//		Thread.sleep(2000);

		//driver.findElement(By.xpath("//i[@class='ri-file-upload-line']")).click();
		//driver.findElement(By.xpath("(//span[@class='fl-w'])[1]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='ri-file-copy-2-line']")).click();
		driver.findElement(By.xpath("(//a[@class='btn-issue bg-grn '])[1]")).click();
		
		
		
	}

}
