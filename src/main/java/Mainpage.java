import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 11/06/2017.
 */
public class Mainpage extends BaseMain {
    public String isonHome() {
return driver.getCurrentUrl();
    }
    public Registrationpage MyAccount() {
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.xpath(".//*[@id='account-overlay']/ul/li[2]/a")).click();
        System.out.println("it's click on register page----");

        return new Registrationpage();
    }

}
