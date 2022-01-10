
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;



public class instagram_msg_bomb {






        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul Agrawal\\Downloads\\chromedriver.exe");

            // if browser has to be in closed stage or running in background mode
//            ChromeOptions op= new ChromeOptions();
//            op.addArguments("headless"); 
//            WebDriver driver = new ChromeDriver(op);

            //            WebDriver driver;
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.instagram.com/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.findElement(By.className("KPnG0")).click();
            driver.findElement(By.id("email")).sendKeys("YOUR FB ACCOUNT MAIL OR PHONE");
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("PASSWORD OF FB");

            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.findElement(By.name("login")).click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[3]/button[2]")).click();

            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            driver.get("https://www.instagram.com/venkatesh_0/");
//            driver.get("https://www.instagram.com/deep.26.2/");

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/header/section/div[1]/div[1]/div/div[1]/button")).click();

            driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//            driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/textarea")).sendKeys(".");
//            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//            driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[3]/button")).click();
            int i=0;
            while(i<100){
                String str= i+" msg by automated software testing tool - Selenium ";
                driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/textarea")).sendKeys(str);
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[3]/button")).click();
                i=i+1;
            }

//            driver.close();

        }


}
