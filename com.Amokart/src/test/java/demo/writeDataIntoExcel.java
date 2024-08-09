package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class writeDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webDriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//convert the physical Excel File into Java UnderStandable
		FileInputStream fis = new FileInputStream("./src/test/resources/data/Waste Excel.xlsx");
		
		//Create the WorkBook
		Workbook book = WorkbookFactory.create(fis);
		
		//UsingWorkbook go to sheet.row,column and cell fetch the data
		String data = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
		
	}

}
