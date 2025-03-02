//package service;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class TestSelenium {
//
//    ChromeDriver driver;
//
//    @BeforeEach
//    public void setUp () {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }
//
//    @Test
//    public void testSelenium () throws InterruptedException {
//
//        driver.get("https://www.zoho.com/vi/calendar/schedule-appointments.html");
//
//        driver.findElement(By.xpath("//a[@class='zgh-login'][contains(text(),'Đăng nhập')]")).click();
//
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[contains(text(),'Đăng ký ngay')]")).click();
//
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Le Nguyen");
//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nguyen290720052020@gmail.com");
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("LeNguyen123@@");
//        driver.findElement(By.xpath("//span[@id='signup-termservice']")).click();
//        driver.findElement(By.xpath("//input[@id='signupbtn']")).click();
//
//        Thread.sleep(5000);
//        String ma = driver.findElement(By.xpath("//div[@class='za-captcha-container zs-ml34 sgfrm field-error']//div[1]")).getText();
//        driver.findElement(By.xpath("//input[@placeholder='Enter the word seen in the below image *']")).sendKeys(ma);
//
//        driver.findElement(By.xpath("//input[@id='signupbtn']")).click();
//
////        driver
//    }
//}
