package Login;

import java.util.concurrent.TimeUnit;

public class GmailLogin {

    public static <WebDriver> void main (String [] args) {

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");

        // Initialize the ChromeDriver
        WebDriver driver=new ChromeDriver();

        //Navigate to a website
        driver.get("https://mail.google.com/mail/u/0/#inbox");

        //waiting time to page loading
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //to enter the email
        driver.findElement(By.cssSelector("#identifierId")).sendKeys("nethuesh@gmail.com");

        //to click the next button
        driver.findElement(By.cssSelector("#identifierNext > div > button > span")).click();

        //to enter the password
        driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("SoftwareQA@123");

        //to enter the next button
        driver.findElement(By.cssSelector("#passwordNext > div > button > span")).click();

        // Close the browser when done
        //driver.quit();
    }
}
