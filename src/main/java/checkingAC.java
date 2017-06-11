import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by Sudhakar on 11/06/2017.
 */
public class checkingAC extends BaseMain {
    public void accountvf() {
       String actual_account= driver.findElement(By.xpath(".//*[@id='toggle-account-selector']/li[1]/a")).getText();
        String expect_account="raju";
//        Type-1
        Assert.assertEquals(actual_account,expect_account);
//        Type-2
//        Assert.assertTrue(actual_account.contains("hounslow"));
        System.out.println("IT'S LOGGED IN SUCCESSFULLY---"+expect_account);


   }
}
