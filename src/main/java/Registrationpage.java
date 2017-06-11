import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Sudhakar on 11/06/2017.
 */

public class Registrationpage extends BaseMain {
    public String randomEmail(int length) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz1234567890";
        String emaill = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        emaill = temp.substring(0, temp.length() - 9) + "@gmail.com";
        return emaill;
    }

    public checkingAC enteringfield() {
        System.out.println("it's entering to the fields");
        driver.findElement(By.xpath(".//*[@id='registerPanel']/div/form/div[1]/div[1]/input")).sendKeys("rajukumar");
        driver.findElement(By.xpath(".//*[@id='registerPanel']/div/form/div[1]/div[2]/input")).sendKeys("07589465229");
        driver.findElement(By.xpath(".//*[@id='registerPanel']/div/form/div[1]/div[3]/input")).sendKeys(randomEmail(15));
        driver.findElement(By.xpath(".//*[@id='registerPanel']/div/form/div[2]/div[1]/div/input")).sendKeys("hedrdj124");
        driver.findElement(By.xpath(".//*[@id='register_postcodeLookup']")).sendKeys("E12 5DF");
        driver.findElement(By.xpath(".//*[@id='registerPanel']/div/form/div[1]/div[4]/a")).click();
        new Select(driver.findElement(By.xpath(".//*[@id='registerPanel']/div/form/div[1]/div[5]/select"))).selectByIndex(14);
        driver.findElement(By.xpath(".//*[@id='registerPanel']/div/form/div[1]/div[6]/label[1]/input")).click();
        driver.findElement(By.xpath(".//*[@id='registerPanel']/div/form/div[3]/button")).click();
        return new checkingAC();

    }
}
