package DataDrivenTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDRCalculationAutomation {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-mysore/fixed-deposit-calculator-SBM-BSB007.html?classic=true");
		driver.manage().window().maximize();

		String filePath = System.getProperty("user.dir")+"\\TestData\\FDRCalculation.xlsx";
		int rows = ExcelUtils.getRowCount(filePath,"Sheet1");
		//Reading Data row 0 to ....here row 1 is header and cell starts from 0........

		for(int i = 1; i<=rows;i++)
		{
			String principalvalue = ExcelUtils.getCellData(filePath, "Sheet1",i,0);
			String rateOfInterest = ExcelUtils.getCellData(filePath, "Sheet1",i,1);
			String period1 = ExcelUtils.getCellData(filePath, "Sheet1",i,2);
			String period2 = ExcelUtils.getCellData(filePath, "Sheet1",i,3);
			String frequency = ExcelUtils.getCellData(filePath, "Sheet1",i,4);

			String expected_maturity_value = ExcelUtils.getCellData(filePath, "Sheet1",i,5);

			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principalvalue);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateOfInterest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
			Select select = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			select.selectByVisibleText(period2);

			Select select1 = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			select1.selectByVisibleText(frequency);

			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
			String actual_maturity_value =driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(actual_maturity_value)==Double.parseDouble(expected_maturity_value)) 
			{
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Passed");
				ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 7);
			}
			else
			{
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Failed");
				ExcelUtils.fillRedColor(filePath, "Sheet1", i, 7);
			}

          driver.findElement(By.xpath("//img[@class='PL5']")).click();
		}
		driver.quit();

	}

}
