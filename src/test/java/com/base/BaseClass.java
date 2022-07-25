				package com.base;
				
				import java.io.File;
				import java.io.FileInputStream;
				import java.io.FileNotFoundException;
				import java.io.FileOutputStream;
				import java.io.IOException;
				import java.math.BigDecimal;
				import java.text.SimpleDateFormat;
				import java.util.Properties;
				
				import org.apache.poi.ss.usermodel.Cell;
				import org.apache.poi.ss.usermodel.CellType;
				import org.apache.poi.ss.usermodel.DateUtil;
				import org.apache.poi.ss.usermodel.Row;
				import org.apache.poi.ss.usermodel.Sheet;
				import org.apache.poi.ss.usermodel.Workbook;
				import org.apache.poi.xssf.usermodel.XSSFWorkbook;
				import org.openqa.selenium.Alert;
				import org.openqa.selenium.By;
				import org.openqa.selenium.WebDriver;
				import org.openqa.selenium.WebElement;
				import org.openqa.selenium.chrome.ChromeDriver;
				import org.openqa.selenium.firefox.FirefoxDriver;
				import org.openqa.selenium.ie.InternetExplorerDriver;
				import org.openqa.selenium.support.ui.Select;
				
				import io.github.bonigarcia.wdm.WebDriverManager;
				
				/**
				 * 
				 * @author begin
				 *@description To Maintain All The Reusable Methods
				 *@creationDate 28/06/2022
				 *
				 */
					
				public class BaseClass {
				
						public static WebDriver driver;
						
						/**
						 * 
						 * @param browserType
						 * @description Used to Launch browser
						 * @Creationdate 28/06/2022
						 * 
						 */
						
					    public static void getDriver(String browserType) {
					    	switch (browserType) {
							case "chrome":
								WebDriverManager.chromedriver().setup();
						    	driver = new ChromeDriver();
								break;
								
							case "IE":
								WebDriverManager.iedriver().setup();
						    	driver = new InternetExplorerDriver();
								break;
							case "firefox":
								WebDriverManager.firefoxdriver().setup();
						    	driver = new FirefoxDriver();
								break;
							
							default:
								break;
							}
					    	
					    }
						
					    /**
					     * 
					     * @param Url
					     * @description To launch the browser using URL
					     * @creationDate 29/06/2022
					     * 
					     */
					    
					    public static void getUrl(String Url) {
							driver.get(Url);
						}
						
					    
					    /**
					     * 
					     * @param element
					     * @param data
					     * @description	To pass the input
					     * @CreationDate 29/06/2022
					     * 
					     */
					    
						public void type(WebElement element, String data) {
							
							element.sendKeys(data);
						}
						
						/**
						 * 
						 * @param element
						 * @description To Click the Button 
						 * @CreationDate 29/06/2022
						 * 
						 */
						
						public void click(WebElement element) {
							
							element.click();
							
						}
						
						/**
						 * 
						 * @return String
						 * @description To Get the title from the WebPage
						 * @CreationDate 29/06/2022
						 * 
						 */
				
						public static String getTitle() {
							
							String title = driver.getTitle();
							return title;
							
						}
						
						
						/**
						 * 
						 * @param attributevalue
						 * @return WebElement
						 * @description To find the locator by using Id
						 * @Creationdate 29/06/2022
						 */
						
						public static WebElement findElementById(String attributevalue) {
							
							WebElement element = driver.findElement(By.id(attributevalue));
							return element;
							
						}
						
						/**
						 * 
						 * @param attributevalue
						 * @return WebElement
						 * @description To Find the locator by using Name
						 * @CreationDate 27/06/2022
						 * 
						 */
						
						
						public static WebElement findElementByName(String attributevalue) {
							
							WebElement element = driver.findElement(By.name(attributevalue));
							return element;
							
						}
						
						
						
						/**
						 * 
						 * @param attributevalue
						 * @return WebElement
						 * @description To find the locator by using ClassName
						 * @CreationDate 29/06/2022
						 * 
						 */
						public static WebElement findElementByClassName(String attributevalue) {
							
							WebElement element = driver.findElement(By.className(attributevalue));
							return element;
							
						}
					
						/**
						 * 
						 * @param xpath
						 * @return WebElement
						 * @description To Find the locator by using Xpath
						 * @CreationDate 29/06/2022
						 */
						
						public static WebElement findElementByXpath(String xpath) {
							
							WebElement element = driver.findElement(By.xpath(xpath));
							return element;
							
						}
						
						/**
						 *@Description To maximize the window 
						 *@creationDate 29/06/2022
						 */
						
						public static void maximize() {
							
							driver.manage().window().maximize();
							
						}
						
						
						/**
						 * @description To Close All the Window
						 * @creationDate 30/06/2022
						 */
						
						
						public static void closeAllWindow() {
							
							driver.quit();
						}
						
						/**
						 *@description To Close the particular window
						 * @creationDate 28/06/2022
						 */
						
						public static void closeWindow() {
							
							driver.close();
						}
						
						/**
						 * 
						 * @param element
						 * @return String
						 * @Description To get the text from the WebPage
						 * @creationDate 29/06/2022
						 */
						
						public String getText(WebElement element) {
							
							String text = element.getText();
							return text;
							
						}
						
						/**
						 * 
						 * @param element
						 * @return String 
						 * @Description To get the given text from the WebPage
						 * @creationDate 30/06/2022
						 */
						
						
						public String getAttribute(WebElement element) {
							String attribute = element.getAttribute("value");
							return attribute;
							
						}
						
						/**
						 * 
						 * @param element
						 * @param attributename
						 * @return String
						 * @description To get the value from attribute
						 * @CreationDate 30/06/2022
						 */
						
						public String getAttributeValue(WebElement element, String attributename) {
							
							String attribute = element.getAttribute(attributename);
							return attribute;
							
						}
						
						/**
						 * 
						 * @param element
						 * @param text
						 * @Description To get the text from the selected option 
						 * @CreationDate 29/06/2022
						 */
						
						public void selectOptionByText(WebElement element, String text) {
							Select select = new Select(element);
							select.selectByVisibleText(text);
							
						}
						
						/**
						 * 
						 * @param element
						 * @param value
						 * @description To select the attribute from the selected option
						 * @CreationDate 30/06/2022
						 */
						
						public void selectOptionByAttribute(WebElement element, String value) {
							
							Select select = new Select(element);
							select.selectByValue(value);
						}
						
						/**
						 * 
						 * @param element
						 * @param index
						 * @description To select the option using the index in dropdown
						 * @CreationDate 30/06/2022
						 */
						
						public void selectOptionByIndex(WebElement element, int index) {
							
							Select select = new Select(element);
							select.selectByIndex(index);
						}
						
				        /**
				         *   
				         * @param sheetName
				         * @param rownum
				         * @param cellnum
				         * @return String
				         * @throws Exception
				         * @throws IOException
				         * @Description To Get the value from Excel
				         * @Creation Date: 28/06/2022
				         */
						
						
						public String getData(String sheetName, int rownum, int cellnum) throws Exception, IOException {
							String data = null;
							File file = new File("C:\\Users\\begin\\eclipse-workspace\\MavSmple\\Lib\\Adactin.xlsx");
							Workbook workBook = new XSSFWorkbook(file);
							Sheet sheet = workBook.getSheet(sheetName);
							Row row = sheet.getRow(rownum);
							Cell cell = row.getCell(cellnum);
							CellType type = cell.getCellType();
							switch (type) {
							case STRING:
								data = cell.getStringCellValue();
								break;
							case NUMERIC:
								if (DateUtil.isCellDateFormatted(cell)) {
									data = new SimpleDateFormat("dd-MMM-yy").format(cell.getDateCellValue());
								} else {
									data = BigDecimal.valueOf(cell.getNumericCellValue()).toString();
								}
								break;
				
							default:
								break;
							}
							return data;
						}
						
						/**
						 * 
						 * @param element
						 * @param data
						 * @Description: To Send the value to the text box
						 * @Creation Date: 28/06/2022
						 */
						
						public void sendKeys(WebElement element, String data) {
							element.sendKeys(data);
						}
						
						/**
						 * 
						 * @param path
						 * @param sheetname
						 * @param rowNo
						 * @param cellNo
						 * @param Data
						 * @throws IOException
						 * @Descritpion To Insert the values to excel
						 * @Creation Date: 29/06/2022
						 */
						
						public void creatCellAndInsertValue(String path, String sheetname, int rowNo, int cellNo,String Data) throws IOException {
							File file = new File(path);
							FileInputStream stream = new FileInputStream(file);
							Workbook workbook = new XSSFWorkbook(stream);
							Sheet sheet = workbook.getSheet(sheetname);
							Row row = sheet.getRow(rowNo);
							Cell createCell = row.createCell(cellNo);
							createCell.setCellValue(Data);
							FileOutputStream outputStream = new FileOutputStream(file);
							workbook.write(outputStream);
							
							}
							
						/**
						 * 
						 * @Description: To select the OK prompt from alert box
						 * @Creation Date: 29/06/2022
						 */
						
				       public void okAlert() {
				    	   Alert alert = driver.switchTo().alert();
				    	   alert.accept();
				       }
						
				       /**
				        * @description: To Select the cancel prompt from alert box
				        * @Creation Date: 29/06/2022
				        */
				       
				       public void cancelAlert() {
						Alert alert = driver.switchTo().alert();
						alert.dismiss();
				       
				       }
				
				       /**
				        * 
				        * @param key
				        * @return String
				        * @Description To Get the property file value
				        * @Creation Date 29/06/2022
				        * @throws FileNotFoundException
				        * @throws IOException
				        */
				       
				       public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
				    		
				       	Properties properties = new Properties();
				       	properties.load(new FileInputStream(System.getProperty("user.dir")+"\\config.properties"));
				       	Object object = properties.get(key);
				       	String value = (String) object;
				       	return value;
				       	
				       }
				       
				       
				}
