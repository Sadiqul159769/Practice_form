package Form_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Froms {
    WebDriver driver;
    @BeforeTest
    public void setup(){
        driver= new ChromeDriver();
        driver.manage().window();
        driver.get("https://demoqa.com/");
    }
    @Test
    public  void getElement() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement elements= driver.findElement(By.xpath("//div[@class='home-body']//div[2]//div[1]//div[1]"));
        elements.click();


       WebElement pressForm= driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
       pressForm.click();

        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(1000);

       WebElement pressPracticeFrom= driver.findElement(By.xpath("//span[@class='text'][contains(.,'Practice Form')]"));
        pressPracticeFrom.click();

       WebElement fName= driver.findElement(By.xpath("//input[@id='firstName']"));
        fName.sendKeys("Test");
       WebElement lName= driver.findElement(By.xpath("//input[@id='lastName']"));
        lName.sendKeys("Name");

       WebElement email= driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("Test@gmail.com");

       WebElement gender= driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        gender.click();

        WebElement number= driver.findElement(By.xpath("//input[@id='userNumber']"));
        number.sendKeys("0152141792");

        WebElement dob= driver.findElement(By.xpath("//input[contains(@id,'dateOfBirthInput')]"));
        dob.clear();
        dob.sendKeys("25 jan 1997");

        WebElement subject= driver.findElement(By.className("subjects-auto-complete__control css-yk16xz-control"));
        subject.sendKeys("SQA");

        WebElement hobby= driver.findElement(By.xpath("//label[contains(@for,'hobbies-checkbox-1')]"));
        hobby.click();

        WebElement picture= driver.findElement(By.xpath("//input[@id='uploadPicture']"));
        picture.sendKeys("D:\\Demo_Qa\\Practice_form\\src\\test\\resources\\sampleFile (1).jpeg");

        WebElement cAdress= driver.findElement(By.xpath(""));
        cAdress.sendKeys("kosaibari");



    }
}
