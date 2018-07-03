package mvc;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDataUtil {
	
	public static List<Element> getWebElement() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/israelmesa/Desktop/ChromeDriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://finance.yahoo.com/cryptocurrencies?count=120");
		
		String xpath = "//*[@id=\"scr-res-table\"]/table/tbody/tr[*]";
		
        List<WebElement> tableRows = driver.findElements(By.xpath(xpath)); 
        
        List<Element> rows = new ArrayList<>();
        
        for (int i = 0; i < 112; i++) {
            rows.add(new Element(tableRows.get(i).getText()));
        }

//       driver.quit();
        
        return rows;
		
	}

}
