import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File f = new File("chromedriver.exe");
	        System.setProperty("webdriver.chrome.driver", f.getAbsolutePath());
	        
	        WebDriver wd = new ChromeDriver();
	        wd.get("http://www.practiceselenium.com/practice-form.html");
	        
	        wd.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452032346\"]/div/form/fieldset/div[1]/p[2]/input")).sendKeys("Adeel");
	        wd.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452032346\"]/div/form/fieldset/div[1]/p[3]/input")).sendKeys("Tallat");
	        
	        wd.findElement(By.xpath("//*[@id=\"sex-1\"]")).click();
	        wd.findElement(By.xpath("//*[@id=\"exp-3\"]")).click();
	        
	        wd.findElement(By.xpath("//*[@id=\"tea2\"]")).click();
	        wd.findElement(By.xpath("//*[@id=\"tea1\"]")).click();
	        
	        wd.findElement(By.xpath("//*[@id=\"tool-2\"]")).click();
	        
	        Select drop = new Select(wd.findElement(By.id("continents")));
	        drop.selectByIndex(3);
	
	        Select drop2 = new Select(wd.findElement(By.id("selenium_commands")));
	        drop2.selectByIndex(3);
	        drop2.selectByIndex(1);
	        
	        wd.findElement(By.id("submit")).click();
	        
	        wd.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[1]/a")).click();
	        
	        String url = wd.getCurrentUrl();
	        
	        System.out.println(url);
	        
	        
	        
	        
	}

}
