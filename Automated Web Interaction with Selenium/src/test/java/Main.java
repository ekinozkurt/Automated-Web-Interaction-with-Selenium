import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450)","");

        WebElement ele = driver.findElement(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[2]//*[name()='svg']"));
        ele.click();

        WebElement webTab = driver.findElement(By.xpath("//span[normalize-space()='Web Tables']"));
        webTab.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //driver.get("https://demoqa.com/webtables");

        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();

        WebElement fN = driver.findElement(By.xpath("//input[@id='firstName']"));
        fN.click();
        fN.sendKeys("Ekin");

        WebElement lN = driver.findElement(By.xpath("//input[@id='lastName']"));
        lN.click();
        lN.sendKeys("Özkurt");

        WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
        age.click();
        age.sendKeys("23");

        WebElement eMail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        eMail.click();
        eMail.sendKeys("ekinozkurt1@gmail.com");

        WebElement sal = driver.findElement(By.xpath("//input[@id='salary']"));
        sal.click();
        sal.sendKeys("15000");

        WebElement dep= driver.findElement(By.xpath("//input[@id='department']"));
        dep.click();
        dep.sendKeys("Engineer");

        WebElement sub = driver.findElement(By.xpath("//button[@id='submit']"));
        sub.click();

        driver.quit();


    }
}
