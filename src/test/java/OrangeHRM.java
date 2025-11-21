import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrangeHRM {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


//completeaza credintiale

        WebElement userName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
//        WebElement userWait = wait.until(ExpectedConditions.elementToBeClickable(userName));
//        userWait.click();
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement passwordWait = wait.until(ExpectedConditions.elementToBeClickable(password));
        passwordWait.click();
        password.sendKeys("admin123");

//apasa buton login

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        // apasa buton PIM

        WebElement pimMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));


//        WebElement pimMenuWait = wait.until(ExpectedConditions.elementToBeClickable(pimMenu));
//        pimMenuWait.click();
        pimMenu.click();

        // cauta angajat dupa nume " Emily Jones"

        WebElement employeeName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")));
//        WebElement employeeNameWait = wait.until(ExpectedConditions.elementToBeClickable(employeeName));
//        employeeNameWait.click();
        employeeName.sendKeys("Emily Jones");

        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        WebElement searchButtonWait = wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButtonWait.click();
        searchButton.click();

//acceseaza pagina userului cautat
        WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[1]")));
//        WebElement editButtonWait = wait.until(ExpectedConditions.elementToBeClickable(editButton));
//        editButtonWait.click();
        editButton.click();

        //acceseaza Contact Details

        WebElement contactDetails = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/web/index.php/pim/contactDetails/empNumber/118']")));
//        WebElement contactDetailsWait = wait.until(ExpectedConditions.elementToBeClickable(contactDetails));
//        contactDetailsWait.click();
        contactDetails.click();

        //adauga e-mail address

        WebElement emailAddress = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[2]/div/div[2]/input")));
//        WebElement emailAddressWait = wait.until(ExpectedConditions.elementToBeClickable(emailAddress));
//        emailAddressWait.click();
        emailAddress.sendKeys("emily10@gmail.com");

        //save details

        WebElement saveDetails = driver.findElement(By.xpath("//button[@type='submit']"));
        WebElement saveDetailsWait = wait.until(ExpectedConditions.elementToBeClickable(saveDetails));
        saveDetailsWait.click();
        saveDetails.click();

        driver.quit();;






    }

}
